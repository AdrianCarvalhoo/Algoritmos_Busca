## Busca Binária e Busca Linear em Java 

Este projeto consiste em duas implementações de algoritmos de busca em Java: Busca Binária e Busca Linear. O objetivo é demonstrar a diferença entre esses dois métodos de busca em termos de eficiência e complexidade.

### Busca Binária

A busca binária é um algoritmo de busca eficiente que explora o fato de que o conjunto de dados em que estamos buscando está ordenado. Ele divide repetidamente o conjunto de dados pela metade, descartando metade dos elementos a cada iteração.

1. O vetor de entrada é preenchido com números pares em sequência, de forma ordenada.
2. O usuário insere um número a ser buscado no vetor.
3. O algoritmo de busca binária encontra o número, se presente, ou determina que ele não existe.

### Busca Linear

A busca linear é um método de busca simples e direto, onde cada elemento do conjunto de dados é examinado sequencialmente até que o item desejado seja encontrado ou o final do conjunto seja alcançado.

1. Um vetor de números aleatórios entre 0 e 9 é gerado.
2. O usuário fornece o número a ser buscado no vetor.
3. O algoritmo de busca linear verifica cada elemento do vetor para encontrar o número.

### Complexidade de Algoritmos

A complexidade de um algoritmo mede a quantidade de recursos (como tempo e espaço) que ele consome em relação ao tamanho dos dados de entrada. Existem duas medidas de complexidade: tempo e espaço.

#### Busca Binária

- Complexidade de tempo: O(log n)
- Complexidade de espaço: O(1)

O algoritmo de busca binária reduz o espaço de busca pela metade a cada iteração, o que resulta em um tempo de execução bastante eficiente, especialmente para conjuntos de dados grandes.

#### Busca Linear

- Complexidade de tempo: O(n)
- Complexidade de espaço: O(1)

A busca linear verifica cada elemento do conjunto de dados sequencialmente até encontrar o elemento desejado ou percorrer todo o conjunto. Isso leva a um aumento linear no tempo de execução à medida que o tamanho do conjunto aumenta.

### Conclusão

A busca binária é uma escolha eficiente quando se trata de encontrar um elemento em um conjunto de dados ordenado, pois elimina metade dos elementos a cada iteração. A busca linear, embora seja simples, pode se tornar ineficiente em conjuntos de dados maiores devido à sua complexidade linear.

Neste projeto, você pode observar a diferença de desempenho entre os algoritmos de busca binária e busca linear, levando em consideração a ordem e o tamanho do conjunto de dados.