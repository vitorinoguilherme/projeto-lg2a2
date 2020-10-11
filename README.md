#Gerenciar pedidos em um aplicativo de comida
![alt text](UML%20-Projeto%20LG2A2.png)
**Regras básicas**

Um pedido está relacionado a apenas um cliente e agrega um conjunto de itens  
Um item representa determinado produto e uma quantidade   
Um item pode conter observações do cliente como remoção de ingredientes ou outros detalhes

Exemplo dos dados de um pedido:

**Pedido** 1123  
**Cliente** 341.231.234-32  
**Itens**  
X-Salada Max, 2 unidades, valor unitário R$ 20,00, valor total R$ 40,00  
Refrigerante Cola, 1 unidades, valor unitário R$ 10,00, valor total R$ 10,00

**Valor total do pedido**: 50,00

Com base nas informações apresentadas crie um projeto Java no [repl.it](http://repl.it) e escreva as classes necessárias para resolução do problema aplicando os princípios e boas práticas SOLID e GRASP quando apropriado. Não é necessário fazer interfaces gráficas ou entrada de dados, você deve focar em criar um modelo de domínio, classes com atributos e métodos que reflitam as regras de negócio apresentadas. 

Enviar o link do repl.it na atividade Estudo de Caso Princípios e Boas Práticas SOLID e GRASP na página da disciplina do Moodle.

**Dicas:**

- Cuidado com valores que podem ser calculados com base em outros atributos. Esses valores não devem ser definidos como atributos de uma classe;
- Um item não é um produto, mas a relação entre uma descrição de produto, uma quantidade e um pedido.
- Neste estudo não temos identificação única de um produto, um X-Salada não possui número de série. Ou seja um objeto xsalada da classe Produto pode estar associado a diferentes itens em diferentes pedidos.
- Neste estudo você pode aplicar o Princípio da Responsabilidade Única (SRP) do SOLID e os padrões Expert e Creator do GRASP.