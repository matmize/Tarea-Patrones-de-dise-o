package AbstractFactory;

public class Automovil extends Carro {

    private String puertas;
    private String altura;
    private String peso;

    public Automovil(String puertas, String altura, String peso) {
        this.puertas = puertas;
        this.altura = altura;
        this.peso = peso;
    }

    @Override
    public String getPuertas() {
        return this.puertas;
    }

    @Override
    public String getAltura() {
        return this.altura;
    }

    @Override
    public String getPeso() {
        return this.peso;
    }
}
