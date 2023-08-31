package controller;

public class BibliotecaController {
    private Map<Livro, Aluno> emprestimos = new HashMap<>();

    public void emprestarLivro(Livro livro, Aluno aluno) {
        if (livro.getCopiasDisponiveis() > 0 && !emprestimos.containsKey(livro)) {
            livro.setCopiasDisponiveis(livro.getCopiasDisponiveis() - 1);
            emprestimos.put(livro, aluno);
            System.out.println("Livro emprestado com sucesso para " + aluno.getNome());
        } else {
            System.out.println("Livro indisponível para empréstimo");
        }
    }

    public void devolverLivro(Livro livro) {
        if (emprestimos.containsKey(livro)) {
            Aluno aluno = emprestimos.remove(livro);
            livro.setCopiasDisponiveis(livro.getCopiasDisponiveis() + 1);
            System.out.println("Livro devolvido por " + aluno.getNome());
        } else {
            System.out.println("O livro não estava emprestado");
        }
    }

    public void registrarLivro(String titulo, String autor, String isbn, int quantidade) {
        Livro livro = new Livro(titulo, autor, isbn, quantidade);
        System.out.println("Livro registrado: " + livro.getTitulo());
    }
}
