import java.util.Scanner;
public class AulaCalculos {

	public static void main(String[] args) {
	//calc +-/*
	int i = 20;
	int i2 = 2;
	System.out.println(i+i2);
	System.out.println(i-i2);
	System.out.println(i/i2);
	System.out.println(i*i2);
	//even or odd		
	Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int i3 = input.nextInt();
    if (i3 % 2 == 0) {
		System.out.println(i3 + " is even");
	}else {
		System.out.println(i3 + " is odd");
	}
    //age Scanner
	Scanner input2 = new Scanner(System.in);
	System.out.println("Enter your age: ");
	int i4 = input2.nextInt();
	if (i4 >= 18) {
		System.out.println(i4 + " you are of legal age");
	}else {
		System.out.println(i4 + " you are underage");
	}
	//String == String
	Scanner input3 = new Scanner(System.in);
	System.out.println("Enter the first String: ");
	String str = input3.nextLine();
	System.out.println("Enter the second String: ");
	String str2 = input3.nextLine();
	if (str.equals(str2)) {
		System.out.println("The two Strings are equal");
	} else {
		System.out.println("The two String are not equal");
	}
	//grade point average
	Scanner input4 = new Scanner(System.in);
	System.out.println("Enter the first grade: ");
	 double grade = input4.nextDouble();
	System.out.println("Enter the second grade: ");
	 double grade2 = input4.nextDouble(); 
	System.out.println("Enter the third grade: ");
	 double grade3 = input4.nextDouble();
	double average = (grade + grade2 + grade3) /3.0;
	System.out.println("The average grade is: " + average);
	if (average >= 7.0) {
		System.out.println("The student passed");
	}else {
		System.out.println("The student failed");
	}
	}

}
