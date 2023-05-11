import java.util.Scanner;
public class Idade {

	public static void main(String[] args) {

        Scanner input2 = new Scanner(System.in);

        System.out.print("Enter your year of birth: ");
        int birthYear = input2.nextInt();

        int currentYear = java.time.Year.now().getValue();
        int votingAge = 18;
        int age = currentYear - birthYear;

        if (age >= votingAge) {
            System.out.println("You are " + age + " years old, and you are eligible to vote this year.");
        } else {
            System.out.println("You are " + age + " years old, and you are not yet eligible to vote.");
        }

    }

}
