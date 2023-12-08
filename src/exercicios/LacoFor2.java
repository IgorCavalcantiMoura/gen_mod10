package exercicios;

import java.util.Scanner;

public class LacoFor2 {

	public static void main(String[] args) {
		int num, contadorPar = 0, contadorImpar = 0;
		Scanner leia = new Scanner(System.in);
	
		for(int i=1; i<=10; i++){
			System.out.println("Digite um número");
			num = leia.nextInt();
			
			if(num%2==0) {
				contadorPar++;
			}else {
				contadorImpar++;
			}
			
		}
		
		System.out.println("Total de Números pares: " + contadorPar);
		System.out.println("Total de Números pares: " + contadorImpar);
	}

}
