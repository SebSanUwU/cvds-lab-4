package hangman.model;

public class BonusScore implements GameScore{
    public int valorPasado=0;
    public int acumIncorrectos=0;
    public int acumCorrectos=0;
    public BonusScore(){
        super();
    }
    public int calculateScore(int correctCount,int incorrectCount){
        if(correctCount>acumCorrectos){
            valorPasado+=10;
            acumCorrectos++;
        }else if(incorrectCount>acumIncorrectos){
            if(valorPasado>0){
                valorPasado-=5;
                acumIncorrectos++;
            }
            acumIncorrectos++;
        }
        return valorPasado;
    }
}