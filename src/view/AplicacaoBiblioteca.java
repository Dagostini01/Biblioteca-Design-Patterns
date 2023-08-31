package view;

import controller.BibliotecaController;
import model.Aluno;
import model.Livro;

public class AplicacaoBiblioteca {
    public static void main(String[] args) {

            BibliotecaController controller = new BibliotecaController();

            Aluno aluno = new Aluno("João", 12345);
            Livro livro = new Livro("Dom Casmurro", "Machado de Assis", "978-85-208-0129-1", 3);

            controller.registrarLivro("Harry Potter", "J.K. Rowling", "978-85-368-0728-0", 5);
            controller.emprestarLivro(livro, aluno);
            controller.devolverLivro(livro);
    }
}