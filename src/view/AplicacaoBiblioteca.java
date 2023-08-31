package view;

import controller.BibliotecaController;
import model.Aluno;
import model.Livro;

public class AplicacaoBiblioteca {
    public static void main(String[] args) {
        BibliotecaController controller = new BibliotecaController();

        Aluno aluno1 = new Aluno("Pedro", 94283);
        Aluno aluno2 = new Aluno("Marcus", 94279);

        Livro livro = new Livro("Código Limpo", "Bill Gates", "589875200044", 1);

        controller.registrarLivro("Entendendo algoritmos", "Albert Einstein", "52545210054", 1);

        livro.addObserver(aluno1);
        livro.addObserver(aluno2);

        controller.emprestarLivro(livro, aluno1);
        controller.devolverLivro(livro);

        // Remover aluno1 como observador do livro
        livro.removeObserver(aluno1);

        controller.emprestarLivro(livro, aluno2);
    }
}

