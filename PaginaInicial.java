package ProjetoBlocoI;

import java.util.Scanner;

import java.util.ArrayList;

public class PaginaInicial {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String a1 = "* * * * * * * * * * * * * * *";
		String a2 = "* * * CINEMA GENERATION * * *";
		String a3 = "* * * * * * * * * * * * * * *";

		ArrayList<String> cabecalho = new ArrayList<>();

		cabecalho.add(a1);
		cabecalho.add(a2);
		cabecalho.add(a3);

		for (String str : cabecalho)
			System.out.println(str);

		System.out.print("\nDigite o seu nome: ");
		String nome = leia.next();
		System.out.print("Digite a idade: ");
		int idade = leia.nextInt();
		FilmesEmCartaz fc = new FilmesEmCartaz(nome, idade);
		FilmesEmBreve fb = new FilmesEmBreve(nome, idade);
		System.out.println("\nSeja bem-vinde, " + fc.getNome() + "!");

		System.out.println("\nSelecione a opção desejada:");
		System.out.println("\n[1] - Filmes em Cartaz");
		System.out.println("\n[2] - Filmes em Breve");
		System.out.println("\n[3] - Sair");
		int opcao = leia.nextInt();

		switch (opcao) {
		case 1:
			fc.imprimir();
			break;
		case 2:
			fb.imprimir();
			break;
		case 3:
			System.out.println("Volte sempre!");
			break;
		}
	}
}
