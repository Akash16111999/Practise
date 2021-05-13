package corejava8labbookexercises;
import java.util.Scanner;
public class SumOfCubes {
	
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		int num;
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		System.out.println("Sum of the cubes of the digit " + num + " is: " + cubesOfdigits(num));
		sc.close();
	}
	public static int cubesOfdigits(int number) {
		int sum = 0, rem;
		while(number > 0) {
			rem = number % 10;
			sum = sum + (rem*rem*rem);
			number = number / 10;
		}
		return sum;
	}

}