package Metodos;

public class Numeros {

    private Double numero;

    public Numeros(Double numero) {
        this.numero = numero;
    }

    public Double getNumero() {
        return numero;
    }

    public void setNumero(Double numero) {
        this.numero = numero;
    }

    public Double somar(double n1, double n2) {
        return n1+n2;
    }
}
