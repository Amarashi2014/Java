import java.util.Scanner;

public class reversenumbers {
    public static void main(String[] args) {
        System.out.println("Welcome to the number reversal program!");
        System.out.println("How to operate:");
        System.out.println("1.Enter three numbers seperately in the input section.");
        System.out.println("2.Click enter on your keybord to see the result. 😸");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");     
        int num2 = sc.nextInt();
        System.out.println("Enter the third number:");
        int num3 = sc.nextInt();
        System.out.println("The numbers in reverse order are:");
        for (int i = 3; i >= 1; i--) {
            switch (i) {
                case 1:
                    System.out.println(num1);
                    break;
                case 2:
                    System.out.println(num2);
                    break;
                case 3:
                    System.out.println(num3);
                    break;
            }
        }
        sc.close();
        System.out.println("Thank you for using the number reversal program!");
    }
}
