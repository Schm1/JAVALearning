package Aulas;
import java.util.Scanner;

public class aula6 {

	public static void main(String[] args){
		
		final double vsom = 340.28;
		
		System.out.println("Digite o espaço de tempo: ");
		
		Scanner in = new Scanner(System.in);
		
		int tempo = in.nextInt();
		
		System.out.println("A distância é: " +tempo * vsom + " metros percorridos");
		System.out.println("A distância em km é: " +(tempo * vsom)/1000 + " km percorridos");
	}
}
