package Act3GIT_JoseMM;

import java.util.Scanner;

public class Act32GIT_JoseMM {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce 3 valores");
		int num1 = Integer.parseInt(scanner.nextLine());
		int num2 = Integer.parseInt(scanner.nextLine());
		int num3 = Integer.parseInt(scanner.nextLine());
		if(num1>num2)
		{
			if((num3>num2)&&(num3<num1))
			{
				while(num3>num2)
				{
					System.out.println(num2);
					num2 = num2 + 7;
				}
				System.out.println(num3);
				while(num1>num2)
				{
					System.out.println(num2);
					num2 = num2 + 7;
				}
				System.out.println(num1);
			}
			else
			{
				while(num1>num2)
				{
					System.out.println(num2);
					num2 = num2 + 7;
				}
				System.out.println(num1);
			}
		}
		else if(num2>num1)
		{
			if((num3>num1)&&(num3<num2))
			{
				while(num3>num1)
				{
					System.out.println(num1);
					num1 = num1 + 7;
				}
				System.out.println(num3);
				while(num2>num1)
				{
					System.out.println(num1);
					num1 = num1 + 7;
				}
				System.out.println(num2);
			}
			else
			{
				while(num1>num2)
				{
					System.out.println(num2);
					num2 = num2 + 7;
				}
				System.out.println(num1);
			}
		}
	}
}
