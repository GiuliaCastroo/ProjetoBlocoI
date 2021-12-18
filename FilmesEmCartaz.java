package ProjetoBlocoI;

import java.util.Scanner;

public class FilmesEmCartaz extends Cliente {

	Scanner leia = new Scanner(System.in);

	public FilmesEmCartaz(String nome, int idade) {
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

	String[] titulos = { "Fam�lia Monstro 2", "Homem-Aranha: Sem Volta para Casa", "Ghostbusters: Mais Al�m",
			"A bab� - O chamado das sombras", "House of  Gucci", "007 - Sem Tempo Para Morrer", "Marighella",
			"Matrix Resurrections", "Eternos" };

	public void imprimir() {
		if (super.getIdade() <= 12) {
			System.out.println("\n * * * FILMES EM CARTAZ * * *");
			System.out.println("\nAbaixo est�o listados os filmes de acordo com sua faixa et�ria.");
			System.out.println("\nDigite a op��o num�rica para maiores detalhes sobre os filmes: \n");
			for (int x = 0; x < 4; x++) {
				System.out.println("[" + x + "] " + titulos[x]);
			}
			int opcao = leia.nextInt();
			switch (opcao) {
			case 0:
				System.out.println("\r\n" + "Fam�lia Monstro 2\r\n"
						+ "Elenco: Emily Carey, Ethan Rouse, Emily Watson, Jessica Briwn\r\n" + "Com�dia/Anima��o\r\n"
						+ "43 minutos\r\n" + "Classifica��o Livre\r\n" + "Diretor: Holger Tappe\r\n"
						+ "Para libertar Baba Yaga e Renfield das garras da ca�adora de monstros Mila Starr, a Fam�lia Wishbone\nmais uma vez transforma-se em uma vampira, o monstro de Frankenstein, uma m�mia e um lobisomem.\nAcompanhados por seus tr�s morceguinhos de estima��o, a fam�lia de monstros voa ao redor do mundo para salvar seus amigos, conhecendo novos\ncompanheiros monstruosos ao longo do caminho e, no final, entendendo que ningu�m � perfeito - e est� tudo bem.\r\n"
						+ "");
				sair();
				break;
			case 1:
				System.out.println("Homem-Aranha: Sem Volta para Casa\r\n" + "Elenco:\n" + "G�nero: A��o/Aventura\n"
						+ "2 h 28 minutos\n" + "Classifica��o Indicativa: 12 anos\n" + "Diretor: Jon Watts\r\n"
						+ "O Homem-Aranha precisa lidar com as consequ�ncias da sua verdadeira identidade ter sido descoberta.\r\n"
						+ "");
				sair();
				break;
			case 2:
				System.out.println("Ghostbusters: Mais Al�m\r\n"
						+ "Elenco:Mckenna Grace, Bill Muray, Finn Wolfhard, Dan Aykrod\n" + "G�nero:Fantasia/Com�dia\n"
						+ "2 h 4 minutos\n" + "Classifica��o Indicativa: 12 anos \n" + "Diretor:Jason Reitman \r\n"
						+ "Uma m�e solo e seus dois filhos se mudam para uma nova cidade e descobrem que t�m uma conex�o com os Ca�a-Fantasmas\noriginais e o legado secreto de seu av�.\r\n"
						+ "");
				sair();
				break;
			case 3:
				System.out.println("A bab� - O chamado das sombras\r\n"
						+ "Elenco: Oleg Chugunov, Glafiria Golubeva, Marta Timofeeva\n" + "G�nero:Terror/Suspense\n"
						+ "1 h 53 minutos\n" + "Classifica��o Indicativa: 12 anos \n"
						+ "Diretor: Svyatoslav Podgayevskiy\r\n"
						+ "Uma fam�lia se muda para um novo apartamento e contrata uma misteriosa bab�\npara cuidar da filha rec�m-nascida. Quando as duas desaparecem, eles descobrem que estavam lidando\ncom uma for�a demon�aca conhecida como Baba Yaga.\r\n"
						+ "");
				sair();
				break;
			}
		} else if (super.getIdade() < 18) {
			System.out.println("\n * * * FILMES EM CARTAZ * * *");
			for (int x = 0; x < 7; x++) {
				System.out.println("[" + x + "] " + titulos[x]);
			}
			int opcao = leia.nextInt();
			switch (opcao) {
			case 0:
				System.out.println("\r\n" + "Fam�lia Monstro 2\r\n"
						+ "Elenco: Emily Carey, Ethan Rouse, Emily Watson, Jessica Briwn\r\n" + "Com�dia/Anima��o\r\n"
						+ "43 minutos\r\n" + "Classifica��o Livre\r\n" + "Diretor: Holger Tappe\r\n"
						+ "Para libertar Baba Yaga e Renfield das garras da ca�adora de monstros Mila Starr, a Fam�lia Wishbone\nmais uma vez transforma-se em uma vampira, o monstro de Frankenstein, uma m�mia e um lobisomem.\nAcompanhados por seus tr�s morceguinhos de estima��o, a fam�lia de monstros voa ao redor do mundo para salvar seus amigos, conhecendo novos\ncompanheiros monstruosos ao longo do caminho e, no final, entendendo que ningu�m � perfeito - e est� tudo bem.\r\n"
						+ "");
				sair();
				break;
			case 1:
				System.out.println("Homem-Aranha: Sem Volta para Casa\r\n" + "Elenco:\n" + "G�nero: A��o/Aventura\n"
						+ "2 h 28 minutos\n" + "Classifica��o Indicativa: 12 anos\n" + "Diretor: Jon Watts\r\n"
						+ "O Homem-Aranha precisa lidar com as consequ�ncias da sua verdadeira identidade ter sido descoberta.\r\n"
						+ "");
				sair();
				break;
			case 2:
				System.out.println("Ghostbusters: Mais Al�m\r\n"
						+ "Elenco:Mckenna Grace, Bill Muray, Finn Wolfhard, Dan Aykrod\n" + "G�nero:Fantasia/Com�dia\n"
						+ "2 h 4 minutos\n" + "Classifica��o Indicativa: 12 anos \n" + "Diretor:Jason Reitman \r\n"
						+ "Uma m�e solo e seus dois filhos se mudam para uma nova cidade e descobrem que t�m uma conex�o com os Ca�a-Fantasmas\noriginais e o legado secreto de seu av�.\r\n"
						+ "");
				sair();
				break;
			case 3:
				System.out.println("A bab� - O chamado das sombras\r\n"
						+ "Elenco: Oleg Chugunov, Glafiria Golubeva, Marta Timofeeva\n" + "G�nero:Terror/Suspense\n"
						+ "1 h 53 minutos\n" + "Classifica��o Indicativa: 12 anos \n"
						+ "Diretor: Svyatoslav Podgayevskiy\r\n"
						+ "Uma fam�lia se muda para um novo apartamento e contrata uma misteriosa bab�\npara cuidar da filha rec�m-nascida. Quando as duas desaparecem, eles descobrem que estavam lidando\ncom uma for�a demon�aca conhecida como Baba Yaga.\r\n"
						+ "");
				sair();
				break;
			case 4:
				System.out.println("House Of Gucci\r\n" + "Elenco: Lady Gaga, Jared Leto, Adam Driver, Al Pacino \n"
						+ "G�nero: Drama\n" + "2 h 38 minutos\n" + "Classifica��o Indicativa: 14 anos\n"
						+ "Diretor: Ridley Scott\r\n"
						+ "O casamento e o div�rcio turbulento entre Patrizia e Maurizio Gucci leva a um assassinato.\r\n"
						+ "");
				sair();
				break;
			case 5:
				System.out.println("007 - Sem Tempo Para Morrer \r\n"
						+ "Elenco: Daniel Craig, L�a Seydoux, Rami Malek, Lashana Lynch\n" + "G�nero: A��o/Aventura\n"
						+ "2 h 43 minutos\n" + "Classifica��o Indicativa: 14 anos\r\n" + "Diretor: Cary Fukunaga\r\n"
						+ "James Bond deixa o MI6 e se muda para a Jamaica, mas um antigo amigo aparece e pede sua ajuda para encontrar um cientista\ndesaparecido. Bond mergulha no caso e percebe que a busca �, na verdade, uma corrida para salvar o mundo.\r\n"
						+ "");
				sair();
				break;
			case 6:
				System.out.println("Marighella\r\n"
						+ "Elenco: Bella Camero, Seu Jorge, Bruno Gagliasso, Humberto Carr�o\n"
						+ "G�nero: A��o/Drama \n" + "2h 35m \n" + "Classifica��o Indicativa: 16 anos\r\n"
						+ "Diretor: Wagner Moura \r\n"
						+ "Comandando um grupo de jovens guerrilheiros, Marighella tenta divulgar sua luta contra a ditadura\npara o povo brasileiro, mas a censura desacredita a revolu��o. Seu principal opositor\n� L�cio, policial que o rotula como inimigo p�blico.\r\n"
						+ "\r\n" + "");
				sair();
				break;
			}
		} else if (super.getIdade() >= 18) {
			System.out.println("\n * * * FILMES EM CARTAZ * * *");
			for (int x = 0; x < 9; x++) {
				System.out.println("[" + x + "] " + titulos[x]);
			}
			int opcao = leia.nextInt();
			switch (opcao) {
			case 0:
				System.out.println("\r\n" + "Fam�lia Monstro 2\r\n"
						+ "Elenco: Emily Carey, Ethan Rouse, Emily Watson, Jessica Briwn\r\n" + "Com�dia/Anima��o\r\n"
						+ "43 minutos\r\n" + "Classifica��o Livre\r\n" + "Diretor: Holger Tappe\r\n"
						+ "Para libertar Baba Yaga e Renfield das garras da ca�adora de monstros Mila Starr, a Fam�lia Wishbone\nmais uma vez transforma-se em uma vampira, o monstro de Frankenstein, uma m�mia e um lobisomem.\nAcompanhados por seus tr�s morceguinhos de estima��o, a fam�lia de monstros voa ao redor do mundo para salvar seus amigos, conhecendo novos\ncompanheiros monstruosos ao longo do caminho e, no final, entendendo que ningu�m � perfeito - e est� tudo bem.\r\n"
						+ "");
				sair();
				break;
			case 1:
				System.out.println("Homem-Aranha: Sem Volta para Casa\r\n" + "Elenco:\n" + "G�nero: A��o/Aventura\n"
						+ "2 h 28 minutos\n" + "Classifica��o Indicativa: 12 anos\n" + "Diretor: Jon Watts\r\n"
						+ "O Homem-Aranha precisa lidar com as consequ�ncias da sua verdadeira identidade ter sido descoberta.\r\n"
						+ "");
				sair();
				break;
			case 2:
				System.out.println("Ghostbusters: Mais Al�m\r\n"
						+ "Elenco:Mckenna Grace, Bill Muray, Finn Wolfhard, Dan Aykrod\n" + "G�nero:Fantasia/Com�dia\n"
						+ "2 h 4 minutos\n" + "Classifica��o Indicativa: 12 anos \n" + "Diretor:Jason Reitman \r\n"
						+ "Uma m�e solo e seus dois filhos se mudam para uma nova cidade e descobrem que t�m uma conex�o com os Ca�a-Fantasmas\noriginais e o legado secreto de seu av�.\r\n"
						+ "");
				sair();
				break;
			case 3:
				System.out.println("A bab� - O chamado das sombras\r\n"
						+ "Elenco: Oleg Chugunov, Glafiria Golubeva, Marta Timofeeva\n" + "G�nero:Terror/Suspense\n"
						+ "1 h 53 minutos\n" + "Classifica��o Indicativa: 12 anos \n"
						+ "Diretor: Svyatoslav Podgayevskiy\r\n"
						+ "Uma fam�lia se muda para um novo apartamento e contrata uma misteriosa bab�\npara cuidar da filha rec�m-nascida. Quando as duas desaparecem, eles descobrem que estavam lidando\ncom uma for�a demon�aca conhecida como Baba Yaga.\r\n"
						+ "");
				sair();
				break;
			case 4:
				System.out.println("House Of Gucci\r\n" + "Elenco: Lady Gaga, Jared Leto, Adam Driver, Al Pacino \n"
						+ "G�nero: Drama\n" + "2 h 38 minutos\n" + "Classifica��o Indicativa: 14 anos\n"
						+ "Diretor: Ridley Scott\r\n"
						+ "O casamento e o div�rcio turbulento entre Patrizia e Maurizio Gucci leva a um assassinato.\r\n"
						+ "");
				sair();
				break;
			case 5:
				System.out.println("007 - Sem Tempo Para Morrer \r\n"
						+ "Elenco: Daniel Craig, L�a Seydoux, Rami Malek, Lashana Lynch\n" + "G�nero: A��o/Aventura\n"
						+ "2 h 43 minutos\n" + "Classifica��o Indicativa: 14 anos\r\n" + "Diretor: Cary Fukunaga\r\n"
						+ "James Bond deixa o MI6 e se muda para a Jamaica, mas um antigo amigo aparece e pede sua ajuda para encontrar um cientista\ndesaparecido. Bond mergulha no caso e percebe que a busca �, na verdade, uma corrida para salvar o mundo.\r\n"
						+ "");
				sair();
				break;
			case 6:
				System.out.println("Marighella\r\n"
						+ "Elenco: Bella Camero, Seu Jorge, Bruno Gagliasso, Humberto Carr�o\n"
						+ "G�nero: A��o/Drama \n" + "2h 35m \n" + "Classifica��o Indicativa: 16 anos\r\n"
						+ "Diretor: Wagner Moura \r\n"
						+ "Comandando um grupo de jovens guerrilheiros, Marighella tenta divulgar sua luta contra a ditadura\npara o povo brasileiro, mas a censura desacredita a revolu��o. Seu principal opositor\n� L�cio, policial que o rotula como inimigo p�blico.\r\n"
						+ "\r\n" + "");
				sair();
				break;
			case 7:
				System.out.println("\r\n" + "Matrix Resurrections\r\n"
						+ "Elenco: Keaunu Reeves, Carrie-A-Moss, Pryanka Chopra\n" + "G�nero:Fic��o cient�fica/A��o\n"
						+ "2h 28m\n" + "Classifica��o Indicativa: 18 anos \n" + "Diretor: Lana Lana Wachowski\r\n"
						+ "�Em um mundo de duas realidades - a vida cotidiana e o que se esconde atr�s dela - Thomas Anderson\nprecisar� escolher novamente seguir o Coelho Branco. Escolha, uma mera\nilus�o, � o �nico caminho para entrar ou sair da Matrix, que est�\nmais forte, segura e perigosa do que nunca�\r\n"
						+ "");
				sair();
				break;
			case 8:
				System.out.println("Eternos\r\n" + "Elenco: Harry Styles, Angelina Jolie , Kit Harrigton Salma Hayek\n"
						+ "G�nero: Aventura/A��o\n" + "2h 37m \n" + "Classifica��o Indicativa: 18 anos\n"
						+ "Diretor: Chlo� Zhao \r\n"
						+ "Os Eternos s�o uma ra�a de seres imortais que viveram durante a antiguidade da Terra, moldando\nsua hist�ria e suas civiliza��es enquanto batalhavam os malignos Deviantes.\r\n"
						+ "\r\n" + "");
				sair();
				break;
			}
		}
	}
}
