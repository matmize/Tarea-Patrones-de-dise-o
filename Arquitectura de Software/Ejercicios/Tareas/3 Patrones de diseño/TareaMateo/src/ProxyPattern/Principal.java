package ProxyPattern;

import ProxyPattern.EjecutorComandos;
import ProxyPattern.EjecutorProxy;


public class Principal {

    public static void main(String[] args){
        EjecutorComandos ejecutor = new EjecutorProxy("Mateo", "Contraseña Incorrecta");
        try {
            ejecutor.correrComando("ls -ltr");
            ejecutor.correrComando("rm -rf abc.pdf");
        }catch (Exception e ){
            System.out.println(" Mensaje de exepcion :: "+ e.getMessage());
        }
    }
}
