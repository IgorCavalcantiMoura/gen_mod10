package exercicios;

import java.util.Scanner;

public class LacoWhile2 {

	public static void main(String[] args) {
		int numBackend = 0;
		int numMulheresFront = 0;
		int numHomensMobile_Maior40 =0;
		int numNaoBinariosFullStack_Menor30 = 0;
		int numTotalPessoas = 0;
		int somaIdades = 0;
		int idade;
		int identidadeGenero;
		int pessoaDesenvolvedora;
		boolean continuar = true;
		
		
		Scanner leia = new Scanner(System.in);
		 while(continuar ==true) {
			 System.out.println("\n****************************Pesquisa Interna******************************");
			
			 System.out.println("Digite sua idade: ");
			 idade = leia.nextInt();
			 
			 System.out.println("**************************Identidade de Gênero***************************");
	         System.out.println("1 – Mulher Cis");
	         System.out.println("2 – Homem Cis");
	         System.out.println("3 – Não Binário");
	         System.out.println("4 – Mulher Trans");
	         System.out.println("5 – Homem Trans");
	         System.out.println("6 – Outros");
	         System.out.print("Escolha a opção correspondente: ");
	         identidadeGenero = leia.nextInt();
	         
	         System.out.println("*************************Pessoa Desenvolvedora*************************");
	         System.out.println("1 – Backend");
	         System.out.println("2 – Frontend");
	         System.out.println("3 – Mobile");
	         System.out.println("4 – FullStack");
	         System.out.print("Escolha a opção correspondente: ");
	         pessoaDesenvolvedora = leia.nextInt();
	         
	         numTotalPessoas++;
	 		 somaIdades += idade;
	 		 
	 		 if(pessoaDesenvolvedora == 1) {
	 			numBackend++;
	 		 }
	 		 
	 		 if((identidadeGenero==1 || identidadeGenero==4)&& pessoaDesenvolvedora==2);{
	 			numMulheresFront++;
	 		 }
	         
	 		 if((identidadeGenero==2 || identidadeGenero==5)&& pessoaDesenvolvedora==3 && idade>40);{
	 			numHomensMobile_Maior40++;
		 	 }
	 		 
	 		if(identidadeGenero==3 && pessoaDesenvolvedora==3 && idade<30);{
	 			numNaoBinariosFullStack_Menor30++;
		 	 }
	 		
	 		System.out.print("Deseja continuar (true/false)? ");
	 		//leia.next();
	 		continuar = leia.nextBoolean();
	 		System.out.println(continuar);
		 }
		 
		 	System.out.println("\n************************Resultados da Pesquisa***************************************");
	        System.out.println("Número de pessoas desenvolvedoras Backend: " + numBackend);
	        System.out.println("Número de Mulheres Cis e Trans desenvolvedoras Frontend: " + numMulheresFront);
	        System.out.println("Número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + numHomensMobile_Maior40);
	        System.out.println("Número de Não Binários desenvolvedores FullStack menores de 30 anos: " + numNaoBinariosFullStack_Menor30);
	        System.out.println("Número total de pessoas que responderam à pesquisa: " + numTotalPessoas);
	        System.out.println("Média de idade das pessoas que responderam à pesquisa: " + somaIdades/numTotalPessoas);
		
	}

}
