package hangman.model;

public class BonusScore implements GameScore{
    public int valorPasado=0;
    public int acumIncorrectos=0;
    public int acumCorrectos=0;
    public BonusScore(){
        super();
    }

    /**
     * Calcula el puntaje del jugador segun el numero
     * de letras incorrectas (penaliza con 5 puntos),
     * numero de letras correctas (bonifica con 10 puntos).
     * El puntaje mínimo es 0.
     * @pre Se inicia con 0 puntos.
     * @post El minimo puntaje es 0.
     * @param correctCount Numero de letras correctas en el juegpo actual.
     * @param incorrectCount Numero de letras incorrectas en el juego actual.
     * @return Puntaje que lleva le jugador.
     */
    public int calculateScore(int correctCount,int incorrectCount){
        if(correctCount>acumCorrectos){
            valorPasado += 10;
            acumCorrectos++;
        }else if(incorrectCount>acumIncorrectos){
            if(valorPasado>0){
                valorPasado-=5;
            }
            acumIncorrectos++;
        }
        return valorPasado;
    }
}