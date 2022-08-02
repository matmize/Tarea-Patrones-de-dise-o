package AbstractFactory;
import AbstractFactory.Carro;
import AbstractFactory.Automovil;

public class FabricaAutomovil implements AbstractFactory{
    private String puertas;
    private String altura;
    private String peso;

    public FabricaAutomovil(String puertas,String altura,String peso){
        this.puertas = puertas;
        this.altura = altura;
        this.peso = peso;
    }
    @Override
    public Carro crearCarro(){
        return new Automovil(puertas,altura,peso);
    }
}
