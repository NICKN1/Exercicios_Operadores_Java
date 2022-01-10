import java.util.Scanner;

public class Exercicio2 {
	
	/*Nota: Faça um programa que peça uma nota, entre zero e dez. 
	 * Mostre uma mensagem caso o valor seja inválido e continue 
	 * pedindo até que o usuário informe um valor válido.
	 * */

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		double nota;
		
		while(true) { //Aqui inicio o enquanto como verdadeiro
		System.out.print("Digite uma nota: "); //Peço para digitar um valor
		nota = scan.nextDouble(); //Programa reconhece o valor
		
		//Aqui caso a nota seja maior que 10 ou menor que 0, informe o erro	e repita	 
		if(nota < 0 || nota > 10) {				
		System.out.println("ERRO: Digite uma nota válida!");}
		//Se não, informe que é um nota válida e pare o programa
		else {
			System.out.println("Esta é uma nota válida.");
			break;
		}
		
		
		}
	}
}
