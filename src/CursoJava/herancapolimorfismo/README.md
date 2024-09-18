# Projeto de Herança e Polimorfismo

Este projeto aborda conceitos de **Herança** e **Polimorfismo** em Java.

## 📚 Exercícios

### Exercício 01
Crie uma hierarquia de classes com os seguintes atributos e comportamentos:
- Utilize uma classe base `Animal` com características comuns.
- Crie subclasses para diferentes tipos de animais.

### Exercício 02
Implemente um programa que crie os três tipos de animais definidos no exercício anterior e invoque o método que emite o som de cada um de forma polimórfica.

### Exercício 03
Implemente uma classe `Veterinario` com um método `examinar()` que recebe um objeto da classe `Animal`. O método deve fazer o animal emitir um som. Passe os três animais como parâmetro.

### Exercício 04
Crie uma classe `Zoologico` com 10 jaulas (utilize um array). Coloque em cada jaula um animal diferente, percorra cada jaula e emita o som e, se o tipo de animal possuir o comportamento, faça-o correr.

### Exercício 05
Implemente um modelo para manter o registro da vida acadêmica de todos os funcionários:
- 5.1 Para funcionários que não estudaram: apenas o nome e o código funcional.
- 5.2 Para funcionários com ensino básico: a escola.
- 5.3 Para funcionários com ensino médio: a escola.
- 5.4 Para funcionários com graduação: a Universidade.

### Exercício 06
Estenda o modelo para que todo funcionário possua uma renda básica de R$1000,00 e ajuste a renda total conforme o nível de escolaridade:
- Ensino básico: renda básica + 10%
- Ensino médio: renda do nível anterior + 50%
- Graduação: renda do nível anterior + 100%

### Exercício 07
Crie um programa para simular uma empresa com 10 funcionários. Distribua a escolaridade dos funcionários como segue:
- 40% com ensino básico
- 40% com ensino médio
- 20% com nível superior
Calcule os custos da empresa com salários totais e por nível de escolaridade.

### Exercício 08
Crie uma hierarquia de Comissões:
- Gerente: R$1500,00
- Supervisor: R$600,00
- Vendedor: R$250,00

### Exercício 09
Adicione um atributo de comissão à classe `Funcionario` e ajuste o método `rendaTotal()` para incluir o adicional da comissão.

### Exercício 10
Atualize o exercício 7 para que:
- 10% dos funcionários sejam Gerentes
- 20% sejam Supervisores
- 70% sejam Vendedores

### Exercício 11
Sobrescreva o método `toString` da classe `Funcionario` para imprimir o nome do funcionário, a comissão e o salário total. Imprima todos os funcionários da empresa criada no exercício 7.
