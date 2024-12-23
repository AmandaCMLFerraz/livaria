package amanda.ferraz.livraria.Services;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import amanda.ferraz.livraria.Autor;
import amanda.ferraz.livraria.Cliente;

public class CadastroService {
    Scanner scanner = new Scanner(System.in);

    public void cadastrarCliente(){
        System.out.println("\nDigite o ID do cliente: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nDigite o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.println("\nDigite a data de nascimento do cliente: ");
        String dataNascimento = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(dataNascimento, formatter);

        Date dataNascimentoCliente = Date.valueOf(localDate);

        System.out.println("\nDigite o e-mail do cliente: ");
        String email = scanner.nextLine();

        Cliente cliente = new Cliente(id, nome, email);
        cliente.setDataNascimento(dataNascimentoCliente);
        
        
    }

    public void cadastrarAutor(){
        System.out.println("\nDigite o ID do autor: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("\nDigite o nome do autor: ");
        String nome = scanner.nextLine();

        System.out.println("\nDigite a data de nascimento do autor: ");
        String dataNascimento = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(dataNascimento, formatter);

        Date dataNascimentoAutor = Date.valueOf(localDate);

        Autor autor = new Autor(id, nome);
        autor.setDataNascimento(dataNascimentoAutor);

        System.out.println("\nAutor Criado:");
        System.out.println("ID: " + autor.getId());
        System.out.println("Nome: " + autor.getNome());
        System.out.println("Data de Nascimento: " + autor.getDataNascimento());
        
        // Fechar o scanner
        scanner.close();
    }
}
