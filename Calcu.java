import java.util.Scanner;

public class Calcu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Calculator Program!");
        System.out.println("Please enter what operation you want to perform:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("6. Exit");
        int choice = sc.nextInt();

        System.out.println("Enter two numbers to perform arithmetic operations:");
        
        // Read two integers from user input
       int num1 = sc.nextInt();
       int num2 = sc.nextInt();

       if (choice == 1 ) {
            Addition addition = new Addition();
            System.out.println("Addition: " + addition.add(num1, num2));
        } 
       if (choice == 2) {
            Subtraction subtraction = new Subtraction();
            System.out.println("Subtraction: " + subtraction.subtract(num1, num2));
        } 
       if (choice == 3) {
            Multiplication multiplication = new Multiplication();
            System.out.println("Multiplication: " + multiplication.multiply(num1, num2));
        } 
       if (choice == 4) {
            Division division = new Division();
            System.out.println("Division: " + division.divide(num1, num2));
        }
       if (choice == 5) {
            System.out.println("Modulus: " + (num1 % num2));
        } 
       if (choice == 6 ){
            System.out.println("Exiting the program.");
        } 
       if (choice < 1 || choice > 6) {
            System.out.println("Invalid choice. Please try again.");
        }
        
        sc.close();

    }

    static class Addition{
        public int add(int num1 , int num2) {
            return num1 + num2;
        }
    }
    static class Subtraction{
        public int subtract(int num1, int num2) {
            return num1 - num2;
        }
    }
    static class Multiplication{
        public int multiply(int num1, int num2) {
            return num1 * num2;
        }
    }
    static class Division{
        public int divide(int num1, int num2) {
            if (num2 == 0) {
                System.out.println("Cannot divide by zero.");
                return 0; // or throw an exception
            }
            return num1 / num2;
        }
    }
}
