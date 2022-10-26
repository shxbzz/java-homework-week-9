package homework;

public class Task_9 {
        public static void main(String[] args) {

            int n = 21, firstTerm = 1, secondTerm = 1;

            System.out.println("Fibonacci Series Upto " + n + ": ");

            while (firstTerm <= n) {
                System.out.print(firstTerm + ", ");

                int nextTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = nextTerm;

            }
        }
    }
