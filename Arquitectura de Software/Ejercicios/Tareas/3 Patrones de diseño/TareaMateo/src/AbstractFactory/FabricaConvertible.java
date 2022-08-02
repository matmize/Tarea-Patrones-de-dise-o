package AbstractFactory;
import AbstractFactory.Carro;
import AbstractFactory.Convertible;
public class FabricaConvertible  implements AbstractFactory{
    private String puertas;
    private String altura;
    private String peso;

    public FabricaConvertible(String puertas,String altura,String peso){
        this.puertas = puertas;
        this.altura = altura;
        this.peso = peso;
    }
    @Override
    public Carro crearCarro(){
        return new Convertible(puertas,altura,peso);
    }
}
