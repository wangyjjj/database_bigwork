import java.util.ArrayList;

public class Function {
    public void addStudent(ArrayList<Student> students){

    }

    public void addCourse(ArrayList<Course> courses){

    }

    public void addChoice(ArrayList<Choice> choices){

    }
    //用学号查询学生信息
    //a = cheakStudentInfo(123, students)
    //a[0] = “123”, a[1] = ”小明“， a[2] = "男"， a[3] = "18", a[4] = "2班"
    public String[] checkStudentInfo(int sID, ArrayList<Student> students){
        return null;

    }

    //用课程号查询课程信息
    //a = cheakCourseInfo(123, courses)
    //a[0] = “25”, a[1] = ”数据库“， a[2] = "3"
    public String[] checkCourseInfo(int cID, ArrayList<Course> courses){
        return null;

    }

    //用学号显示学生信息和所有课的名称和成绩
    //a = cheakChoiceInfo(123, students, courses, choices)
    //a[0] = “小明”, a[1] = ”数据库 98分“， a[2] = "数据结构 95分"
    public String[] checkChoiceInfo(int sID, ArrayList<Student> students, ArrayList<Course> courses, ArrayList<Choice>choices){
        return null;

    }

    //用学号显示学生平局成绩
    //a = cheakAverageScore(123, choices)
    //a = 95;
    public int checkAverageScore(int sID, ArrayList<Choice> choices ){
        return 0;

    }

    //用学号删除该生基本信息
    //a = deleteStudent
    public void deleteStudent(int sID, ArrayList<Student> students){

    }

    //根据学生ID 课程ID 修改学生成绩
    public void changeScore(int sID, int cID, ArrayList<Choice> choices){

    }
}
