import java.util.ArrayList;

public class Main {
    static ArrayList<Student> students = new ArrayList<>();
    static ArrayList<Course> courses = new ArrayList<>();
    static ArrayList<Choice> choices = new ArrayList<>();
    public static void main(String[] args) {
        LoadData(students, courses, choices);
        System.out.println("===========学生选课管理系统===========");
        System.out.println("===================================");

    }

    private static void LoadData(ArrayList<Student> students, ArrayList<Course> courses, ArrayList<Choice> choices){
        FIleLoader.LoadChoices(choices);
        FIleLoader.LoadCourses(courses);
        FIleLoader.LoadStudents(students);
    }
}
