package projetoAlysson;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Produto> estoque = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		Produto p1 = new Produto(1, "Caneta", 2.90f, 100);
		Produto p2 = new Produto(2, "Lápis",  0.99f, 80);
		Produto p3 = new Produto(3, "Borracha", 1.99f, 85);
		Produto p4 = new Produto(4, "Canetão", 4.50f, 60);
		Produto p5 = new Produto(5, "Caderno", 19.99f, 30);
		
		estoque.add(p1);
		estoque.add(p2);
		estoque.add(p3);
		estoque.add(p4);
		estoque.add(p5);
		
		System.out.println("Lista original:");
		for(Produto p : estoque){
		      System.out.println(p.toString());
		 }
		
		System.out.println("Tipos de ordenação:");
		System.out.println("1 - Por nome");
		System.out.println("2 - Por preço");
		System.out.println("3 - Por quantidade em estoque");
		System.out.println("4 - Sair");
		System.out.println("Selecione o tipo:");
		int opcao = sc.nextInt();
		
		if (opcao == 1) {
		  estoque.sort(new NomeComparator());

		  for(Produto p : estoque){
		     System.out.println(p.toString());
		  }
		} else if (opcao == 2) {
			estoque.sort(new PrecoComparator());

			for(Produto p : estoque){
				System.out.println(p.toString());
			}
		} else if (opcao == 3) {
			estoque.sort(new QuantComparator());

			for(Produto p : estoque){
				System.out.println(p.toString());
			}
		} else if (opcao == 4){
			return;
		} else {
			System.out.println("Comando inválido!");
		}
		
	}

}
