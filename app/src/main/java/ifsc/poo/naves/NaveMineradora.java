package ifsc.poo.naves;
import ifsc.poo.interfaces.Tripulada;

public class NaveMineradora extends NaveEspacial implements Tripulada {
    private int nivel_laser; // Considerando o nível do laser máx sendo 100.
    private int nivel_blindagem;

    public NaveMineradora(int velocidade_max){
        super();
        this.velocidade_max = velocidade_max;
        this.voo = false;
        this.nivel_laser = 0; // Inicialmente, o nível do laser é zero.
    }
    
    // Nível = 0, desliga o Laser.
    public boolean alterarNivelLaser(int nivel){
        if (nivel >= 0 && nivel <= 100) {
            this.nivel_laser = nivel;
            return true; // Nível do laser alterado com sucesso.
        } else {
            return false; // Nível inválido.
        }
    }

    

}
