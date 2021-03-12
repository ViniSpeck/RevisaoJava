package Retangulo;

public class Retangulo {
    private double comprimento;
    private double largura;

    public Retangulo() {
        comprimento = 1;
        largura = 1;
    }

    public Retangulo(double comprimento, double largura) {
        setComprimento(comprimento);
        setLargura(largura);
    }

    public void setComprimento(double comprimento) {
        if(comprimento<=0){
            throw new IllegalArgumentException("Um dos lados do retângulo é igual ou menor que zero.");
        }
        this.comprimento = comprimento;
    }

    public void setLargura(double largura) {
        if(largura<=0){
            throw new IllegalArgumentException("Um dos lados do retângulo é igual ou menor que zero.");
        }
        this.largura = largura;
    }
    public double getPerimeter(){
        return (largura*2)+(comprimento*2);
    }
    public double getArea(){
        return comprimento*largura;
    }
}
