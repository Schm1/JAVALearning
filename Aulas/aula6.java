package Aulas;
import java.util.Scanner;

public class aula6 {

	public static void main(String[] args){
		
		final double vsom = 340.28;
		
		System.out.println("Digite o espa�o de tempo: ");
		
		Scanner in = new Scanner(System.in);
		
		int tempo = in.nextInt();
		
		System.out.println("A dist�ncia �: " +tempo * vsom + " metros percorridos");
		System.out.println("A dist�ncia em km �: " +(tempo * vsom)/1000 + " km percorridos");
	}
}
