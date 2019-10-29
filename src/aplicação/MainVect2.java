package aplicação;

import java.util.Scanner;

import entities.Produto;

public class MainVect2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		Produto[] vect = new Produto[n];
	
		// usar o LENGTH PQ vc nao precisa depender de outra variavel, pois o proprio vetor sabe o seu tamanho
		
		for ( int i = 0 ; i < vect.length; i++) {
			input.nextLine();
			String nome = input.nextLine();
			double preço = input.nextDouble();
			vect[i] = new Produto(nome, preço);
		}
		double soma = 0.0;
		for (int i = 0; i < vect.length; i++) {
			soma += vect[i].getPreço();
			
		}
		double media = soma / vect.length;
		
		System.out.printf("A media de preços é: %.2f", media);
	
	}
	
	

}
