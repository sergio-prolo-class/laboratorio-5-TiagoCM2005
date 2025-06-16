package ifsc.poo.naves;
import ifsc.poo.interfaces;

public class NaveExploradora extends NaveEspacial implements Tripulada, Blindada{
    private boolean holofote;

    public NaveExploradora(boolean voo, int velocidade_atual, int velocidade_max, boolean holofote){
        super(voo, velocidade_atual, velocidade_max);
        this.holofote = holofote;
    }

    public boolean ligarHolofotes(){
        this.holofote = true;
    }

    @Override
    public int acelerar(int velocidade_atual){
        for(int i = 0; i <= velocidade_max || i <= 5; i++){
            velocidade_atual += 30;
        }
    }



}