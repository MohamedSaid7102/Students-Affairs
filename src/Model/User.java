package Model;

public class User {
    private static String nationalID;
    private static String department;
    private static String email;
    private static String firstName;
    private static String lastName;
    private static String address;
    private static int level;
    private static int term;
    private static int GPA;
    private static String passedCourses;
    
    public User() {
        resetUserInfo();
    }
    
    public static void setUserInfo(String nationalID, String department, String email, String firstName,
                                   String lastName, String address, int level, int term, int GPA,
                                   String passedCourses) {
        User.nationalID = nationalID;
        User.department = department;
        User.email = email;
        User.firstName = firstName;
        User.lastName = lastName;
        User.address = address;
        User.level = level;
        User.term = term;
        User.GPA = GPA;
        User.passedCourses = passedCourses;
    }
    
    public static void resetUserInfo(){
        User.nationalID = null;
        User.department = null;
        User.email = null;
        User.firstName = null;
        User.lastName = null;
        User.address = null;
        User.level = -1;
        User.term = -1;
        User.GPA = -1;
        User.passedCourses = null;
    }
}
