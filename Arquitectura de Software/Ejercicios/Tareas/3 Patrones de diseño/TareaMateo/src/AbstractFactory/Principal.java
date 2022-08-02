package AbstractFactory;

import AbstractFactory.Carro;
import AbstractFactory.FabricaAutomovil;
import AbstractFactory.FabricaConvertible;
import AbstractFactory.FabricaCarro;


public class Principal {

    public static void main(String[] args ){
        pruebaAbstractFactory();
    }

    private static void pruebaAbstractFactory(){
        Carro automovil = FabricaCarro.getCarro(new FabricaAutomovil("5","180","700"));
        Carro convertible = FabricaCarro.getCarro(new FabricaConvertible("2","150","500"));
        System.out.println(" Carro Convertible :: " + convertible);
        System.out.println(" Carro Automovil  :: " + automovil);
    }
}
