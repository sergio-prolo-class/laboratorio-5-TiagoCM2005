package ifsc.poo.naves;
import ifsc.poo.interfaces.Blindada;
import ifsc.poo.interfaces.Tripulada;

// A classe NaveExploradora, herda NaveEspacial e implementa as interfaces Tripulada e Blindada.
public class NaveExploradora extends NaveEspacial implements Tripulada, Blindada{
    private boolean holofote;
    private int tripulantes;
    private int nivel_blindagem;


    public NaveExploradora(int velocidade_max){
        super();
        this.holofote = false; // Inciialmente, o holofote está desligado.
        this.velocidade_max = velocidade_max;
        this.tripulantes = 0; // Inicialmente, a nave não tem tripulantes.
        this.nivel_blindagem = 0; // Inicialmente, a nave não está blindada.
    }
    // função para controle das luzes da nava.
    public boolean ligarHolofotes(){
        this.holofote = true;
        return this.holofote;
    }

    // Sobreescrevendo o método de acelerar da classe NaveEspacial.
    @Override
    public String acelerar(){
        if(velocidade_atual + 30 <= velocidade_max){
            velocidade_atual += 30;
            return "Acelerando. Velocidade atual: " + velocidade_atual + " km/s";
        } else {
            return "Velocidade máxima atingida: " + velocidade_max + " km/s";
        }
    }

    @Override
    public int frear() {
        if (velocidade_atual - 20 >= 0) {
            velocidade_atual -= 20;
        } else {
            velocidade_atual = 0; // Não pode ficar com velocidade negativa.
        }
        return velocidade_atual;
    }

    @Override
    public void decolar(){
        if(!voo){
            voo = true;
            velocidade_atual = 0; // Considerando que a nave fica planando inicialmente.
            System.out.println("Nave decolou com sucesso.");
        }
    }

    @Override
    public void pousar(){
        if(voo){
            voo = false;
            velocidade_atual = 0;
            System.out.println("Nave pousou com sucesso.");
        }
    }

    // Função para dizer a quantidade de tripulantes.
    @Override
    public void setTripulantes(int n) {
        if(n >= 0) {
            this.tripulantes = n;
        }
    }

    @Override
    public int getTripulantes() {
        return this.tripulantes;
    }

    @Override
    public void controleManual(){
        if(voo){
            System.out.println("Rota já definida, controle manual bloqueado.");
        } else {
            System.out.println("Controle manual ativo. Nave pronta para ser pilotada.");
        }
    }

   @Override
   public void blindar(){
         System.out.println("Nave blindada com sucesso.");
   } 

    @Override
    public void desblindar(){
        System.out.println("Nave desblindada com sucesso.");
    }

    @Override
    public boolean isBlindada() {
        return true; 
    }

    @Override
    public void setNivelBlindagem(int nivel) {
        if(nivel >= 0) {
            this.nivel_blindagem = nivel;
        }
    }
    @Override
    public int getNivelBlindagem() {
        return this.nivel_blindagem;
    }
}