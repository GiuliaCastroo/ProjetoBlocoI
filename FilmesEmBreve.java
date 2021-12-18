package ProjetoBlocoI;

import java.util.Scanner;

public class FilmesEmBreve extends Cliente {

	Scanner leia = new Scanner(System.in);

	public FilmesEmBreve(String nome, int idade) {
		super(nome, idade);
	}

	public void sair() {
		System.out.println("\n[0] Para retornar ao menu anterior.");
		System.out.println("\n[1] Para sair do aplicativo.\n");
		int sair = leia.nextInt();
		if (sair == 0) {
			imprimir();
		} else if (sair == 1) {
			System.out.println("Volte sempre!");
		}
	}

	String[] titulos = { "Lightyear", "Doutor Estranho no Multiverso da Loucura",
			"Animais Fant�sticos: Os Segredos de Dumbledore", "Guardi�es da Gal�xia Vol. 3", "O Telefone Preto",
			"Batman" };

	public void imprimir() {
		if (super.getIdade() <= 12) {
			System.out.println("\n* * * FILMES EM BREVE * * * \n");
			for (int x = 0; x < 4; x++) {
				System.out.println("[" + x + "] " + titulos[x]);
			}
			int opcao = leia.nextInt();
			switch (opcao) {
			case 0:
				System.out.println("Lightyear\r\n" + "Data de Estreia: 16 de junho de 2022" + "Elenco: Chris Evans \n"
						+ "G�nero:Anima��o/Fantasia \n" + "1 h 36 minutos \n" + "Classifica��o Indicativa: Livre \n"
						+ "Diretor: Angus MacLane \r\n"
						+ "Lightyear � uma futura anima��o americana de fic��o cient�fica \nde a��o produzido pela Pixar Animation Studios e Walt Disney Pictures.\r\n"
						+ "");
				sair();
				break;
			case 1:
				System.out.println("Doutor Estranho no Multiverso da Loucura\r\n"
						+ "Data de Estreia: 06 de Maio de 2022\n " + "Elenco: Benedict Cumberbatch\n"
						+ "G�nero:Aventura/Fantasia \n" + "2 h 16 minutos\n" + "Classifica��o Indicativa: 12 anos \n"
						+ "Diretor: Sam Raimi \r\n"
						+ "Doctor Strange in the Multiverse of Madness � um futuro filme estadunidense \nde super-her�i baseado no personagem hom�nimo da Marvel Comics.\r\n"
						+ "");
				sair();
				break;
			case 2:
				System.out.println("Animais Fant�sticos: Os Segredos de Dumbledore\r\n"
						+ "Data de Estreia: 14 de Abril de 2022 \r\n"
						+ "Elenco: Mads Mikkelsen, Eddie Redmayne, Jude Law\n" + "G�nero: Fantasia/Aventura\n"
						+ "2 h 10 minutos \n" + "Classifica��o Indicativa: 12 anos\r\n" + "Diretor:David Yates\r\n"
						+ "Fantastic Beasts: The Secrets of Dumbledore � um futuro filme de fantasia e aventura dirigido por David Yates \na partir de um roteiro de J. K. Rowling e Steven Kloves e uma hist�ria \nde Rowling pertencente ao universo de Harry Potter\r\n"
						+ "");
				sair();
				break;
			case 3:
				System.out.println("Guardi�es da Gal�xia Vol. 3\r\n" + "Data de Estreia: 27 de Abril de 2023 \r\n"
						+ "Elenco: Chirs Pratt, Zoe Salda�a, Dave Bautista \n" + "G�nero: Aventura/Fantasia\n"
						+ "2 h 10 minutos \n" + "Classifica��o Indicativa: 12 anos\r\n" + "Diretor: James Gunn\r\n"
						+ "Ap�s descobrir a verdade sobre como Quill, Drax e Thanos escaparam do Cancerverso, Gamora \ndecide abandonar os Guardi�es da Gal�xia. Rocket curioso deseja ouvir \na hist�ria, Quill ent�o come�a a contar.\r\n"
						+ "");
				sair();
				break;
			}
		} else if (super.getIdade() < 18) {
			System.out.println("\n* * * FILMES EM BREVE * * * \n");
			for (int x = 0; x < 5; x++) {
				System.out.println("[" + x + "] " + titulos[x]);
			}
			int opcao = leia.nextInt();
			switch (opcao) {
			case 0:
				System.out.println("Lightyear\r\n" + "Data de Estreia: 16 de junho de 2022" + "Elenco: Chris Evans \n"
						+ "G�nero:Anima��o/Fantasia \n" + "1 h 36 minutos \n" + "Classifica��o Indicativa: Livre \n"
						+ "Diretor: Angus MacLane \r\n"
						+ "Lightyear � uma futura anima��o americana de fic��o cient�fica \nde a��o produzido pela Pixar Animation Studios e Walt Disney Pictures.\r\n"
						+ "");
				sair();
				break;
			case 1:
				System.out.println("Doutor Estranho no Multiverso da Loucura\r\n"
						+ "Data de Estreia: 06 de Maio de 2022\n " + "Elenco: Benedict Cumberbatch\n"
						+ "G�nero:Aventura/Fantasia \n" + "2 h 16 minutos\n" + "Classifica��o Indicativa: 12 anos \n"
						+ "Diretor: Sam Raimi \r\n"
						+ "Doctor Strange in the Multiverse of Madness � um futuro filme estadunidense \nde super-her�i baseado no personagem hom�nimo da Marvel Comics.\r\n"
						+ "");
				sair();
				break;
			case 2:
				System.out.println("Animais Fant�sticos: Os Segredos de Dumbledore\r\n"
						+ "Data de Estreia: 14 de Abril de 2022 \r\n"
						+ "Elenco: Mads Mikkelsen, Eddie Redmayne, Jude Law\n" + "G�nero: Fantasia/Aventura\n"
						+ "2 h 10 minutos \n" + "Classifica��o Indicativa: 12 anos\r\n" + "Diretor:David Yates\r\n"
						+ "Fantastic Beasts: The Secrets of Dumbledore � um futuro filme de fantasia e aventura dirigido por David Yates \na partir de um roteiro de J. K. Rowling e Steven Kloves e uma hist�ria \nde Rowling pertencente ao universo de Harry Potter\r\n"
						+ "");
				sair();
				break;
			case 3:
				System.out.println("Guardi�es da Gal�xia Vol. 3\r\n" + "Data de Estreia: 27 de Abril de 2023 \r\n"
						+ "Elenco: Chirs Pratt, Zoe Salda�a, Dave Bautista \n" + "G�nero: Aventura/Fantasia\n"
						+ "2 h 10 minutos \n" + "Classifica��o Indicativa: 12 anos\r\n" + "Diretor: James Gunn\r\n"
						+ "Ap�s descobrir a verdade sobre como Quill, Drax e Thanos escaparam do Cancerverso, Gamora \ndecide abandonar os Guardi�es da Gal�xia. Rocket curioso deseja ouvir \na hist�ria, Quill ent�o come�a a contar.\r\n"
						+ "");
				sair();
				break;
			case 4:
				System.out.println("O Telefone Preto\r\n" + "Data de Estreia: 10 de mar�o de 2022\r\n"
						+ "Elenco: Ethan Hawke, Mason Thames, Madeleine McGraw, James Ransone\n"
						+ "G�nero: Terror/Drama\n" + "1h 42m\r\n" + "Classifica��o Indicativa: 14 anos\r\n"
						+ "Diretor: Scott DErrickson\r\n"
						+ "Finney Shaw um t�mido, mas perspicaz, rapaz de 13 anos, � raptado por um s�dico assassino \nQuando um telefone desligado come�a a tocar, Finney descobre que consegue ouvir as vozes \ndas v�timas anteriores do assassino. E elas est�o decididas a assegurar que o que \nlhes aconteceu n�o acontece a Finney�\r\n"
						+ "");
				sair();
				break;
			}
		} else if (super.getIdade() > 0 && super.getIdade() < 100) {
			System.out.println("\n* * * FILMES EM BREVE * * * \n");
			for (int x = 0; x < 6; x++) {
				System.out.println("[" + x + "] " + titulos[x]);
			}
			int opcao = leia.nextInt();
			switch (opcao) {
			case 0:
				System.out.println("Lightyear\r\n" + "Data de Estreia: 16 de junho de 2022" + "Elenco: Chris Evans \n"
						+ "G�nero:Anima��o/Fantasia \n" + "1 h 36 minutos \n" + "Classifica��o Indicativa: Livre \n"
						+ "Diretor: Angus MacLane \r\n"
						+ "Lightyear � uma futura anima��o americana de fic��o cient�fica \nde a��o produzido pela Pixar Animation Studios e Walt Disney Pictures.\r\n"
						+ "");
				sair();
				break;
			case 1:
				System.out.println("Doutor Estranho no Multiverso da Loucura\r\n"
						+ "Data de Estreia: 06 de Maio de 2022\n " + "Elenco: Benedict Cumberbatch\n"
						+ "G�nero:Aventura/Fantasia \n" + "2 h 16 minutos\n" + "Classifica��o Indicativa: 12 anos \n"
						+ "Diretor: Sam Raimi \r\n"
						+ "Doctor Strange in the Multiverse of Madness � um futuro filme estadunidense \nde super-her�i baseado no personagem hom�nimo da Marvel Comics.\r\n"
						+ "");
				sair();
				break;
			case 2:
				System.out.println("Animais Fant�sticos: Os Segredos de Dumbledore\r\n"
						+ "Data de Estreia: 14 de Abril de 2022 \r\n"
						+ "Elenco: Mads Mikkelsen, Eddie Redmayne, Jude Law\n" + "G�nero: Fantasia/Aventura\n"
						+ "2 h 10 minutos \n" + "Classifica��o Indicativa: 12 anos\r\n" + "Diretor:David Yates\r\n"
						+ "Fantastic Beasts: The Secrets of Dumbledore � um futuro filme de fantasia e aventura dirigido por David Yates \na partir de um roteiro de J. K. Rowling e Steven Kloves e uma hist�ria \nde Rowling pertencente ao universo de Harry Potter\r\n"
						+ "");
				sair();
				break;
			case 3:
				System.out.println("Guardi�es da Gal�xia Vol. 3\r\n" + "Data de Estreia: 27 de Abril de 2023 \r\n"
						+ "Elenco: Chirs Pratt, Zoe Salda�a, Dave Bautista \n" + "G�nero: Aventura/Fantasia\n"
						+ "2 h 10 minutos \n" + "Classifica��o Indicativa: 12 anos\r\n" + "Diretor: James Gunn\r\n"
						+ "Ap�s descobrir a verdade sobre como Quill, Drax e Thanos escaparam do Cancerverso, Gamora \ndecide abandonar os Guardi�es da Gal�xia. Rocket curioso deseja ouvir \na hist�ria, Quill ent�o come�a a contar.\r\n"
						+ "");
				sair();
				break;
			case 4:
				System.out.println("O Telefone Preto\r\n" + "Data de Estreia: 10 de mar�o de 2022\r\n"
						+ "Elenco: Ethan Hawke, Mason Thames, Madeleine McGraw, James Ransone\n"
						+ "G�nero: Terror/Drama\n" + "1h 42m\r\n" + "Classifica��o Indicativa: 14 anos\r\n"
						+ "Diretor: Scott DErrickson\r\n"
						+ "Finney Shaw um t�mido, mas perspicaz, rapaz de 13 anos, � raptado por um s�dico assassino \nQuando um telefone desligado come�a a tocar, Finney descobre que consegue ouvir as vozes \ndas v�timas anteriores do assassino. E elas est�o decididas a assegurar que o que \nlhes aconteceu n�o acontece a Finney�\r\n"
						+ "");
				sair();
				break;
			case 5:
				System.out.println("Batman\r\n" + "Data de Estreia: 3 de mar�o de 2022 \r\n"
						+ "Elenco: Robert Pattison, Paul Dano, Colin Farrel \n" + "G�nero:A��o/Aventura \n"
						+ "2 h 40 minutos\n" + "Classifica��o Indicativa: 18 anos\r\n" + "Diretor: Matt Reeves\r\n"
						+ "Da Warner Bros. Pictures chega THE BATMAN com o realizador Matt Reeves  \ne protagonizado por Robert Pattinson no duplo papel de detetive de Gotham City \ne do seu alter ego, o bilion�rio solit�rio Bruce Wayne.\r\n"
						+ "");
				sair();
				break;
			}
		}
	}
}
