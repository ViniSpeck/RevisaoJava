public class Calculadora {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);

        System.out.println("Soma:" + (n1 + n2));
        System.out.println("Subtração:" + (n1 - n2));
        System.out.println("Multiplicação:" + (n1 * n2));
        System.out.println("Divisão:" + (n1 / n2));
        System.out.println(((n1>n2)?n1:n2) + " é maior");
    }
}
