package ThucHanh.StaticMethod;

public class LopStudent {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    public LopStudent() {
    }

    LopStudent(int r, String n){
        rollno = r;
        name = n;
    }

    static void change(){
        college = "CODEGYM";
    }

    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }
}
