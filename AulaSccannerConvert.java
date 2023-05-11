import java.util.Scanner;
public class AulaSccannerConvert {

	public static void main(String[] args) {
		//int to double with scanner
		Scanner input = new Scanner(System.in);
        System.out.print("Enter an int: ");
        int num = input.nextInt();
        Double numDouble = Double.valueOf(num);
        System.out.println("The conversion value to Double is: " + numDouble);
        //String to int with Scanner
        Scanner input2 = new Scanner(System.in);        
        System.out.print("Enter a string: ");
        String str = input2.nextLine();

        try {
            Integer numInt = Integer.valueOf(str);
            int result = numInt * 2;
            System.out.println("The converted value multiplied by 2 is: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input string.");

        }
        //String to Boolean with Scanner
         Scanner input3 = new Scanner(System.in);
         System.out.print("Enter a string: ");
         String str2 = input3.nextLine();
         Boolean bool = Boolean.valueOf(str2);
         System.out.println("The converted value is: " + bool);
        //decimal to int
         Scanner input4 = new Scanner(System.in);
         System.out.print("Enter a decimal number: ");
         double num2 = input4.nextDouble();
         int result2;
         try {
             result2 = (int) num2;
             Integer numInt = Integer.valueOf(result2);
             System.out.println("The converted value is: " + numInt);
         } catch (NumberFormatException e) {
             System.out.println("Error: Invalid input decimal number.");
         }
         //char to int hexadecimal
         Scanner input5 = new Scanner(System.in);
         System.out.print("Enter a character: ");
         char ch = input5.next().charAt(0);
         int result3 = (int) ch;
         Integer numInt2 = Integer.valueOf(result3);
         String hex = Integer.toHexString(numInt2);
         System.out.println("The hexadecimal conversion value is: " + hex);
        
        
	}
}


