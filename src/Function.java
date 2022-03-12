import java.util.ArrayList;
import java.util.Scanner;

public class Function {
    Scanner input = new Scanner(System.in);
    public void addStudent(ArrayList<Student> students){
        System.out.print("请输入学生编号：");
        int sID = input.nextInt();
        System.out.print("请输入学生姓名：");
        String name = input.next();
        System.out.print("请输入学生性别：");
        String sex = input.next();
        System.out.print("请输入学生年龄：");
        int age = input.nextInt();
        System.out.print("请输入学生班级：");
        int in_class = input.nextInt();
        students.add(new Student(sID,name,sex,age,in_class));
    }

    public void addCourse(ArrayList<Course> courses){
        System.out.print("请输入课程编号：");
        int cID = input.nextInt();
        System.out.print("请输入课程名称：");
        String course = input.next();
        System.out.print("请输入课程学分：");
        int point = input.nextInt();
        courses.add(new Course(cID,course,point));
    }

    public void addChoice(ArrayList<Choice> choices){
        System.out.print("请输入学生编号：");
        int sID = input.nextInt();
        System.out.print("请输入课程编号：");
        int cID = input.nextInt();
        System.out.print("请输入课程得分：");
        int score = input.nextInt();
        choices.add(new Choice(sID,cID,score));
    }
    //用学号查询学生信息
    //a = cheakStudentInfo(123, students)
    //a[0] = “123”, a[1] = ”小明“， a[2] = "男"， a[3] = "18", a[4] = "2班"
    public int checkStudentInfo(ArrayList<Student> students){
        System.out.print("请输入学生编号：");
        int sID = input.nextInt();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).sID == sID){
                System.out.println("姓名：" + students.get(i).name);
                System.out.println("学号：" + students.get(i).sID);
                System.out.println("年龄：" + students.get(i).age);
                System.out.println("班级：" + students.get(i).in_class);
            }
        }
        return sID;
    }

    //用课程号查询课程信息
    //a = cheakCourseInfo(123, courses)
    //a[0] = “25”, a[1] = ”数据库“， a[2] = "3"
    public void checkCourseInfo(ArrayList<Course> courses){
        System.out.print("请输入课程编号：");
        int cID = input.nextInt();
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).cID == cID){
                System.out.println("课程名：" + courses.get(i).courseName + "学分：" + courses.get(i).Course_points);
            }
        }
    }

    //用学号显示学生信息和所有课的名称和成绩
    public void checkChoiceInfo(ArrayList<Student> students, ArrayList<Course> courses, ArrayList<Choice>choices){
        int sID = checkStudentInfo(students);
        int[] cIDs = new int[20];
        int[] scores = new int[20];
        int num = 0;
        for (int i = 0; i < choices.size(); i++) {
            if (choices.get(i).sID == sID){
                cIDs[num] = choices.get(i).cID;
                scores[num] = choices.get(i).score;
                num += 1;
            }
        }
        System.out.println("==============选课得分===============");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < courses.size(); j++) {
                if (courses.get(j).cID == cIDs[i]){
                    System.out.println(courses.get(j).courseName + ": " + scores[i]);
                    break;
                }
            }
        }
    }

    //用学号显示学生平局成绩
    //a = cheakAverageScore(123, choices)
    //a = 95;
    public void checkAverageScore(ArrayList<Choice> choices ){
        System.out.print("请输入学生编号：");
        int sID = input.nextInt();
        int count = 0;
        int all_score = 0;
        for (int i = 0; i < choices.size(); i++) {
            if (choices.get(i).sID == sID){
                count += 1;
                all_score += choices.get(i).score;
            }
        }
        System.out.println("该学生的平均成绩为：" + all_score / count + "分");
    }

    //用学号删除该生基本信息
    //a = deleteStudent
    public void deleteStudent(ArrayList<Student> students){
        System.out.print("请输入学生编号：");
        int sID = input.nextInt();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).sID == sID){
                students.remove(i);
                break;
            }
        }
    }

    //根据学生ID 课程ID 修改学生成绩
    public void changeScore(ArrayList<Choice> choices){
        System.out.print("请输入学生编号：");
        int sID = input.nextInt();
        System.out.print("请输入课程编号：");
        int cID = input.nextInt();
        System.out.print("请输入修改后的成绩：");
        int score = input.nextInt();
        for (int i = 0; i < choices.size(); i++) {
            if (choices.get(i).cID == cID && choices.get(i).sID == sID){
                choices.get(i).score = score;
                break;
            }
        }
    }
}
