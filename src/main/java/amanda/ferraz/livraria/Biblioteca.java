package amanda.ferraz.livraria;

import java.util.ArrayList;
import java.util.List;
 
public class Biblioteca {
    private List<Cliente> clientes = new ArrayList<>();
    private List<Livro> livros = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();
    
    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> listarClientes() {
        return clientes;
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public List<Livro> listarLivros() {
        return livros;
    }

    public List<Livro> listarLivrosDisponiveis() {
        List<Livro> livrosDisponiveis = new ArrayList<>();
        for (Livro livro : livros) { //For each - ver sobre
            if (livro.isDisponivel()) {
                livrosDisponiveis.add(livro);
            }
        }
        return livrosDisponiveis;
    }

    public Livro buscarLivroPorId(int id) {
        for (Livro livro : livros) { //For each - ver sobre
            if (livro.getId() == id) {
                return livro;
            }
        }
        return null;
    }

    public void atualizarLivro(int id, String novoTitulo) {
        for (Livro livro : livros) {
            if (livro.getId() == id) {
                livro.setTitulo(novoTitulo);
            }
        }
    }

    public void removerLivro(int id) {
        livros.removeIf(livro -> livro.getId() == id);
    }
    
}
