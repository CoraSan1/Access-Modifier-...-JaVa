package ThucHanh.StaticMethod;

public class Main {
    public static void main(String[] args) {
        LopStudent.change();

        LopStudent s1 = new LopStudent(111, "Hoang");
        LopStudent s2 = new LopStudent(222, "Thanh");
        LopStudent s3 = new LopStudent(333, "Hai");

        s1.display();
        s2.display();
        s3.display();
    }
}
