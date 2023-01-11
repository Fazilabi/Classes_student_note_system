public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    Course(String name_, String code_,String prefix_ ){
        this.name = name_;
        this.code = code_;
        this.prefix = prefix_;
        note = 0;

    }
    void  addTeacher(Teacher teacher_){
        if(teacher_.branch.equals(this.prefix)){
            this.teacher = teacher_;
            System.out.println("Teacher added...");
        }else {
            System.out.println("Teacher and branch not equal... ");
        }
    }

    void printTeacherInfo(){
        teacher.print();
    }

}


