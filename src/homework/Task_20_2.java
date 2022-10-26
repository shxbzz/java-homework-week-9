package homework;

public class Task_20_2 extends Task_20_1{
    private double height;

    public Task_20_2(double width, double length, double height){
        super(width, length);
        if(height < 0){
            this.height = 0;
        }else{
            this.height = height;
        }
    }

    public double getHeight(){
        return height;
    }

    public double getVolume(){
        return (getArea() * height);
    }
}

