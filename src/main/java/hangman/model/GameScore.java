package hangman.model;
public interface GameScore {
    /**
     * Metodo general para hacer el caluclo del puntaje del juego. Debe retornar
     * un entero que sera el puntaje total llevado por el jugador.
     * @param correctCount Numero de letras correctas en el juegpo actual.
     * @param incorrectCount Numero de letras incorrectas en el juego actual.
     * @return Puntaje que lleva le jugador.
     */
    int calculateScore(int correctCount, int incorrectCount);
    void reset();
}
