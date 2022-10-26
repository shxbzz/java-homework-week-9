package homework;

public class Task_17_3 {
    private Task_17_1 floor;
    private Task_17_2 carpet;

    public Task_17_3(Task_17_1 floor, Task_17_2 carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
        return floor.getArea() * carpet.getCost();
    }
}
