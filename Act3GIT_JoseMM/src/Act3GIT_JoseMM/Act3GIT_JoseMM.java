package Act3GIT_JoseMM;

import java.util.Random;
public class Act3GIT_JoseMM {

	public static void main(String[] args) {
		
		int[] numeros = new int[30];
		Random random = new Random();
		
		for(int i = 0;i<30;i++)
		{
			numeros[i]=random.nextInt(10)+1;
			System.out.print((i+1) + ": "+numeros[i]+"| ");
		}
	}

}
