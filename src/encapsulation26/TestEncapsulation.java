package encapsulation26;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        // setting values of the variables
        obj.setName("Shubhang");
        obj.setAge(21);
        obj.setRollNo(51);
        // Displaying values of the variables
        System.out.println("Prime's name: " +
                obj.getName());
        System.out.println("Prime's age: " +
                obj.getAge());
        System.out.println("Prime's rollNo: " +
                obj.getRollNo());
    }
}
