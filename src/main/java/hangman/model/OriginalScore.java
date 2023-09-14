package hangman.model;

public class OriginalScore implements GameScore{
    private int acumScore=100;

    public OriginalScore(){
        super();
    }
    /**
     * Calcula el puntaje del jugador segun el numero
     * de letras incorrectas (penaliza con 10), las
     * letras correctas no se bonifican. El puntaje mínimo es 0.
     * @pre Se inicia con 100 puntos.
     * @post El minimo puntaje es 0.
     * @param correctCount Numero de letras correctas en el juegpo actual.
     * @param incorrectCount Numero de letras incorrectas en el juego actual.
     * @return Puntaje que lleva le jugador.
     */
    public int calculateScore(int correctCount,int incorrectCount){
        int valorInicial=100;
        int count = incorrectCount;
        while(count>0 && valorInicial>0){
            valorInicial-=10;
            count--;
        }
        return valorInicial;
    }

    public void reset() {
        acumScore=100;
    }
}