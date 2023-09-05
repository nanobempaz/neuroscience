package br.com.neuro;

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
		System.out.println("Fatos sobre neurociência");
		System.out.println("O cérerbo é incrivelmento complexo - Neuroplasticidade - Hemisferios cerebrais - Sinapses - "
				+ "Neurociência e Eduação");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um valor numérico de 1 a 5, o Fato será dado de acordado com a opção numerica que você "
				+ "digitar");
		System.out.println("------------------------------------------------------------------------------------");
		Metodos fatos = new Metodos();
		int x = scanner.nextInt();
		
		if(x == 1) {
			fatos.fato1();
		}else if(x == 2) {
			fatos.fato2();
		}else if(x == 3) {
			fatos.fato3();
		}else if(x == 4) {
			fatos.fato4();
		}else if(x == 5){
			fatos.fato5();
		}else {
			System.out.println("Opção inválida");
		}
		scanner.close();
	}
	
}
