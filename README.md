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
