public class Teacher {
    String name;
    String mobileNo;
    String branch;

    Teacher(String _name, String _mobileNo, String _branch){
        this.name = _name;
        this.mobileNo = _mobileNo;
        this.branch = _branch;
    }

    void  print(){
        System.out.println("Name      : "+ this.name);
        System.out.println("Mobile No : "+ this.mobileNo);
        System.out.println("Branch    : "+ this.branch);
    }

}
