package hangman.model;

public class PowerBonusScore implements GameScore{
    private int valorPasado=0;
    private int acumIncorrectos=0;
    private int acumCorrectos=0;
    private int powerBonus=1;
    public PowerBonusScore(){
        super();
    }

    /**
     * Calcula el puntaje del jugador segun el numero
     * de letras incorrectas (penaliza con 8 puntos),
     * numero de letras correctas (bonifica con 5 puntos).
     * Cada vez que se tenga un acierto seguido el numero
     * de bonificación ira aumentado de 5 a la potencia de la
     * inesima correcta. El puntaje mínimo es 0. Si se llega
     * a los 500 puntos se mantendra ese puntaje.
     * @pre Se inicia con 0 puntos.
     * @post El minimo puntaje es 0.
     * @param correctCount Numero de letras correctas en el juegpo actual.
     * @param incorrectCount Numero de letras incorrectas en el juego actual.
     * @return Puntaje que lleva le jugador.
     */
    public int calculateScore(int correctCount,int incorrectCount){
        if(correctCount>acumCorrectos){
            while (correctCount>acumCorrectos){
                valorPasado+=(int)Math.pow(5,powerBonus);
                if(valorPasado>500){
                    valorPasado=500;
                }
                powerBonus++;
                acumCorrectos++;
            }
        }else if(incorrectCount>acumIncorrectos){
            if(valorPasado>0){
                valorPasado-=8;
            }
            if(valorPasado<0){
                valorPasado=0;
            }
            acumIncorrectos++;
            powerBonus=1;
        }

        return valorPasado;
    }
    public void reset(){
        acumCorrectos=0;
        acumIncorrectos=0;
        valorPasado=0;
    }
}
