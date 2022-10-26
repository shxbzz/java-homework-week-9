package homework;

public class Task_20_Main extends Task_20_2 {
    public Task_20_Main(double width, double length, double height) {
        super(width, length, height);
    }

    public static void main(String[] args) {
        Task_20_1 rectangle = new Task_20_1(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Task_20_2 cuboid = new Task_20_2(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());

    }
}
