public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double averageNote;
    boolean isPass;

    Student(String name_, String stuNo_,String classes_,Course c1_,
            Course c2_,Course c3_) {
        this.name = name_;
        this.classes = classes_;
        this.stuNo = stuNo_;
        this.c1 = c1_;
        this.c2 = c2_;
        this.c3 = c3_;
        this.averageNote = 0.0;
        this.isPass = false;
    }
    void  addBulkExamNote(int note1, int note2, int note3){
        if(note1>=0 && note1<=100){
            this.c1.note = note1;
        }
        if (note2>=0 && note2<=100){
            this.c2.note = note2;
        }
        if (note3>=0 && note3<=100){
            this.c3.note = note3;
        }

    }

    void  printNote(){
        System.out.println(c1.name + " grade :" + c1.note );
        System.out.println(c2.name + " grade :" + c2.note );
        System.out.println(c3.name + " grade :" + c3.note );

        System.out.println("************");
    }
    void  isPass(){
        this.averageNote = (this.c1.note+this.c2.note + this.c3.note)/3.0 ;
        if(this.averageNote>55){
            System.out.println("average grade is :" +this.averageNote  + " -> passed..."  );
            this.isPass = true;
        }else {
            System.out.println("average grade is :" +this.averageNote+ " -> failed...");
            this.isPass = false;
        }
        printNote();
    }


}

