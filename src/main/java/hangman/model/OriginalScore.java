package hangman.model;

public class OriginalScore implements GameScore{
    public OriginalScore(){
        super();
    }
    public int calculateScore(int correctCount,int incorrectCount){
        int acumScore=100;
        int count = incorrectCount;
        while(count>0 && acumScore>0){
            acumScore-=10;
            count--;
        }
        return acumScore;
    }
}