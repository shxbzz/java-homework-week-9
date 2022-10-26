package homework;

public class Task_17_1 {
    private double width;
    private double length;

    public Task_17_1(double width){
        if(width > 0 && length < 0){
            this.width = width;
            this.length = 0.0;
        }else if(width < 0 && length > 0){
            this.width = 0.0;
            this.length = length;
        }else if(width < 0 && length < 0){
            this.width = width;
            this.length = length;
        }else{
            this.width = width;
            this.length = length;
        }
    }

    public double getArea(){
        return this.width * this.length;
    }
}
