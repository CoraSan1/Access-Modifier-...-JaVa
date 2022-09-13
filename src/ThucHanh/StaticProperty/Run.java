package ThucHanh.StaticProperty;

public class Run {
    public static void main(String[] args) {
        LopCar car1 = new LopCar("merceides", "Skyactiv3" );
        LopCar car2 = new LopCar("Mazda 8", "Skyactiv6");

        System.out.println(LopCar.numberOfcar);
    }
}
