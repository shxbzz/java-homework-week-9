package homework;

public class Task_19_Main extends Task_19_2{
    public Task_19_Main(double radius, double height) {
        super(radius, height);
    }

    public static void main(String[] args) {
        Task_19_1 circle = new Task_19_1(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Task_19_2 cylinder = new Task_19_2(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());

    }
}
