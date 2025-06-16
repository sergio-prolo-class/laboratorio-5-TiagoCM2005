package ifsc.poo.naves;

import ifsc.poo.interfaces.Blindada;
import ifsc.poo.interfaces.Tripulada;

public class NaveCargueira extends NaveEspacial implements Blindada, Tripulada {
    private int carga_maxima;
    private int carga_atual;
    private int nivel_blindagem;

    public NaveCargueira(int velocidade_max, int carga_max){
        super();
        this.velocidade_max = velocidade_max;
        this.voo = false;
        this.carga_maxima = carga_max; // Capacidade máxima de carga em toneladas.
        this.nivel_blindagem = 0; // Inicialmente, a nave não está blindada.
        this.carga_atual = 0; // Inicialmente, a carga atual é zero.
    }

    @Override
}
