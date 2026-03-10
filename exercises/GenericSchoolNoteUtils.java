package exercises;
import java.util.function.*;
public class GenericSchoolNoteUtils {
    static class Student {
        String name;
        String id;
        Student(String name, String id) {
            this.name = name;
            this.id = id;
        }
    }
    static class Score {
        String subject;
        int score;
        Score(String subject, int score) {
            this.subject = subject;
            this.score = score;
        }
    }

    static class Course {
        String name;
        String teacher;

        Course(String name, String teacher) {
            this.name = name;
            this.teacher = teacher;
        }
    }
    static public class SchoolNoteUtils{
        public static <T> String addRemark(T data, String dataType, String remark, Function<T, String> describeFunc) {
            String dataDesc = describeFunc.apply(data);
            return "[" + dataType + "] " + dataDesc + " - " + remark;
        }
    }
    public static void main(String[] args) {
        Student student=new Student("张三","1001");
        String studentRemark= SchoolNoteUtils.addRemark(student,"学生","校级奖学金",a -> a.name+"（学号 " + a.id + "）");
        System.out.println(studentRemark);
        Score score = new Score("数学",100);
        String scoreRemark=SchoolNoteUtils.addRemark(score,"成绩", "补录成绩",s ->s.subject+":"+s.score);
        System.out.println(scoreRemark);
        Course course=new Course("语文","张三");
        String courseRemark=SchoolNoteUtils.addRemark(course,"课程","调课",c -> c.name+ "（授课教师：" + c.teacher + "）");
        System.out.println(courseRemark);
    }
}
