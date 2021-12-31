package Utils;

public class Utils {
    public static String getCourseID(String courseName) {
        switch (courseName) {
            case "Mathematics-3":
                return "MA213";
            default:
                return null;
        }
    }
}
