package amanda.ferraz.livraria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente {
    private int id;
    private String nome; 
    private Date dataNascimento;
    private String email;
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public Cliente(int id, String nome, String email){
        this.id = id;
        this.nome = nome;
        this.dataNascimento = new Date();
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome() {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento() {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail() {
        this.email = email;
    }
}
