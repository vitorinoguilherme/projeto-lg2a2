package exercicios;

public class Cliente {
    private String cpf;

    public Cliente(String cpf) {
        this.setCpf(cpf);
    }

    public void setCpf(String cpf) {
        if (cpf == null ) {
            throw new IllegalArgumentException("CPF inválido.");
        }
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
}
