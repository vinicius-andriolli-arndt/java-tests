import java.util.Scanner;
import java.util.Calendar;
public class AulaCalculoMaisDificil {

	public static void main(String[] args) {
	//3.14	
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the radius of the circle: ");
    double radius = input.nextDouble();
    double area = 3.14 * radius * radius;
    System.out.println("The area of the circle is " + area);
    //3digitos
    Scanner input2 = new Scanner(System.in);
    System.out.print("Please enter only a three-digit integer: ");
    int num = input2.nextInt();
    int digit1 = num % 10;
    int digit2 = (num / 10) % 10;
    int digit3 = num / 100;
    int sum = digit1 + digit2 + digit3;
    System.out.println("The sum of the digits is " + sum);
     //prime
    Scanner input3 = new Scanner(System.in);

    System.out.print("Enter a positive integer: ");
    int numero = input3.nextInt();

    boolean prime = true;

    for (int i = 2; i <= numero / 2; i++) {
        if (numero % i == 0) {
            prime = false;
            break;
        }
    }

    if (prime) {
        System.out.println(numero + " is a prime");
    } else {
        System.out.println(numero + " is not a prime");
    }
    //arithmetic sequence
    Scanner input4 = new Scanner(System.in);

    System.out.print("Enter three integers: ");
    int a = input4.nextInt();
    int b = input4.nextInt();
    int c = input4.nextInt();

    if (b - a == c - b) {
        System.out.println("The sequence has a common difference of " + (b - a));
    } else {
        System.out.println("The three integers do not form an arithmetic sequence.");
    }
    //palíndromo
    Scanner input5 = new Scanner(System.in);

    System.out.print("Enter a string without spaces: ");
    String str = input5.nextLine();

    boolean isPalindrome = true;
    int length = str.length();

    for (int i = 0; i < length / 2; i++) {
        if (str.charAt(i) != str.charAt(length - i - 1)) {
            isPalindrome = false;
            break;
        }
    }

    if (isPalindrome) {
        System.out.println(str + " is a palindrome.");
    } else {
        System.out.println(str + " is not a palindrome.");
    }
     
        
	}

}
