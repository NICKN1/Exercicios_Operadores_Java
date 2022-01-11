import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class Exercicio3_MaiorEMedia extends Exercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		
	int numero;
	int maior = 0;
	int media = 0;
	int contador = 0;
	
	//Função "Faça" até alguma coisa acontecer no caso...
	do {
		System.out.println("Digite um número: ");
		numero = scan.nextInt();
		
		media = media + numero;
		
		if (numero > maior) maior = numero;
		
		contador = contador + 1;
		
		/*Enquanto o contador for menor que 5, pois assim que ultrapassar
		  esse valor estipulado, a repetição para, e segue o código */
	} while(contador < 5);
	
	System.out.println("Maior número: " + maior);
	System.out.println("Média dos números: " + (media/5));
	
	}
}
