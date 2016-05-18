package Aulas;

import java.util.Scanner;

public class aula3 {
	
	public static void main (String[] args){
		
		int num;
		
		System.out.println("Digite o numero 1!");
		Scanner in = new Scanner(System.in);
		
		num = in.nextInt();
		
		if (num == 1){
			System.out.println("Acertô mizerávi");
		}else{
			System.out.println("Eeeerrrou");
		}
	}
}
