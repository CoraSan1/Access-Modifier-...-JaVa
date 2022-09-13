package ThucHanh.StaticProperty;

public class LopCar {
    private String name;
    private String engine;

    public static int numberOfcar;

    public LopCar(){
    }

    public LopCar(String name, String engine){
        this.name = name;
        this.engine = engine;
        numberOfcar++;
    }

}
