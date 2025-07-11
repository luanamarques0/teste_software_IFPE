# Projeto Java - Testes de Unidade e Integração

Resolução das questões propostas para praticar a criação de classes em Java e testes automatizados com JUnit, focando em testes de unidade e integração.

---

## Atividade 1 - Biblioteca e Livro

### Objetivo
Desenvolver as classes **Livro** e **Biblioteca**, aplicando testes de unidade e integração para verificar o comportamento esperado dos métodos implementados.

### Requisitos

- **Classe Livro**
  - Atributos: `nome`, `edicao`, `autor`, `ISBN`
  - Métodos: construtor, getters e setters
  - Método `verificaLancamento()`: retorna `true` se a edição for maior que 2022, `false` caso contrário.

- **Teste LivroTest**
  - Testar todos os métodos da classe, especialmente o `verificaLancamento()`.

- **Classe Biblioteca**
  - Atributos: `nome`, `CNPJ`, `anoFundacao`
  - Métodos: construtor, getters e setters
  - Método `patrimonioHistorico()`: retorna `true` se o ano de fundação for menor que 1980.

- **Teste BibliotecaTest**
  - Testar todos os métodos da classe, especialmente o `patrimonioHistorico()`.

- **Integração entre Livro e Biblioteca**
  - Adicionar na classe Biblioteca um atributo `listaLivros` do tipo `ArrayList<Livro>`.
  - Métodos para consultar, incluir e remover livros.
  - Método `acervoPremium()`: retorna `true` se pelo menos 5 livros da lista forem lançamentos (edição > 2022).

- **Teste adicional em BibliotecaTest**
  - Testar o método `acervoPremium()` e registrar os erros encontrados e as correções feitas após os testes.

---

## Atividade 2 - Produto, Pedido e Gestão

### Objetivo
Criar as classes **Produto**, **Pedido** e **Gestão**, implementando funcionalidades para manipulação de pedidos e cálculo do valor total, além de testar cenários comuns e limites com JUnit.

### Requisitos

- **Classe Produto**
  - Atributos: `nome`, `preco`
  - Métodos: construtor, getters e setters.

- **Classe Pedido**
  - Contém uma lista de produtos.
  - Métodos para adicionar, remover e retornar a quantidade de produtos.

- **Classe Gestão**
  - Recebe um objeto Pedido no construtor.
  - Método `valorTotalVenda()`: soma os preços de todos os produtos no pedido.

- **Teste GestãoTest**
  - Testar o método `valorTotalVenda()`.

- **Verificações importantes após testes:**
  - O que acontece se o mesmo produto for adicionado mais de uma vez?
  - O cálculo do total é correto quando o pedido está vazio?
  - Como produtos com preço negativo afetam o total?

- **Registro de alterações feitas no código após a execução dos testes.**

---

**Autor:** Luana Marques
**Data:** 07/2025

