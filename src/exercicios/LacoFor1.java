package exercicios;

import java.util.Scanner;

public class LacoFor1 {

	public static void main(String[] args) {
		int num1, num2; 
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o priemiro número: ");
		num1 = leia.nextInt();
		
		System.out.println("Digite o segundo número: ");
		num2 = leia.nextInt();
		
		if(num1>num2) {
			System.out.println("O intervalo é inválido. O primeiro número deve ser menor que o segundo");
			System.exit(0);
		}
		
		System.out.println("Multiplos de 3 e 5 no intervalo [" + num1 + "] e [" + num2 + "]: ");
		for(int i =num1; i <=num2; i++) {
			if(i%3 == 0 && i %5 == 0) {
				System.out.println(i + " é multiplo de 3 e 5");
			}
		}


	}

}
