package ifsc.poo;

public abstract class NaveExploradora{

    private final int id;
    private static int count;
    static{
        count = 0;
    }
    protected static final int velocidade_atual;
    protected static final int velocidade_max;
    protected boolean voo;

    public NaveEspacial(boolean voo, int velocidade_atual, int velocidade_max){
        this.id = count++;
        this.voo = false;
        this.velocidade_atual = velocidade_atual;
        this.velocidade_max = velocidade_max;
    }

    public abstract int acelerar(int);
    
    public abstract int frear(int);
    
    public abstract void decolar();
    
    public abstract void pousar();


}