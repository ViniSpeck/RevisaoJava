package Fatura;

public class Fatura {
    private String codigo;
    private String descricao;
    private int quantidade;
    private double preco;

    public Fatura(String codigo, String descricao, int quantidade, double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }


    public double totalFaturado() {
        return quantidade * preco;
    }
}
