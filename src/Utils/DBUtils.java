package Utils;

import Model.User;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;

import java.sql.*;

public class DBUtils {
    //    -----------------------------------
    //    Best order to close db connections => ResultSet -> PreparedStatement -> Connection
    //    -----------------------------------
    private static Connection connection = null;
    private static PreparedStatement psInsert = null;
    private static PreparedStatement psCheckUserExists = null;
    private static ResultSet resultSet = null;
    
    //    Method to sign users up
    public static void signUp(ActionEvent event, String firstName, String lastName, String email, String password,
                              String address, String nationalID) {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/students_affairs","root","mohamed");
            psCheckUserExists = connection.prepareStatement("SELECT * FROM students_affairs.students WHERE email = ?" );
            psCheckUserExists.setString(1, email); // check if the user exists
            resultSet = psCheckUserExists.executeQuery();
            
            if(resultSet.isBeforeFirst()) { // will return true if their is a content & false if the excution result
                // is empty
                FXUtils.alertUser("Authentication Problem!","User already exists!",Alert.AlertType.ERROR);
            } else { // so this user is brand new user
                //    This sign up method will sign users up as a user in level 1 term 1 and a GPA 0 and passed courses = null
                psInsert = connection.prepareStatement("INSERT INTO students_affairs.students\n" +
                        "(national_id,\n" +
                        "department_id,\n" +
                        "email,\n" +
                        "password,\n" +
                        "first_name,\n" +
                        "last_name,\n" +
                        "address,\n" +
                        "level,\n" +
                        "term,\n" +
                        "gpa,\n" +
                        "passed_courses_id)\n" +
                        "VALUES\n" +
                        "(?,'GR',?,?,?,?,?,1,1,0,null);");
                psInsert.setString(1, nationalID);
                psInsert.setString(2, email);
                psInsert.setString(3, password);
                psInsert.setString(4, firstName);
                psInsert.setString(5, lastName);
                psInsert.setString(6, address);
                psInsert.executeUpdate();
//                This is to hold user data to get it any time without reconnect db, in sign out this will be erased
                User.setUserInfo(nationalID,"GR",email,firstName,lastName,address,1,1,0,null);
                FXUtils.changeScene(event, "/View/HomeView.fxml", "Welcome");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResultSet(resultSet);
            closePreparedStatement(psCheckUserExists);
            closePreparedStatement(psInsert);
            closeConnection(connection);
        }
    }
    
    
    //    Method to sign users up
    public static void Login(ActionEvent event, String email, String password) {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/students_affairs","root","mohamed");
            psCheckUserExists = connection.prepareStatement("SELECT * FROM students_affairs.students where email = ?");
            psCheckUserExists.setString(1, email); // check if the user exists
            resultSet = psCheckUserExists.executeQuery();
            // check credentials
            if(!resultSet.isBeforeFirst())  // so no email like that provided is empty
                FXUtils.alertUser("Authentication Problem!","User doesn't exists!",Alert.AlertType.ERROR);
            else  // so this user is already exists
                while (resultSet.next()) {
                    String retrievedPassword = resultSet.getString("password");
                    if(retrievedPassword.equals(password)) {  // so this is our userd
                        String retrievedNationalID = resultSet.getString("national_id");
                        String retrievedDepartment = resultSet.getString("department_id");
                        String retrievedEmail = resultSet.getString("email");
                        String retrievedFirstName = resultSet.getString("first_name");
                        String retrievedLastName = resultSet.getString("last_name");
                        String retrievedAddress = resultSet.getString("address");
                        int retrievedLevel = resultSet.getInt("level");
                        int retrievedTerm = resultSet.getInt("term");
                        int retrievedGPA = resultSet.getInt("gpa");
                        String retrievedPassedCourses = resultSet.getString("passed_courses_id");
//                        Set current user info to be saved
                        User.setUserInfo(retrievedNationalID,retrievedDepartment,retrievedEmail,
                                retrievedFirstName,retrievedLastName,retrievedAddress,retrievedLevel,retrievedTerm,
                                retrievedGPA,retrievedPassedCourses);
//                        Change the scene to home page
                        FXUtils.changeScene(event, "/View/HomeView.fxml", "Welcome back");
                    }
                    else
                        FXUtils.alertUser("Authentication Problem!","User name or password is not correct;", Alert.AlertType.ERROR);
                }
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResultSet(resultSet);
            closePreparedStatement(psCheckUserExists);
            closeConnection(connection);
        }
    }
    
    private static void closeResultSet(ResultSet resultSet) {
        if(resultSet!=null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    private static void closePreparedStatement(PreparedStatement preparedStatement) {
        if(preparedStatement!=null) {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    private static void closeConnection(Connection connection) {
        if(connection!=null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
}
