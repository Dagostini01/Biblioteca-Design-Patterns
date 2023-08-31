package view;

import controller.BibliotecaController;
import model.Aluno;
import model.Livro;

public class AplicacaoBiblioteca {
    public static void main(String[] args) {
        BibliotecaController controller = new BibliotecaController();

        Aluno aluno1 = new Aluno("Alice", 1001);
        Aluno aluno2 = new Aluno("Bob", 1002);

        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", "978-85-208-0129-1", 3);

        controller.registrarLivro("Harry Potter", "J.K. Rowling", "978-85-368-0728-0", 5);

        livro.addObserver(aluno1);
        livro.addObserver(aluno2);

        controller.emprestarLivro(livro, aluno1);
        controller.devolverLivro(livro);

        livro.removeObserver(aluno1);

        controller.emprestarLivro(livro, aluno2);
    }
}
