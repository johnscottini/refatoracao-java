Parrot Refactoring Kata Java version
====================================

O projeto original tem como objetivo executar criar uma instância de papagaio, e a partir dessa instância, que pode ser do tipo "Africano", "Europeu" ou "Azul norueguês", executar algumas ações, como retornar o choro da ave, ou a velocidade.
Para isso, existem algumas lógicas diferentes de cálculo de velocidade e retorno de choro, para cada tipo de ave.

Após entender o projeto, a refatoração se tornou mais simples, o maior ponto para a mudança era refatorar a classe Parrot para remover a lógica toda acoplada nela, já que ela era responsável por retornar os atributos e realizar lógicas conforme o tipo da ave.
Pensando nisso, resolvi criar extenções de cada tipo de ave específico, separando sua lógica individual, encapsulando e facilitando a manutenção futura.

Além disso, foi criada uma classe de características do papagaio, que contêm os atributos da classe, versus a classe do papagaio em si, que é uma classe abstrata que basicamente implementa os comportamentos (Choro e Velocidade) e possui alguns valores fixos em variáveis do tipo static final.

Dessa forma, futuras mudanças na aplicação tornam-se simples, pois agora ela é modular e com responsabilidade únicas e bem divididas.