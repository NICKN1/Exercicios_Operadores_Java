import java.util.Scanner;

/*
Fa�a um programa que pe�a N n�meros inteiros,
calcule e mostre a quantidade de n�meros pares
e a quantidade de n�meros impares.
*/

public class Exercicio4_ParEImpar extends Exercicio1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int quantidadeNumeros;
		int numero;
		int par = 0;
		int impar = 0;
		
		System.out.println("Quantidade de N�meros: ");
		quantidadeNumeros = scan.nextInt();
		
		int contador = 0;
		
		do { 
			System.out.println("N�mero: ");
			numero = scan.nextInt();
			
			//Se o n�mero for
			if (numero % 2 == 0) par++;
			else impar++;
			
		contador++;
		} while(contador < quantidadeNumeros);
		
		System.out.println("Quantidade de n�meros Pares: " + par);
		System.out.println("Quantidade de n�meros �mpar: " + impar);
		}
	
	}


