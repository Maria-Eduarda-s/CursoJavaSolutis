# 🐾 Lista de Exercícios 04 – Orientação a Objetos Avançada em Java

Este repositório contém a implementação de um exercício sobre orientação a objetos avançada em Java. O objetivo é criar uma estrutura de classes que representa diferentes tipos de animais e suas características.

## 📋 Tarefas

1. **Criar Interface AnimalIF** 🐶
    - Métodos: `comer`, `mover`, `dormir`.

2. **Criar Classe Abstrata AnimalAB** 🦁
    - Implementa `AnimalIF`.
    - Define os métodos abstratos da interface.

3. **Criar Classes Cachorro, Gato, Elefante, Leão** 🐕🐈🐘🦁
    - Herdam de `AnimalAB`.
    - Sobrescrevem os métodos `comer`, `mover`, `dormir`.
    - Ações alteram o estado interno do objeto: quantidade de comida ingerida, caminho percorrido e horas de sono.


4. **Criar Classes Peixe e Pombo** 🐟🐦
    - Herança:
        - `Peixe` herda de `AnimalMarinhoAB`.
        - `Pombo` herda de `AnimalVoadorAB`.
    - Métodos específicos: `nadar` e `voar`.

5. **Definir Atributos** 📏
    - Atributos comuns: `nome`, `tipo animal`, `idade`, `habitat`, `quantidade de patas`, `quantidade de asas`, `envergadura das asas`, `altura`, `peso`.
    - Organizar atributos nas classes abstratas apropriadas: `AnimalTerrestreAB`, `AnimalMarinhoAB`, `AnimalVoadorAB`.
      
