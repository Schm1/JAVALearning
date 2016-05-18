package Aulas;
import java.util.Scanner;

public class aula4 {

	public static void main (String[] args){
		
		double n1,n2,n3,n4,media;
		
		System.out.println("Digite a sua nota: ");
		Scanner in = new Scanner(System.in);
		n1 = in.nextDouble();
		
		System.out.println("Digite a sua nota: ");
		n2 = in.nextDouble();

		System.out.println("Digite a sua nota: ");
		n3 = in.nextDouble();
		
		System.out.println("Digite a sua nota: ");
		n4 = in.nextDouble();
		
		media = n1+n2+n3+n4;
		
		if(media / 4 >= 7){
			System.out.println("Aprovado");
		}else{
			System.out.println("Reprovado");
		}
		
	}
}
