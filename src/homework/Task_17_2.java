package homework;

public class Task_17_2 {
    private double cost;

    public Task_17_2(double cost, double v){
        if(cost < 0 ){
            this.cost = 0.0;
        }else{
            this.cost = cost;
        }
    }
    public double getCost(){
        return this.cost;
    }
}
