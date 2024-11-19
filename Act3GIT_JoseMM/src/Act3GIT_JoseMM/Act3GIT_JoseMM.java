package Act3GIT_JoseMM;

import java.util.Random;
public class Act3GIT_JoseMM {

	public static void main(String[] args) {
		
		int[] numeros = new int[20];
		Random random = new Random();
		
		for(int i = 0;i<20;i++)
		{
			numeros[i]=random.nextInt(10)+1;
			System.out.print((i+1) + ": "+numeros[i]+"| ");
		}
	}

}
