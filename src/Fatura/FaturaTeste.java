package Fatura;

public class FaturaTeste {
    public static void main(String[] args) {
        String codigo = args[0];
        String descricao = args[1];
        int quantidade = Integer.parseInt(args[2]);
        double preco = Double.parseDouble(args[3]);

        Fatura f = new Fatura(codigo, descricao, quantidade, preco);

        System.out.println("Código: " + f.getCodigo());
        System.out.println("Descrição: " + f.getDescricao());
        System.out.println("Quantidade: " + f.getQuantidade());
        System.out.printf("Preço: R$ %.2f\n", f.getPreco());
        System.out.printf("Total: R$ %.2f\n", f.totalFaturado());
    }
}
