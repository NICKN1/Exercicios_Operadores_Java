import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class Exercicio4_ParEImpar extends Exercicio1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int quantidadeNumeros;
		int numero;
		int par = 0;
		int impar = 0;
		
		System.out.println("Quantidade de Números: ");
		quantidadeNumeros = scan.nextInt();
		
		int contador = 0;
		
		do { 
			System.out.println("Número: ");
			numero = scan.nextInt();
			
			//Se o número for
			if (numero % 2 == 0) par++;
			else impar++;
			
		contador++;
		} while(contador < quantidadeNumeros);
		
		System.out.println("Quantidade de números Pares: " + par);
		System.out.println("Quantidade de números Ímpar: " + impar);
		}
	
	}


