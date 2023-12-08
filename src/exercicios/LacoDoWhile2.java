package exercicios;

import java.util.Scanner;

public class LacoDoWhile2 {

	public static void main(String[] args) {
		int soma =0;
		int quantidadeMultiplosDe3 =0;
		int num;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número inteiro; ");
			num = leia.nextInt();
			
			if(num%3 ==0 && num!=0) {
			soma += num;
			quantidadeMultiplosDe3++; 
			
			}
		}while(num !=0);
		
		System.out.println("A média de todos os números multiplos de 3 é: " + soma/quantidadeMultiplosDe3);

	}

}
