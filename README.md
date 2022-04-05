# Matemática Discreta, Estrutura de Dados e Algoritmos

## Projeto 3

Considere um software, cujo desenvolvimento está sob sua responsabilidade, para controle de frotas de caminhões de entregas.

Implemente uma estrutura de dados que reflita a organização dos volumes das caçambas dos caminhões para a entrega. 
Lembre-se de que os volumes que serão entregues primeiro ficarão no topo. 

Deve ser possível:
* Inserir volumes;
* Remover volumes;
* Verificar qual volume está no topo.

Implemente uma estrutura de dados que reflita a organização dos pontos de entrega que os caminhões visitarão, em ordem. Deve ser possível:
* Inserir pontos de entrega;
* Remover pontos de entrega;
* Verificar os dados de um ponto.

Implemente uma estrutura de dados que possibilite armazenar a lista de itens a serem entregues por cada ponto de entrega. Deve ser possível:
* Inserir item à lista de entrega;
* Remover item da lista de entrega;
* Consultar um item da lista de entrega.

Implemente uma estrutura de dados que possibilite armazenar um conjunto de caminhões, do tipo Caminhao. Deve ser possível:
* Inserir caminhão;
* Remover caminhão;
* Consultar um caminhão, listando seus pontos de entrega e itens a serem entregues por ponto de entrega.

Caminhao é uma classe que contém os atributos:
* Placa;
* Conjunto de pontos de entrega, do tipo Local;
* Conjunto de itens, do tipo ItemEntrega, em sua caçamba.

Um Local é uma classe que contém os atributos:
* Identificador;
* Nome;
* Conjunto de itens, do tipo ItemEntrega, que devem ser entregues. 

Um ItemEntrega é uma classe que contém os atributos:
* Identificador;
* Nome.

Funcionamento do programa:

Inicialize as estruturas dos conjuntos de caminhões, itens de entrega e locais.
Ao ser iniciado, o programa deve exibir o seguinte menu:
* [1] Inserir ponto de entrega;
* [2] Inserir item de entrega;
* [3] Inserir caminhão;
* [4] Associar item a ponto de entrega;
* [5] Associar ponto de entrega a caminhão;
* [6] Realizar entregas;
* [0] Sair.

Requisitos de cada item de menu a seguir:

* [1]Deve ser criado um objeto do tipo Local;
* [2]Deve ser criado um objeto do tipo ItemEntrega;
* [3]Deve ser criado um objeto do tipo Caminhao;
* [4]Solicita um item de entrega já cadastrado e um local já cadastrado, e associa o item ao local;
* [5]Solicita um ponto de entrega já cadastrado e um caminhão já cadastrado e associa o local ao caminhão. O local será o próximo ponto da lista dos que será visitado pelo caminhão;

[6]Desencadeia o algoritmo que realiza as entregas:

* Empilha os itens que serão entregues pelo caminhão;
* Caso haja pontos de entrega cadastrados sem caminhão associado:
* Para cada ponto de entrega P, verifica que caminhão C possui menos pontos de entrega, e aloca P a C.
* Caso haja mais de um caminhão com o mesmo número de pontos de entrega, P será alocado ao caminhão que tiver menos itens a serem entregues. Considere que cada caminhão pode transportar até 20 itens.
* Para cada caminhão, imprime a rotina de entrega, no seguinte formato:
* Percurso do caminhão <PLACA1>:

Visitado ponto de entrega <PONTO1>. Foram entregues os itens:
* <ITEM1_PONTO1>
* <ITEM2_PONTO1>
* <ITEM3_PONTO1>
(etc)

* Visitado ponto de entrega <PONTO2>. Foram entregues os itens:
* <ITEM1_PONTO2>
* <ITEM2_PONTO2>
* <ITEM3_PONTO2>
(etc)
(etc)

Total de pontos de entrega: <TOTAL_PONTOS1>

Total de itens entregues: <TOTAL_ITENS1>