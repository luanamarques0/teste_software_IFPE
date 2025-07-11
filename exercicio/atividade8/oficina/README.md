# Projeto Java - Testes de Unidade e Integração

Resolução das atividades práticas com foco em desenvolvimento orientado a objetos em Java, testes de unidade com JUnit e testes de integração entre objetos.

---

## Atividade 1 - Projeto Triângulo

### Objetivo
Recuperar o projeto Triângulo da atividade anterior e expandi-lo com novos comportamentos e testes.

### Requisitos

- **Classe Triangulo**
  - Atributos: `ladoUm`, `ladoDois`, `ladoTres`
  - Métodos:
    - `classificacaoTriangulos()`: identifica se o triângulo é equilátero, isósceles, escaleno ou inválido.
    - `calcularPerimetro()`: retorna a soma dos lados do triângulo.

- **Testes**
  - Adição de testes unitários para `calcularPerimetro()`.
  - Reexecução dos testes antigos para verificar se ainda se comportam como esperado (**teste de regressão**).

---

## Atividade 2 - Projeto Livros e Bibliotecas

### Objetivo
Modificar o comportamento do método de patrimônio histórico e reavaliar os testes existentes.

### Requisitos

- **Classe Biblioteca**
  - Atributos: `nome`, `cnpj`, `anoFundacao`
  - Método `patrimonioHistorico()`: retorna `true` se o ano de fundação for menor que **1950** (regra atualizada).

- **Testes**
  - Reexecução dos testes antigos para detectar falhas causadas pela alteração da regra.
  - Atualização dos testes para refletirem a nova condição.
  - Validação do comportamento esperado (**teste de regressão**).

---

## Atividade 3 - Projeto OFICINA

### Objetivo
Criar um sistema de oficina com classes inter-relacionadas e testes de unidade/integrados.

### Requisitos

#### a) Classe `Mecanico`
- Atributos: `matricula`, `nome`, `lista de especialidades`.
- Método `funcionarioPremium()`: retorna `true` se o mecânico possuir **mais de duas especialidades**.
  - ⚠️ Regra atualizada: agora considera **mais de uma especialidade** como premium.
- Testes de unidade criados para validar o comportamento, incluindo cenários com especialidades duplicadas.

#### b) Classe `Veiculo`
- Atributos: `placa`, `tipo` (enum `TipoCarro`), `numOcorrencias`, `anoFabricacao`.
- Método `calcularGarantia()`: retorna o ano de expiração da garantia:
  - ⚠️ Regra anterior: SUV (3 anos), PICKUP (5 anos), POPULAR (2 anos).
  - ✅ Regra atual: todos os tipos possuem **garantia de 2 anos** a partir da fabricação.
- Testes de unidade atualizados conforme a nova regra.

#### c) Classe `Servico`
- Atributos: `id` (gerado automaticamente), `motivo`, `mecanico`, `veiculo`.
- Construtor recebe apenas a matrícula do mecânico e a placa do veículo.
- Método `ordemServico(String motivo)`:
  - Registra o motivo do serviço.
  - Incrementa o número de ocorrências do veículo.
- Testes de unidade criados para validar integração entre as classes `Servico`, `Mecanico` e `Veiculo`.

---

## Testes de Regressão

Após cada alteração de regra:
- Todos os testes anteriores foram executados novamente.
- Testes que não atendiam mais às novas regras foram **ajustados**.
- Novos testes foram adicionados para validar os comportamentos atualizados.
- Nenhum comportamento indesejado foi identificado após a refatoração.

---

**Autor:** Luana Marques
**Data:** 07/2025