package Retangulo;

public class RetanguloTeste {
    public static void main(String[] args) {
        double comprimento = Double.parseDouble(args[0]);
        double largura = Double.parseDouble(args[1]);

        try{
            Retangulo r = new Retangulo(comprimento, largura);
            System.out.println("Perímetro: " + r.getPerimeter());
            System.out.println("Área: " + r.getArea());
        } catch (IllegalArgumentException exception){
            System.err.println("Erro: " + exception.getMessage());
        }

    }
}
