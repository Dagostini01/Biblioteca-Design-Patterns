package model;

import observer.Observer;

public class Aluno implements Observer {
    private String nome;
    private int numeroMatricula;

    public Aluno() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public Aluno(String nome, int numeroMatricula) {
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    @Override
    public void update(Livro livro) {
        System.out.println("Notificação para " + nome + ": O livro '" + livro.getTitulo() + "' está disponível para empréstimo novamente.");
    }
}
