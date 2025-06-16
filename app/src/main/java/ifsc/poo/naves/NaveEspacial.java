package ifsc.poo.naves;

public abstract class NaveEspacial{

    static private final int id;
    protected static int count;
    static{
        count = 0;
    }
    protected int velocidade_atual;
    protected int velocidade_max;
    protected boolean voo;

    public NaveEspacial(boolean voo, int velocidade_atual, int velocidade_max){
        this.id = count++;
        this.voo = false;
        this.velocidade_atual = velocidade_atual;
        this.velocidade_max = velocidade_max;
    }

    public abstract String acelerar(int);
    
    public abstract int frear(int);
    
    public abstract void decolar();
    
    public abstract void pousar();


}