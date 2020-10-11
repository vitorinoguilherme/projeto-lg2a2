package exercicios;

import java.util.List;
import java.util.ArrayList;

public class Pedido {
    private Integer numero;
    private List<Item> itens;
    private Cliente cliente;

    public Pedido(Cliente cliente, Integer numero) {
        this.cliente = cliente;
        this.numero = numero;
        this.itens = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.itens.add(item);
    }

    public List<Item> getItens() {
        return itens;
    }

    public Double calculoTotalPedido() {
        Double total = 0.0;

        for (Item item: itens) {
            total += (item.getQtdProd() * item.getProduto().getValorUnitario());
        }

        return total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Integer getNumero() {
        return numero;
    }
}
