
import java.util.Scanner;
public class leap_year {
    public static void main(String[] args){
        // Using if-else statement
        System.out.println("Hello there User Welcome to the Leap Year Calculator! Please enter your good name :-");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.print(name + ", please enter the year you want to check: ");
        int year = sc.nextInt();
        sc.close();
        if(year % 4 == 0 ) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
