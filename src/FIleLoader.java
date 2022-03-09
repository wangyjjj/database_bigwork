import java.util.ArrayList;
import java.io.*;

public class FIleLoader {
    public static void LoadStudents(ArrayList<Student> students){
        final File file = new File("src\\students.txt");
        try{
            final FileReader fr = new FileReader(file);
            final BufferedReader bfr = new BufferedReader(fr);
            while (true){
                String str = bfr.readLine();
                if(str == null){
                    break;
                }
                /**分割存储各个student的属性，并保存在相应的ArraryList里面  */
                int inBetName = str.indexOf('=');
                int nameBetSex = str.indexOf('=', inBetName + 1);
                int sexBetAge = str.indexOf('=', nameBetSex + 1);
                int ageBetClass = str.indexOf('=', sexBetAge + 1);

                int sID = Integer.parseInt(str.substring(0, inBetName));
                String name = str.substring(inBetName + 1, nameBetSex);
                String sex = str.substring(nameBetSex + 1, sexBetAge);
                int age = Integer.parseInt(str.substring(sexBetAge + 1, ageBetClass));
                int in_class = Integer.parseInt(str.substring(ageBetClass + 1, str.length()));
                students.add(new Student(sID, name, sex, age, in_class));
            }
            bfr.close();
            fr.close();
        }catch (Exception ex){}
    }

    public static void LoadCourses(ArrayList<Course> courses){
        final File file = new File("src\\courses.txt");
        try{
            final FileReader fr = new FileReader(file);
            final BufferedReader bfr = new BufferedReader(fr);
            while (true){
                String str = bfr.readLine();
                if(str == null){
                    break;
                }

                int idBetName = str.indexOf('=');
                int nameBetPoints = str.indexOf('=', idBetName + 1);

                int cID = Integer.parseInt(str.substring(0, idBetName));
                String courseName = str.substring(idBetName + 1, nameBetPoints);
                int Course_points = Integer.parseInt(str.substring(nameBetPoints + 1, str.length()));
                courses.add(new Course(cID, courseName, Course_points));
            }
            bfr.close();
            fr.close();
        }catch (Exception ex){}
    }

    public static void LoadChoices(ArrayList<Choice> choices){
        final File file = new File("src\\choices.txt");
        try{
            final FileReader fr = new FileReader(file);
            final BufferedReader bfr = new BufferedReader(fr);
            while (true){
                String str = bfr.readLine();
                if(str == null){
                    break;
                }

                int stdBetCour= str.indexOf('=');
                int courBetScore = str.indexOf('=', stdBetCour + 1);

                int sID = Integer.parseInt(str.substring(0, stdBetCour));
                int cID = Integer.parseInt(str.substring(stdBetCour + 1, courBetScore));
                int score = Integer.parseInt(str.substring(courBetScore + 1, str.length()));
                choices.add(new Choice(sID, cID, score));
            }
            bfr.close();
            fr.close();
        }catch (Exception ex){}
    }

    public static void storeStudents(ArrayList<Student> students){
        final File file = new File("src\\students.txt");
        try {
            PrintStream ps = new PrintStream(file);
            for (Student std : students){
                String str = String.valueOf(std.sID) + "=" + std.name + "="
                        + std.sex + "=" +String.valueOf(std.age) + "=" + String.valueOf(std.in_class);
                ps.println(str);
            }
            ps.close();
        } catch (Exception ex){}
    }

    public static void storeCourses(ArrayList<Course> courses){
        final File file = new File("src\\courses.txt");
        try {
            PrintStream ps = new PrintStream(file);
            for (Course cour : courses){
                String str = String.valueOf(cour.cID) + "=" + cour.courseName + "=" +String.valueOf(cour.Course_points);
                ps.println(str);
            }
            ps.close();
        } catch (Exception ex){}
    }

    public static void storeChoices(ArrayList<Choice> choices){
        final File file = new File("src\\choices.txt");
        try {
            PrintStream ps = new PrintStream(file);
            for (Choice cho : choices){
                String str = String.valueOf(cho.sID) + String.valueOf(cho.cID) + String.valueOf(cho.score);
                ps.println(str);
            }
            ps.close();
        } catch (Exception ex){}
    }
}
