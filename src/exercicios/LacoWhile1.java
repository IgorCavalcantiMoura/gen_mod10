package exercicios;

import java.util.Scanner;

public class LacoWhile1 {

	public static void main(String[] args) {
		int menorQue21 = 0, maiorQue50 = 0, idade = 0;
		Scanner leia = new Scanner(System.in);
		
		while(idade >= 0) {
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			
			if(idade<21 && idade >=0) {
				menorQue21++;
			}
			if(idade>50) {
				maiorQue50++;
			}
			
		}
		
		System.out.println("\n Total de pessoas menores de 21 anos: " + menorQue21);
		System.out.println("\n Total de pessoas maiores de 50 anos: " + maiorQue50);

		

	}

}
