import java.util.Scanner;
public class ListaDeEx2 {

	public static void main(String[] args) {
		//code of a certain product
		Scanner input = new Scanner(System.in);
        System.out.print("Enter product code: ");
        int code = input.nextInt();
        String classification;
        switch (code) {
            case 1:
                classification = "Non-perishable food";
                break;
            case 2:
            case 3:
            case 4:
                classification = "Perishable food";
                break;
            case 5:
            case 6:
                classification = "Clothing";
                break;
            case 7:
                classification = "Personal hygiene";
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                classification = "Cleaning and household items";
                break;
            default:
                classification = "Invalid code";
                break;
        }
        System.out.println("Classification: " + classification);
        //school report
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter first grade: ");
        double grade1 = input2.nextDouble();
        System.out.print("Enter second grade: ");
        double grade2 = input2.nextDouble();
        double average = (grade1 + grade2) / 2;
        String message;
        if (average >= 0 && average <= 4) {
            message = "Failed";
        } else if (average >= 4.1 && average < 7) {
            message = "Exam";
        } else if (average >= 7 && average <= 10) {
            message = "Approved";
        } else {
            message = "Invalid average";
        }
        System.out.println("Arithmetic mean: " + average);
        System.out.println("Message: " + message);
        //user operation
        Scanner input3 = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = input3.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = input3.nextDouble();        
        System.out.println("Select operation:");
        System.out.println("1 - Average between the numbers entered");
        System.out.println("2 - Difference between the numbers");
        System.out.println("3 - Product between the numbers entered");
        System.out.println("4 - Division of the first by the second");
        int choice = input3.nextInt();  
        double result;
        String message2;
        switch (choice) {
            case 1:
                result = (num1 + num2) / 2;
                message2 = "The average is: " + result;
                break;
            case 2:
                result = num1 - num2;
                message2 = "The difference is: " + result;
                break;
            case 3:
                result = num1 * num2;
                message2 = "The product is: " + result;
                break;
            case 4:
                if (num2 == 0) {
                    message2 = "Division by zero is undefined";
                } else {
                    result = num1 / num2;
                    message2 = "The quotient is: " + result;
                }
                break;
            default:
                message2 = "Invalid choice";
                break;
        }
        System.out.println(message2);
        //menu
        Scanner input4 = new Scanner(System.in);
        System.out.print("Enter the item code: ");
        int itemCode = input4.nextInt();
        System.out.print("Enter the quantity: ");
        int quantity = input4.nextInt();
        double totalCost;
        switch (itemCode) {
        case 100:
        	totalCost = quantity * 1.70;
        	break;
        case 101:
        	totalCost = quantity * 2.30;
        	break;
        case 102:
        	totalCost = quantity * 2.60;
        	break;
        case 103:
        	totalCost = quantity * 2.40;
        	break;
        case 104:
        	totalCost = quantity * 2.50;
        	break;
        case 105:
        	totalCost = quantity * 1.00;
        	break;
        default:
        	System.out.println("Invalid item code");
        	return;
        }
        System.out.println("Total cost: BRL " + totalCost);
     }
}
