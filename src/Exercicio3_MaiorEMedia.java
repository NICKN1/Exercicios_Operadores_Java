import java.util.Scanner;

/*
Fa�a um programa que leia 5 n�meros
e informe o maior n�mero
e a m�dia desses n�meros.
*/

public class Exercicio3_MaiorEMedia extends Exercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		
	int numero;
	int maior = 0;
	int media = 0;
	int contador = 0;
	
	//Fun��o "Fa�a" at� alguma coisa acontecer no caso...
	do {
		System.out.println("Digite um n�mero: ");
		numero = scan.nextInt();
		
		media = media + numero;
		
		if (numero > maior) maior = numero;
		
		contador = contador + 1;
		
		/*Enquanto o contador for menor que 5, pois assim que ultrapassar
		  esse valor estipulado, a repeti��o para, e segue o c�digo */
	} while(contador < 5);
	
	System.out.println("Maior n�mero: " + maior);
	System.out.println("M�dia dos n�meros: " + (media/5));
	
	}
}
