package tarea3;

public class Triangulo extends Figura{
    private double lado;

    public Triangulo(double lado){
        super(lados);
        this.lado = lado;
    }

    @Override
    double calcularArea() {
        return Math.sqrt(3)*lado * lado/4;
    }

    @Override
    void display() {
        System.out.println("Triangulo:");
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
