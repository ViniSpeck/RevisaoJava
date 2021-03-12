import java.text.DecimalFormat;

public class CalculaPI {
    public static void main(String[] args) {
        double denominador = Integer.parseInt(args[0]);
        int numerador = 1;
        double soma = 0;
        DecimalFormat df = new DecimalFormat("0.000000");

        for (double i = 1; i < denominador; i+=2) {
            soma+=numerador/i;
            numerador*=-1;
        }
        double piCalculado = 4*soma;
        double erro = (piCalculado/Math.PI)/100;
        System.out.println("Valor de pi é: " + piCalculado);

        System.out.println("Erro: " + df.format(erro) + "%");
    }
}
