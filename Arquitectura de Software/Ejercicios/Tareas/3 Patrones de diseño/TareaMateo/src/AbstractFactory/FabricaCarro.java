package AbstractFactory;

import AbstractFactory.Carro;

public class FabricaCarro {
    public static Carro getCarro(AbstractFactory fabrica){
        return fabrica.crearCarro();
    }

}
