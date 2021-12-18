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

	String[] titulos = { "Família Monstro 2", "Homem-Aranha: Sem Volta para Casa", "Ghostbusters: Mais Além",
			"A babá - O chamado das sombras", "House of  Gucci", "007 - Sem Tempo Para Morrer", "Marighella",
			"Matrix Resurrections", "Eternos" };

	public void imprimir() {
		if (super.getIdade() <= 12) {
			System.out.println("\n * * * FILMES EM CARTAZ * * *");
			System.out.println("\nAbaixo estão listados os filmes de acordo com sua faixa etária.");
			System.out.println("\nDigite a opção numérica para maiores detalhes sobre os filmes: \n");
			for (int x = 0; x < 4; x++) {
				System.out.println("[" + x + "] " + titulos[x]);
			}
			int opcao = leia.nextInt();
			switch (opcao) {
			case 0:
				System.out.println("\r\n" + "Família Monstro 2\r\n"
						+ "Elenco: Emily Carey, Ethan Rouse, Emily Watson, Jessica Briwn\r\n" + "Comédia/Animação\r\n"
						+ "43 minutos\r\n" + "Classificação Livre\r\n" + "Diretor: Holger Tappe\r\n"
						+ "Para libertar Baba Yaga e Renfield das garras da caçadora de monstros Mila Starr, a Família Wishbone\nmais uma vez transforma-se em uma vampira, o monstro de Frankenstein, uma múmia e um lobisomem.\nAcompanhados por seus três morceguinhos de estimação, a família de monstros voa ao redor do mundo para salvar seus amigos, conhecendo novos\ncompanheiros monstruosos ao longo do caminho e, no final, entendendo que ninguém é perfeito - e está tudo bem.\r\n"
						+ "");
				sair();
				break;
			case 1:
				System.out.println("Homem-Aranha: Sem Volta para Casa\r\n" + "Elenco:\n" + "Gênero: Ação/Aventura\n"
						+ "2 h 28 minutos\n" + "Classificação Indicativa: 12 anos\n" + "Diretor: Jon Watts\r\n"
						+ "O Homem-Aranha precisa lidar com as consequências da sua verdadeira identidade ter sido descoberta.\r\n"
						+ "");
				sair();
				break;
			case 2:
				System.out.println("Ghostbusters: Mais Além\r\n"
						+ "Elenco:Mckenna Grace, Bill Muray, Finn Wolfhard, Dan Aykrod\n" + "Gênero:Fantasia/Comédia\n"
						+ "2 h 4 minutos\n" + "Classificação Indicativa: 12 anos \n" + "Diretor:Jason Reitman \r\n"
						+ "Uma mãe solo e seus dois filhos se mudam para uma nova cidade e descobrem que têm uma conexão com os Caça-Fantasmas\noriginais e o legado secreto de seu avô.\r\n"
						+ "");
				sair();
				break;
			case 3:
				System.out.println("A babá - O chamado das sombras\r\n"
						+ "Elenco: Oleg Chugunov, Glafiria Golubeva, Marta Timofeeva\n" + "Gênero:Terror/Suspense\n"
						+ "1 h 53 minutos\n" + "Classificação Indicativa: 12 anos \n"
						+ "Diretor: Svyatoslav Podgayevskiy\r\n"
						+ "Uma família se muda para um novo apartamento e contrata uma misteriosa babá\npara cuidar da filha recém-nascida. Quando as duas desaparecem, eles descobrem que estavam lidando\ncom uma força demoníaca conhecida como Baba Yaga.\r\n"
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
				System.out.println("\r\n" + "Família Monstro 2\r\n"
						+ "Elenco: Emily Carey, Ethan Rouse, Emily Watson, Jessica Briwn\r\n" + "Comédia/Animação\r\n"
						+ "43 minutos\r\n" + "Classificação Livre\r\n" + "Diretor: Holger Tappe\r\n"
						+ "Para libertar Baba Yaga e Renfield das garras da caçadora de monstros Mila Starr, a Família Wishbone\nmais uma vez transforma-se em uma vampira, o monstro de Frankenstein, uma múmia e um lobisomem.\nAcompanhados por seus três morceguinhos de estimação, a família de monstros voa ao redor do mundo para salvar seus amigos, conhecendo novos\ncompanheiros monstruosos ao longo do caminho e, no final, entendendo que ninguém é perfeito - e está tudo bem.\r\n"
						+ "");
				sair();
				break;
			case 1:
				System.out.println("Homem-Aranha: Sem Volta para Casa\r\n" + "Elenco:\n" + "Gênero: Ação/Aventura\n"
						+ "2 h 28 minutos\n" + "Classificação Indicativa: 12 anos\n" + "Diretor: Jon Watts\r\n"
						+ "O Homem-Aranha precisa lidar com as consequências da sua verdadeira identidade ter sido descoberta.\r\n"
						+ "");
				sair();
				break;
			case 2:
				System.out.println("Ghostbusters: Mais Além\r\n"
						+ "Elenco:Mckenna Grace, Bill Muray, Finn Wolfhard, Dan Aykrod\n" + "Gênero:Fantasia/Comédia\n"
						+ "2 h 4 minutos\n" + "Classificação Indicativa: 12 anos \n" + "Diretor:Jason Reitman \r\n"
						+ "Uma mãe solo e seus dois filhos se mudam para uma nova cidade e descobrem que têm uma conexão com os Caça-Fantasmas\noriginais e o legado secreto de seu avô.\r\n"
						+ "");
				sair();
				break;
			case 3:
				System.out.println("A babá - O chamado das sombras\r\n"
						+ "Elenco: Oleg Chugunov, Glafiria Golubeva, Marta Timofeeva\n" + "Gênero:Terror/Suspense\n"
						+ "1 h 53 minutos\n" + "Classificação Indicativa: 12 anos \n"
						+ "Diretor: Svyatoslav Podgayevskiy\r\n"
						+ "Uma família se muda para um novo apartamento e contrata uma misteriosa babá\npara cuidar da filha recém-nascida. Quando as duas desaparecem, eles descobrem que estavam lidando\ncom uma força demoníaca conhecida como Baba Yaga.\r\n"
						+ "");
				sair();
				break;
			case 4:
				System.out.println("House Of Gucci\r\n" + "Elenco: Lady Gaga, Jared Leto, Adam Driver, Al Pacino \n"
						+ "Gênero: Drama\n" + "2 h 38 minutos\n" + "Classificação Indicativa: 14 anos\n"
						+ "Diretor: Ridley Scott\r\n"
						+ "O casamento e o divórcio turbulento entre Patrizia e Maurizio Gucci leva a um assassinato.\r\n"
						+ "");
				sair();
				break;
			case 5:
				System.out.println("007 - Sem Tempo Para Morrer \r\n"
						+ "Elenco: Daniel Craig, Léa Seydoux, Rami Malek, Lashana Lynch\n" + "Gênero: Ação/Aventura\n"
						+ "2 h 43 minutos\n" + "Classificação Indicativa: 14 anos\r\n" + "Diretor: Cary Fukunaga\r\n"
						+ "James Bond deixa o MI6 e se muda para a Jamaica, mas um antigo amigo aparece e pede sua ajuda para encontrar um cientista\ndesaparecido. Bond mergulha no caso e percebe que a busca é, na verdade, uma corrida para salvar o mundo.\r\n"
						+ "");
				sair();
				break;
			case 6:
				System.out.println("Marighella\r\n"
						+ "Elenco: Bella Camero, Seu Jorge, Bruno Gagliasso, Humberto Carrão\n"
						+ "Gênero: Ação/Drama \n" + "2h 35m \n" + "Classificação Indicativa: 16 anos\r\n"
						+ "Diretor: Wagner Moura \r\n"
						+ "Comandando um grupo de jovens guerrilheiros, Marighella tenta divulgar sua luta contra a ditadura\npara o povo brasileiro, mas a censura desacredita a revolução. Seu principal opositor\né Lúcio, policial que o rotula como inimigo público.\r\n"
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
				System.out.println("\r\n" + "Família Monstro 2\r\n"
						+ "Elenco: Emily Carey, Ethan Rouse, Emily Watson, Jessica Briwn\r\n" + "Comédia/Animação\r\n"
						+ "43 minutos\r\n" + "Classificação Livre\r\n" + "Diretor: Holger Tappe\r\n"
						+ "Para libertar Baba Yaga e Renfield das garras da caçadora de monstros Mila Starr, a Família Wishbone\nmais uma vez transforma-se em uma vampira, o monstro de Frankenstein, uma múmia e um lobisomem.\nAcompanhados por seus três morceguinhos de estimação, a família de monstros voa ao redor do mundo para salvar seus amigos, conhecendo novos\ncompanheiros monstruosos ao longo do caminho e, no final, entendendo que ninguém é perfeito - e está tudo bem.\r\n"
						+ "");
				sair();
				break;
			case 1:
				System.out.println("Homem-Aranha: Sem Volta para Casa\r\n" + "Elenco:\n" + "Gênero: Ação/Aventura\n"
						+ "2 h 28 minutos\n" + "Classificação Indicativa: 12 anos\n" + "Diretor: Jon Watts\r\n"
						+ "O Homem-Aranha precisa lidar com as consequências da sua verdadeira identidade ter sido descoberta.\r\n"
						+ "");
				sair();
				break;
			case 2:
				System.out.println("Ghostbusters: Mais Além\r\n"
						+ "Elenco:Mckenna Grace, Bill Muray, Finn Wolfhard, Dan Aykrod\n" + "Gênero:Fantasia/Comédia\n"
						+ "2 h 4 minutos\n" + "Classificação Indicativa: 12 anos \n" + "Diretor:Jason Reitman \r\n"
						+ "Uma mãe solo e seus dois filhos se mudam para uma nova cidade e descobrem que têm uma conexão com os Caça-Fantasmas\noriginais e o legado secreto de seu avô.\r\n"
						+ "");
				sair();
				break;
			case 3:
				System.out.println("A babá - O chamado das sombras\r\n"
						+ "Elenco: Oleg Chugunov, Glafiria Golubeva, Marta Timofeeva\n" + "Gênero:Terror/Suspense\n"
						+ "1 h 53 minutos\n" + "Classificação Indicativa: 12 anos \n"
						+ "Diretor: Svyatoslav Podgayevskiy\r\n"
						+ "Uma família se muda para um novo apartamento e contrata uma misteriosa babá\npara cuidar da filha recém-nascida. Quando as duas desaparecem, eles descobrem que estavam lidando\ncom uma força demoníaca conhecida como Baba Yaga.\r\n"
						+ "");
				sair();
				break;
			case 4:
				System.out.println("House Of Gucci\r\n" + "Elenco: Lady Gaga, Jared Leto, Adam Driver, Al Pacino \n"
						+ "Gênero: Drama\n" + "2 h 38 minutos\n" + "Classificação Indicativa: 14 anos\n"
						+ "Diretor: Ridley Scott\r\n"
						+ "O casamento e o divórcio turbulento entre Patrizia e Maurizio Gucci leva a um assassinato.\r\n"
						+ "");
				sair();
				break;
			case 5:
				System.out.println("007 - Sem Tempo Para Morrer \r\n"
						+ "Elenco: Daniel Craig, Léa Seydoux, Rami Malek, Lashana Lynch\n" + "Gênero: Ação/Aventura\n"
						+ "2 h 43 minutos\n" + "Classificação Indicativa: 14 anos\r\n" + "Diretor: Cary Fukunaga\r\n"
						+ "James Bond deixa o MI6 e se muda para a Jamaica, mas um antigo amigo aparece e pede sua ajuda para encontrar um cientista\ndesaparecido. Bond mergulha no caso e percebe que a busca é, na verdade, uma corrida para salvar o mundo.\r\n"
						+ "");
				sair();
				break;
			case 6:
				System.out.println("Marighella\r\n"
						+ "Elenco: Bella Camero, Seu Jorge, Bruno Gagliasso, Humberto Carrão\n"
						+ "Gênero: Ação/Drama \n" + "2h 35m \n" + "Classificação Indicativa: 16 anos\r\n"
						+ "Diretor: Wagner Moura \r\n"
						+ "Comandando um grupo de jovens guerrilheiros, Marighella tenta divulgar sua luta contra a ditadura\npara o povo brasileiro, mas a censura desacredita a revolução. Seu principal opositor\né Lúcio, policial que o rotula como inimigo público.\r\n"
						+ "\r\n" + "");
				sair();
				break;
			case 7:
				System.out.println("\r\n" + "Matrix Resurrections\r\n"
						+ "Elenco: Keaunu Reeves, Carrie-A-Moss, Pryanka Chopra\n" + "Gênero:Ficção científica/Ação\n"
						+ "2h 28m\n" + "Classificação Indicativa: 18 anos \n" + "Diretor: Lana Lana Wachowski\r\n"
						+ "“Em um mundo de duas realidades - a vida cotidiana e o que se esconde atrás dela - Thomas Anderson\nprecisará escolher novamente seguir o Coelho Branco. Escolha, uma mera\nilusão, é o único caminho para entrar ou sair da Matrix, que está\nmais forte, segura e perigosa do que nunca”\r\n"
						+ "");
				sair();
				break;
			case 8:
				System.out.println("Eternos\r\n" + "Elenco: Harry Styles, Angelina Jolie , Kit Harrigton Salma Hayek\n"
						+ "Gênero: Aventura/Ação\n" + "2h 37m \n" + "Classificação Indicativa: 18 anos\n"
						+ "Diretor: Chloé Zhao \r\n"
						+ "Os Eternos são uma raça de seres imortais que viveram durante a antiguidade da Terra, moldando\nsua história e suas civilizações enquanto batalhavam os malignos Deviantes.\r\n"
						+ "\r\n" + "");
				sair();
				break;
			}
		}
	}
}
