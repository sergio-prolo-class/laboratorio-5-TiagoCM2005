package ifsc.poo.interfaces;

public interface Blindada {

    void blindar(); // Método para blindar a nave.
    void desblindar(); // Método para desblindar a nave.
    boolean isBlindada(); // Método para verificar se a nave está blindada.
    int getNivelBlindagem(); // Método para obter o nível de blindagem da nave.
    void setNivelBlindagem(int nivel); // Método para definir o nível de blindagem da nave.
}