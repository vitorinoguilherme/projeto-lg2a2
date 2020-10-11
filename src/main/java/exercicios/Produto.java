package exercicios;

import java.util.List;

public class Produto {
    private String nomeProd;
    private Double valorUnitario;

    public Produto(String nomeProd, Double valorUnitario) {
        this.setNomeProd(nomeProd);
        this.setValorUnitario(valorUnitario);
    }

    public Produto() {

    }

    public void setNomeProd(String nomeProd) {
        if ( nomeProd == null ) {
            throw new IllegalArgumentException(
                    "O nome do produto não pode ser nulo. "
            );
        }
        this.nomeProd = nomeProd;
    }

    public String getNomeProd() {
        return nomeProd;
    }

    public void setValorUnitario(Double valorUnitario) {
        if (valorUnitario < 0.0) {
            throw new IllegalArgumentException(
                    "Valor unitário não pode ser menor que zero. "
            );
        }
        this.valorUnitario = valorUnitario;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }
}
