import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Student> students = new ArrayList<>();
    static ArrayList<Course> courses = new ArrayList<>();
    static ArrayList<Choice> choices = new ArrayList<>();
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
            command = input.nextInt();
            switch(command){
                case '0': System.out.println("==============程序退出===============");
                    break;
                case '1': System.out.println("============用学号查询学生信息========");
                    break;
                case '2': System.out.println("===========用课程号查询课程信息=======");
                    break;
                case '3': System.out.println("=用学号显示学生信息和所有课的名称和成绩=");
                    break;
                case '4': System.out.println("========用学号显示学生平局成绩=========");
                    break;
                case '5': System.out.println("========用学号删除该生基本信息========");
                    break;
                case '6': System.out.println("===根据学生ID 课程ID 修改学生成绩======");
                    break;
                case '7': System.out.println("==============新增课程===============");
                    break;
                case '8': System.out.println("==============新增选项===============");
                    break;
                case '9': System.out.println("==============新增学生===============");
                    break;
                default:
                    System.out.println("===============非法指令！=================");
            }
        } while (command != '0');
    }

    private static void LoadData(ArrayList<Student> students, ArrayList<Course> courses, ArrayList<Choice> choices){
        FIleLoader.LoadChoices(choices);
        FIleLoader.LoadCourses(courses);
        FIleLoader.LoadStudents(students);
    }
}
