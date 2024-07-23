Projeto de Estudo: Strategy e Factory Patterns
Descrição
Este é um pequeno projeto de estudo criado para explorar e compreender os padrões de projeto Strategy e Factory em Java. O objetivo principal é demonstrar como esses padrões podem ser aplicados para resolver problemas comuns de design de software, promovendo flexibilidade e extensibilidade no código.

Padrões de Projeto Utilizados
Strategy Pattern: Define uma família de algoritmos, encapsula cada um deles e torna-os intercambiáveis. Permite que o algoritmo varie independentemente dos clientes que o utilizam.

Factory Pattern: Fornece uma interface para criar objetos em uma superclasse, mas permite que as subclasses alterem o tipo de objetos que serão criados. Facilita a criação de objetos sem especificar a classe exata do objeto que será criado.

Estrutura do Projeto
Strategy: Implementação de diferentes estratégias para processar solicitações.
Factory: Fábrica para criar instâncias das estratégias com base em parâmetros fornecidos.
Solicitacao: Classe representando uma solicitação com um código de evento, que é processada pelas estratégias.
