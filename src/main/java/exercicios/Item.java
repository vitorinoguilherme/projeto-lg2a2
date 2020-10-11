package exercicios;

public class Item {
    private Integer qtdProd;
    private String obsCliente;
    private Produto produto;
    private Pedido pedido;

    public Item(Pedido pedido, Produto produto, Integer qtdProd, String obsCliente) {
        this.pedido = pedido;
        this.produto = produto;
        this.setQtdProd(qtdProd);
        this.setObsCliente(obsCliente);
    }

    public void setQtdProd(Integer qtdProd) {
        if (qtdProd < 0) {
            throw new IllegalArgumentException(
                    "Quantidade de produtos deve ser maior que zero. "
            );
        }
        this.qtdProd = qtdProd;
    }

    public Integer getQtdProd() {
        return qtdProd;
    }

    public void setObsCliente(String obsCliente) {
        this.obsCliente = obsCliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public String getObsCliente() {
        return obsCliente;
    }

}
