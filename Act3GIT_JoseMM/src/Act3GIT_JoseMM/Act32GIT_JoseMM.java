package Act3GIT_JoseMM;

import java.util.Scanner;

public class Act32GIT_JoseMM {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce 2 valores");
		int num1 = Integer.parseInt(scanner.nextLine());
		int num2 = Integer.parseInt(scanner.nextLine());
		
		if(num1>num2)
		{
			while(num1>num2)
			{
				System.out.println(num2);
				num2 = num2 + 7;
			}
			System.out.println(num1);
		}
		else if(num2>num1)
		{
			while(num2>num1)
			{
				System.out.println(num1);
				num1 = num1+7;
			}
			System.out.println(num2);
		}
	}

}
