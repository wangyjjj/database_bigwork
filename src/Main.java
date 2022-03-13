import java.util.ArrayList;
import java.util.Scanner;
//4:23
public class Main {
    static ArrayList<Student> students = new ArrayList<>();
    static ArrayList<Course> courses = new ArrayList<>();
    static ArrayList<Choice> choices = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        LoadData(students, courses, choices);
        System.out.println("===========学生选课管理系统===========");
        System.out.println("===================================");
        System.out.println("程序的控制如下");
        System.out.println("0 ----- 程序退出");
        System.out.println("1 ----- 用学号查询学生信息");
        System.out.println("2 ----- 用课程号查询课程信息");
        System.out.println("3 ----- 用学号显示学生信息和所有课的名称和成绩");
        System.out.println("4 ----- 用学号显示学生平局成绩");
        System.out.println("5 ----- 用学号删除该生基本信息");
        System.out.println("6 ----- 根据学生ID 课程ID 修改学生成绩");
        System.out.println("7 ----- 新增课程");
        System.out.println("8 ----- 新增选项");
        System.out.println("9 ----- 新增学生");
        int command;
        Function fun = new Function();
        do {
            Scanner input = new Scanner(System.in);
            System.out.print("请输入选择的功能:");
            command = input.nextInt();
            switch(command){
                case 0:
                    StoreData(students, courses, choices);
                    break;
                case 1:
                    System.out.println("============用学号查询学生信息========");
                    fun.checkStudentInfo(students);
                    System.out.println("===================================");
                    break;
                case 2:
                    System.out.println("===========用课程号查询课程信息=======");
                    fun.checkCourseInfo(courses);
                    System.out.println("===================================");
                    break;
                case 3:
                    System.out.println("=用学号显示学生信息和所有课的名称和成绩=");
                    fun.checkChoiceInfo(students, courses, choices);
                    System.out.println("===================================");
                    break;
                case 4:
                    System.out.println("========用学号显示学生平局成绩=========");
                    fun.checkAverageScore(choices);
                    System.out.println("===================================");
                    break;
                case 5:
                    System.out.println("========用学号删除该生基本信息========");
                    fun.deleteStudent(students);
                    System.out.println("===================================");
                    break;
                case 6:
                    System.out.println("===根据学生ID 课程ID 修改学生成绩======");
                    fun.changeScore(choices);
                    System.out.println("===================================");
                    break;
                case 7:
                    System.out.println("==============新增课程===============");
                    fun.addCourse(courses);
                    System.out.println("===================================");
                    break;
                case 8:
                    System.out.println("==============新增选课===============");
                    fun.addChoice(choices);
                    System.out.println("===================================");
                    break;
                case 9:
                    System.out.println("==============新增学生===============");
                    fun.addStudent(students);
                    System.out.println("===================================");
                    break;
                default:
                    System.out.println("===============非法指令！=================");
                    System.out.println("===================================");
                    System.out.println("===================================");
                    System.out.println("===================================");
                    System.out.println("===================================");
            }
        } while (command != 0);
    }

    private static void LoadData(ArrayList<Student> students, ArrayList<Course> courses, ArrayList<Choice> choices){
        FIleLoader.LoadChoices(choices);
        FIleLoader.LoadCourses(courses);
        FIleLoader.LoadStudents(students);
    }

    private static void StoreData(ArrayList<Student> students, ArrayList<Course> courses, ArrayList<Choice> choices){
        FIleLoader.storeChoices(choices);
        FIleLoader.storeCourses(courses);
        FIleLoader.storeStudents(students);
    }
}
