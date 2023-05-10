import java.util.Scanner;
import java.util.*;
import java.util.Arrays;
public class ListaDeEx3 {

	public static void main(String[] args) {
		//even
		Scanner input = new Scanner(System.in);
	    System.out.print("Enter a positive integer: ");
	    int n = input.nextInt();
	    for (int i = 0; i <= n; i+=2) {
	    	System.out.println(i);
	    }
	    //arithmetic mean
	    Scanner input2 = new Scanner(System.in);
        System.out.print("Enter a sequence of numbers separated by spaces: ");
        String numbersString = input2.nextLine();
        String[] numbersArray = numbersString.split("\\s+");
        int[] numbers = new int[numbersArray.length];
        double sum = 0.0;
        for (int i = 0; i < numbersArray.length; i++) {
            numbers[i] = Integer.parseInt(numbersArray[i]);
            sum += numbers[i];
        }
        double mean = sum / numbers.length;
        System.out.println("Arithmetic mean: " + mean);
        //array sum
        int[] array = {1, 2, 3, 4, 5};
        int sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            sum2 += array[i];
        }
        System.out.println("Sum of array elements: " + sum2);
        //odd numbers
        Scanner input3 = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n2 = input3.nextInt();
        System.out.println("Odd numbers between 1 and " + n2 + ":");
        for (int i = 1; i <= n2; i += 2) {
            System.out.println(i);
        }
        //sequence of words
        Scanner input4 = new Scanner(System.in);
        System.out.print("Enter a sequence of words: ");
        String sequence = input4.nextLine();
        String[] words = sequence.split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("The longest word is: " + longestWord);
        //harder ones ↓↓↓↓↓
        int[] arr = {10, 25, 5, 30, 15};
        int max = arr[0];
        int index = 0;
        for (int i = 1; i <arr.length; i++) {
        	if (arr[i] > max){
        		max =arr[i];
        		index = i;
        	}
        }
        System.out.println("The largest number is " + max + "and it's at index: " + index);
        //average
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sequence of numbers separated by spaces: ");
        String input6 = scanner.nextLine();
        String[] numbers1 = input6.split(" ");
        int[] sequence1 = new int[numbers1.length];
        for (int i = 0; i < numbers1.length; i++) {
            sequence1[i] = Integer.parseInt(numbers1[i]);
        }
        double sum1 = 0;
        for (int num : sequence1) {
            sum1 += num;
        }
        double mean1 = sum1 / sequence1.length;
        int aboveMean = 0;
        int belowMean = 0; 
        for (int num : sequence1) {
            if (num > mean1) {
                aboveMean++;
            } else if (num < mean1) {
                belowMean++;
            }
        }
        System.out.println("Mean: " + mean1);
        System.out.println("Numbers above the mean: " + aboveMean);
        System.out.println("Numbers below the mean: " + belowMean);
        //repeating loop
        Scanner input7 = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n1 = input7.nextInt(); 
        int fib1 = 0; 
        int fib2 = 1;       
        if (n1 == 1) {
            System.out.println("The " + n1 + "st Fibonacci number is " + fib1);
        } else if (n1 == 2) {
            System.out.println("The " + n1 + "nd Fibonacci number is " + fib2);
        } else {
            int fib = 0; 
            for (int i = 3; i <= n1; i++) {
                fib = fib1 + fib2; 
                fib1 = fib2;
                fib2 = fib;
            }
            System.out.println("The " + n1 + "th Fibonacci number is " + fib);
        }
        //sequence of words
        Scanner input8 = new Scanner(System.in);
        System.out.print("Enter a sequence of words separated by spaces: ");
        String input1 = input8.nextLine();
        String[] words1 = input1.split(" ");
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words1) {
            if (wordCounts.containsKey(word)) {
                int count = wordCounts.get(word);
                wordCounts.put(word, count + 1);
            } else {
                wordCounts.put(word, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();
            System.out.println(word + ": " + count);
        }
        //array int
        int[] nums = {1, 9, 8, 7, 5};
        Arrays.sort(nums);
        int n6 = nums.length;
        if (n % 2 == 0) {
        	int mid1 = nums[n/2 - 1];
        	int mid2 = nums[n/2];
        	double median = (double) (mid1 + mid2) / 2;
        	System.out.println("The median is " + median);
        }else {
        	int mid = nums[n/2];
        	System.out.println("The median is " + mid);
        }
        
	}

}
