package Oct.ex_04102024;

public class Lab003 {

        public static void main(String[] args) {
            int number = 10; // The number for which we want to print the table

            System.out.println("Multiplication Table of " + number + ":");
            for (int i = 1; i <= 10; i++) {
                int result = number * i;
                System.out.println(number + " x " + i + " = " + result);
            }
        }
    }


