import java.awt.font.TextHitInfo;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("John", "+111", "HST");
        Teacher t2 =new Teacher("Paul", "+222", "PHS");
        Teacher t3 =new Teacher("Toni", "+333", "BIO");

        Course history = new Course("history", "01", "HST");
        //history.addTeacher(t1);
        Course physic = new Course("physic", "02", "PHS");
        //physic.addTeacher(t2);
        Course biology = new Course("biology", "03", "BIO");
        //biology.addTeacher(t3);

        Student s1 = new Student("Ali","A1","10A", history , physic, biology);

        Student s2 = new Student("Veli","A2","10B", history , physic, biology);
        Student s3 = new Student("Salih","A3","10C", history , physic, biology);

        s1.addBulkExamNote(10,70,96);
        s1.isPass();
        s2.addBulkExamNote(50, 60 , 70);
        s2.isPass();
        s3.addBulkExamNote(80,30,50);
        s3.isPass();







    }
}