package ifsc.poo.naves;

public abstract class NaveEspacial{

    private  int id; // ID único de cada nave.
    private static int count;
    static{
        count = 0;
    }
    
    protected int velocidade_atual; // velocidade inicial das naves sempre será zero, considere que estão paradas.
    protected int velocidade_max;
    protected boolean voo; // indica se a nave está em voo ou não.

    public NaveEspacial(){
        this.id = count++;
        this.voo = false;
        this.velocidade_atual = 0;
        
    }

    public abstract String acelerar();
    
    public abstract int frear();
    
    public abstract void decolar();
    
    public abstract void pousar();


}