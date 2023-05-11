import java.util.Scanner;
public class ListaDeEx1 {

	public static void main(String[] args) {
		//2 values 
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the first value: ");
        int value1 = input.nextInt();
        System.out.print("Enter the second value: ");
        int value2 = input.nextInt();

        if (value1 > value2) {
            System.out.println("The greater value is: " + value1);
        } else {
            System.out.println("The greater value is: " + value2);
        }
        //year scanner
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
        //password
        
        Scanner input3 = new Scanner(System.in);
        System.out.print("Enter password: ");
        int password = input3.nextInt();
        if (password == 1234) {
            System.out.println("ACCESS ALLOWED");
        } else {
            System.out.println("ACCESS DENIED");
        }
        //apple price
        
        Scanner input4 = new Scanner(System.in);
        System.out.print("Enter the number of apples purchased: ");
        int numberOfApples = input4.nextInt();
        double unitPrice;
        if (numberOfApples < 12) {
            unitPrice = 0.3;
        } else {
            unitPrice = 0.25;
        }
        double totalAmount = numberOfApples * unitPrice;
        System.out.printf("Total purchase amount: R$%.2f %n", totalAmount);
        //3if(Sorry but I couldn't do it any other way)
        //ps:ingles pra ficar mais apresentavel hehehe
        Scanner input5 = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int num1 = input5.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = input5.nextInt();
        System.out.print("Enter the third integer: ");
        int num3 = input5.nextInt();
        int temp;
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;          
            if (num1 > num2) {
                temp = num1;
                num1 = num2;
                num2 = temp;
            }
        }
        System.out.println(num1 + " " + num2 + " " + num3);
        //height and sex
        Scanner input6 = new Scanner(System.in);
        System.out.print("Enter your height in meters: ");
        double height = input6.nextDouble();
        System.out.print("Enter your gender (1 for female, 2 for male): ");
        int gender = input6.nextInt();
        double idealWeight;
        if (gender == 1) {
            idealWeight = (62.1 * height) - 44.7;
        } else if (gender == 2) {
            idealWeight = (72.7 * height) - 58;
        } else {
            System.out.println("Invalid gender code. Please enter 1 for female or 2 for male.");
            return;
        }
        System.out.printf("Your ideal weight is %.2f kg. %n", idealWeight);
        //polygon🔷
        Scanner input7 = new Scanner(System.in);
        System.out.print("Enter the number of sides of the polygon: ");
        int sides = input7.nextInt();
        System.out.print("Enter the measurement of the polygon in cm: ");
        double measurement = input7.nextDouble();
        double area;
        switch (sides) {
            case 3:
                area = (Math.sqrt(3) / 4) * Math.pow(measurement, 2);
                System.out.printf("TRIANGLE, area = %.2f cm^2 %n", area);
                break;
            case 4:
                area = Math.pow(measurement, 2);
                System.out.printf("SQUARE, area = %.2f cm^2 %n", area);
                break;
            case 5:
                System.out.println("PENTAGON");
                break;
            default:
                System.out.println("Invalid number of sides. Please enter 3, 4, or 5.");
                break;
        }
        //polygon🔷 AGAIN :)
        Scanner input8 = new Scanner(System.in);

        System.out.print("Enter the number of sides of the polygon: ");
        int sidess = input8.nextInt();

        System.out.print("Enter the measurement of the polygon in cm: ");
        double measurementt = input8.nextDouble();

        double areaa;

        if (sidess < 3) {
            System.out.println("IT IS NOT A POLYGON");
        } else if (sidess == 3) {
            areaa = (Math.sqrt(3) / 4) * Math.pow(measurementt, 2);
            System.out.printf("TRIANGLE, area = %.2f cm^2 %n", areaa);
        } else if (sidess == 4) {
            areaa = Math.pow(measurementt, 2);
            System.out.printf("SQUARE, area = %.2f cm^2 %n", areaa);
        } else if (sidess == 5) {
            System.out.println("PENTAGON");
        } else if (sidess > 5) {
            System.out.println("NON-IDENTIFIED POLYGON");
        }
        //3 values 
        Scanner input9 = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int a = input9.nextInt();
        System.out.print("Enter the second integer: ");
        int b = input9.nextInt();
        System.out.print("Enter the third integer: ");
        int c = input9.nextInt();
        int largest = a;
        if (b > largest) {
            largest = b;
        }
        if (c > largest) {
            largest = c;
        }
        System.out.printf("The largest integer is %d %n", largest);
        //sides of a triangle
        Scanner input10 = new Scanner(System.in);
        System.out.print("Enter the length of the first side: ");
        double d = input10.nextDouble();
        System.out.print("Enter the length of the second side: ");
        double e = input10.nextDouble();
        System.out.print("Enter the length of the third side: ");
        double f = input10.nextDouble();
        if (d == e && e == f) {
            System.out.println("Equilateral Triangle");
        } else if (d == e || d == f || e == f) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }
        //angles of a triangle
        Scanner input11 = new Scanner(System.in);

        System.out.print("Enter the first angle: ");
        int r = input11.nextInt();

        System.out.print("Enter the second angle: ");
        int g = input11.nextInt();

        System.out.print("Enter the third angle: ");
        int v = input11.nextInt();

        int sum = r + g + v;

        if (sum == 180) {
            if (r == 90 || g == 90 || v == 90) {
                System.out.println("Rectangle Triangle");
            } else if (r > 90 || g > 90 || v > 90) {
                System.out.println("Obtuse Triangle");
            } else {
                System.out.println("Acute Triangle");
            }
        } else {
            System.out.println("Invalid Triangle");
        }
	}

}
