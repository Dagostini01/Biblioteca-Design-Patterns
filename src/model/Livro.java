package model;

public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private int copiasDisponiveis;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Livro() {
    }

    public Livro(String titulo, String autor, String isbn, int copiasDisponiveis) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.copiasDisponiveis = copiasDisponiveis;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setCopiasDisponiveis(int copiasDisponiveis) {
        this.copiasDisponiveis = copiasDisponiveis;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getCopiasDisponiveis() {
        return copiasDisponiveis;
    }
}
