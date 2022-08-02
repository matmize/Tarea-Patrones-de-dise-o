package ProxyPattern;

public class EjecutorProxy implements EjecutorComandos{

    private boolean esAdmin;
    private EjecutorComandos ejecutor;

    public EjecutorProxy (String usuario, String contraseña){
        if ("Mateo".equals(usuario) && "1234".equals(contraseña)) esAdmin = true;
        ejecutor = new ImplementacionComandos();

    }
    @Override
    public void correrComando(String cmd) throws Exception{
        if(esAdmin){
            ejecutor.correrComando(cmd);
        }else{
            if (cmd.trim().startsWith("rm")){
                throw new Exception("Este comando no esta permitido para Usuarios no Administradores");
            }else{
                ejecutor.correrComando(cmd);
            }
        }
    }

}
