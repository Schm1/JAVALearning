package Aulas;

import java.util.Scanner;
public class aula2 {

	public static void main(String[] args){
		
	Scanner in = new Scanner(System.in);
	double num1,num2,soma,subtracao,multi,div;
	
	System.out.println("Insira um numero: ");
	num1 = in.nextDouble();
	
	System.out.println("Insira outro número: ");
	num2 = in.nextDouble();
	
	soma = num1 + num2;
	System.out.println("O resultado da soma é: " + soma);
	
	subtracao = num1 - num2;
	System.out.println("O resultado da subtracao é: "+ subtracao);
	
	
	multi = num1 * num2;
	System.out.println("O resultado da multiplicacao é: "+multi);
	
	div = num1 / num2;
	System.out.println("O resultado da divisão é: "+ div);
	}
	
}
