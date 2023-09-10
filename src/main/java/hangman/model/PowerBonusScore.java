package hangman.model;

public class PowerBonusScore implements GameScore{
    public int valorPasado=0;
    public int acumIncorrectos=0;
    public int acumCorrectos=0;
    public int powerBonus=1;
    public PowerBonusScore(){
        super();
    }
    public int calculateScore(int correctCount,int incorrectCount){
        if(correctCount>acumCorrectos){
            valorPasado+=(int)Math.pow(5,powerBonus);
            powerBonus++;
            acumCorrectos++;
        }else if(incorrectCount>acumIncorrectos){
            System.out.println("Fallo");
            if(valorPasado>0){
                valorPasado-=8;
            }
            if(valorPasado<0){
                valorPasado=0;
            }
            acumIncorrectos++;
            powerBonus=1;
        }
        if(valorPasado>500){
            valorPasado=500;
        }
        return valorPasado;
    }
}
