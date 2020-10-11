import exercicios.Cliente;
import exercicios.Item;
import exercicios.Pedido;
import exercicios.Produto;

public class Main {

    public static void main(String[] args) {
        // Produtos
        Produto prod = new Produto("X-Salada Max", 20.00);
        Produto prod1 = new Produto("Refrigerante Cola", 10.00);

        // Cliente
        Cliente cliente = new Cliente("47491594840");

        // Cliente Numero Pedido
        Pedido pedido = new Pedido(cliente, 11);

        // Item
        Item item = new Item(pedido, prod, 2, "Carne ao ponto"  );
        Item item1 = new Item(pedido, prod1, 1, "Gelo e limão"  );

        // Adiciona Item ao pedido
        pedido.addItem(item);
        pedido.addItem(item1);

        for (Item i: pedido.getItens()) {
            System.out.println(
                    i.getProduto().getNomeProd() + ", " +
                    i.getQtdProd() + " unidades"+ ", valor unitário R$ " +
                    i.getProduto().getValorUnitario() + ", valor total R$ " +
                    (i.getProduto().getValorUnitario() * i.getQtdProd())
            );
        }

        System.out.println("\nTotal Pedido: R$ " + pedido.calculoTotalPedido());

    }
}
