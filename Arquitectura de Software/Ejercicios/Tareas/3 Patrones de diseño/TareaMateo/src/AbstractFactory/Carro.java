package AbstractFactory;

public abstract class Carro {
    public abstract String getPuertas();
    public abstract String getAltura();
    public abstract String getPeso();

    @Override
    public String toString(){
        return "Puertas= "+this.getPuertas()+", Altura="+this.getAltura()+", Peso="+this.getPeso();
    }

}
