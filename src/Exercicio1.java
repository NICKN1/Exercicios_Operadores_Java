import java.util.Scanner;

public class Exercicio1 {
	
	/* Nome e Idade: Faça um programa que leia conjuntos de dois valores, 
	 * o primeiro representando o nome do aluno e o segundo representando
	 * a sua. (Pare inserindo o valor 0 no campo nome)
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println();
	
	String Nome;
	double Altura;
	
	System.out.println("-----Digite 0 em nome para parar o programa-----");
	
	while(true) {
	System.out.print("Digite o seu nome: ");
	Nome = scan.next();
	if(Nome.equals("0")) break; //Se nome for = a 0 pare o programa
	
	System.out.print("Digite a sua altura: ");
	Altura = scan.nextDouble();
	
	System.out.println("Seu nome é: " + Nome);
	System.out.println("Sua altura é: " + Altura);
	System.out.println("------------------------------");
	
	}
	
	System.out.println();
		
	}
}

