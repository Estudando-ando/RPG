# Projeto RPG em Java

## Visão Geral do Projeto

Este projeto de RPG consiste em um jogo baseado em turnos onde personagens (jogadores e inimigos) lutam entre si. Cada personagem terá atributos como vida, ataque e defesa, e habilidades especiais. O jogador poderá escolher entre diferentes classes de personagens (como Guerreiro, Mago e Arqueiro), cada uma com suas próprias características e habilidades.

## Classes Concretas

Com base nas classes abstratas definidas, você pode criar várias classes concretas que estendem essas classes:

- **Classe `Guerreiro`** que estende `ClassePersonagem`.
- **Classe `Mago`** que estende `ClassePersonagem`.
- **Classe `Arqueiro`** que estende `ClassePersonagem`.
- **Classe `Orc`** que estende `Inimigo`.
- **Classe `Dragao`** que estende `Inimigo`.

## Planejamento de Funcionalidades

### 1. Sistema de Combate

- Implementar um sistema de combate baseado em turnos, onde o jogador e os inimigos atacam alternadamente.
- O jogador pode escolher entre atacar ou usar habilidades especiais.

### 2. Gerenciamento de Recursos

- Gerenciar a vida e o mana dos personagens.
- Implementar métodos para regenerar vida e mana após combates.

### 3. Sistema de Níveis e Experiência

- Adicionar um sistema de níveis para os personagens e inimigos.
- Aumentar atributos dos personagens conforme eles sobem de nível.

### 4. Interface de Usuário

- Implementar uma interface de texto simples para interações no jogo (opcional, para simplificação).
- Exibir informações sobre o personagem e o inimigo, como vida e mana.

## Praticando os Pilares da Programação Orientada a Objetos

Neste projeto, iremos praticar os quatro pilares da Programação Orientada a Objetos (OOP):

- **Abstração:** Definindo classes abstratas que servem como modelos para outras classes.
- **Encapsulamento:** Controlando o acesso aos atributos e métodos através de modificadores de acesso.
- **Herança:** Criando classes que herdam características e comportamentos de outras classes.
- **Polimorfismo:** Implementando métodos que podem ter diferentes comportamentos, dependendo das classes que os implementam.
