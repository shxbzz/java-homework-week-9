package homework;

public class Task_7 {
    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(252));

    }

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10;

        while (number >= 10) {
            number /= 10;

        }

        return (number + lastDigit);

    }
}

