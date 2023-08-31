# Biblioteca-Design-Patterns
# Biblioteca Modernizada com Padrão Observer

Este é um projeto de gerenciamento de uma biblioteca, desenvolvido em Java, que inclui a implementação do padrão de projeto Observer.

## Design Pattern Observer

O **Observer** é um padrão de projeto comportamental que define uma dependência um-para-muitos entre objetos, para que quando um objeto mude de estado, todos os seus dependentes sejam notificados e atualizados automaticamente.

No contexto deste projeto, o padrão Observer é usado para gerenciar a relação entre livros e alunos. Quando um livro é emprestado e, posteriormente, devolvido, os alunos observadores são notificados automaticamente sobre a disponibilidade do livro novamente.

## Funcionalidades

O sistema possui as seguintes funcionalidades:

- Registro de livros, incluindo título, autor, ISBN e quantidade disponível.
- Empréstimo de livros para alunos, garantindo que cada livro seja emprestado apenas uma vez.
- Devolução de livros por alunos.
- Implementação do padrão de projeto Observer para notificar alunos quando um livro estiver disponível para empréstimo novamente.

## Uso do Padrão Observer

O padrão Observer é implementado nas classes `Livro`, que atua como o "subject" (ou sujeito), e `Aluno`, que atua como o "observer" (ou observador). A relação entre eles é gerenciada pelo controlador `BibliotecaController`.

- A classe `Livro` implementa a interface `Subject` e mantém uma lista de observadores (alunos) que são notificados quando o estado do livro muda.
- A classe `Aluno` implementa a interface `Observer` e recebe notificações sobre as mudanças nos livros.

A classe `BibliotecaController` gerencia o empréstimo, devolução e registro de livros, além de conectar os observadores aos sujeitos.

## Como Executar

Para executar o projeto:

1. Clone este repositório.
2. Certifique-se de ter o Java JDK instalado em sua máquina.
3. Navegue até a pasta `src/main/java` no terminal.
4. Compile os arquivos `.java` usando o comando `javac model/*.java controller/*.java view/*.java`.
5. Execute o aplicativo usando o comando `java view.AplicacaoBiblioteca`.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir problemas ou enviar pull requests.
