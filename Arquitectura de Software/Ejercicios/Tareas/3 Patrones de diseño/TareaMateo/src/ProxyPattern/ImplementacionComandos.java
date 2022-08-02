package ProxyPattern;

import java.io.IOException;

public class ImplementacionComandos implements EjecutorComandos{

    public void correrComando(String cmd) throws IOException{
        Runtime.getRuntime().exec(cmd);
        System.out.println("'" + cmd + "' Comando Ejecutado ");

    }

}
