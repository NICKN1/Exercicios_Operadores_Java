import java.util.Scanner;

public class Exercicio2 {
	
	/*Nota: Fa�a um programa que pe�a uma nota, entre zero e dez. 
	 * Mostre uma mensagem caso o valor seja inv�lido e continue 
	 * pedindo at� que o usu�rio informe um valor v�lido.
	 * */

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		double nota;
		
		while(true) { //Aqui inicio o enquanto como verdadeiro
		System.out.print("Digite uma nota: "); //Pe�o para digitar um valor
		nota = scan.nextDouble(); //Programa reconhece o valor
		
		//Aqui caso a nota seja maior que 10 ou menor que 0, informe o erro	e repita	 
		if(nota < 0 || nota > 10) {				
		System.out.println("ERRO: Digite uma nota v�lida!");}
		//Se n�o, informe que � um nota v�lida e pare o programa
		else {
			System.out.println("Esta � uma nota v�lida.");
			break;
		}
		
		
		}
	}
}
