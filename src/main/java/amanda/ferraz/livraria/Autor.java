package amanda.ferraz.livraria;

import java.util.Date;

public class Autor {
    private int id;
    private String nome;
    private Date dataNascimento;

    public Autor(int id, String nome){
        this.id = id;
        this.nome = nome; 
        this.dataNascimento = new Date();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}