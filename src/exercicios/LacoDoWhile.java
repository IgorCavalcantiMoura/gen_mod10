package exercicios;

import java.util.Scanner;

public class LacoDoWhile {

	public static void main(String[] args) {
		int soma =0;
		int num;
		
		Scanner leia = new Scanner(System.in);
		
		do {
            System.out.print("Digite um número inteiro: ");
            num = leia.nextInt();

            if (num > 0) {
                soma += num;
            }

        } while (num != 0);
		
		System.out.println("A soma dos números positivos digitados é: " + soma);

	}

}
