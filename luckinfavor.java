import java.util.Scanner; 

public class luckinfavor {
    public static void main(String[] args) {
        // Using for loop
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello User please enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your lucky number:");
        int luckyNumber = sc.nextInt();
        System.out.println("Hello " + name + ", the number " + luckyNumber + " is indeed lucky and says that if you keep working hard and be kind to others, good fortune will always be upon you. Ciao!");
        sc.close();
    }
} 