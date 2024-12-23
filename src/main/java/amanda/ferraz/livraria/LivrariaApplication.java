package amanda.ferraz.livraria;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import amanda.ferraz.livraria.Services.CadastroService;

@SpringBootApplication
public class LivrariaApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Biblioteca biblioteca = new Biblioteca();
		CadastroService cadastroService = new CadastroService(); //Criando uma instância de CadastroService

			exibirMenuPrincipal();
			String opcao = scanner.nextLine();

			switch(opcao) {
				case "1":
					exibirMenuCadastros();
					String opcaoCadastro = scanner.nextLine();
					switch (opcaoCadastro) {
						// case "1":
						// 	cadastroService.cadastrarCliente();
						// 	break;
						// }
						case "2":
							cadastroService.cadastrarAutor();
							break;
						}
				case "2":
					exibirMenuListagens();
					break;
				case "3":
					
				break;
			}
	}

	private static void exibirMenuPrincipal() {
		System.out.println("\nEscolha uma opção:\n1 - Cadastros\n2 - Listagens\n3 - Realizar empréstimo");
		System.out.println("Opção: ");
	}

	private static void exibirMenuCadastros() {
        System.out.println("\nEscolha uma opção:\n1 - Cadastrar cliente\n2 - Cadastrar autor\n3 - Cadastrar livro");
		System.out.println("Opção: ");
    }

	private static void exibirMenuListagens() {
        System.out.println("\nEscolha uma opção:\n1 - Listar clientes\n2 - Cadastrar autores\n3 - Cadastrar livros");
		System.out.println("Opção: ");
    }

}
