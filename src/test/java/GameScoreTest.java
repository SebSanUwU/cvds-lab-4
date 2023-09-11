import hangman.model.*;

import org.junit.Test;
import org.junit.Assert;

public class GameScoreTest {

    @Test
    public void shouldOriginalScoreSum(){
        GameScore score = new OriginalScore();
        Assert.assertEquals(score.calculateScore(0,0),100);
        Assert.assertEquals(score.calculateScore(100,0),100);
    }

    @Test
    public void shouldOriginalScoreNotBelowZero(){
        GameScore score = new OriginalScore();
        Assert.assertEquals(score.calculateScore(0,11),0);
    }

    @Test
    public void shouldOriginalScoreSubtract(){
        GameScore score = new OriginalScore();
        Assert.assertEquals(score.calculateScore(0,1),90);
        Assert.assertEquals(score.calculateScore(0,5),50);
        Assert.assertEquals(score.calculateScore(0,10),0);
    }

    @Test
    public void shouldOriginalScoreBeInGame(){
        GameScore score = new OriginalScore();
        Assert.assertEquals(score.calculateScore(0,0),100);
        Assert.assertEquals(score.calculateScore(0,1),90);
        Assert.assertEquals(score.calculateScore(1,1),90);
        Assert.assertEquals(score.calculateScore(2,1),90);
        Assert.assertEquals(score.calculateScore(3,1),90);
        Assert.assertEquals(score.calculateScore(3,2),80);
        Assert.assertEquals(score.calculateScore(3,3),70);
        Assert.assertEquals(score.calculateScore(3,5),50);
    }

    @Test
    public void shouldBonusScoreSum(){
        GameScore score = new BonusScore();
        Assert.assertEquals(score.calculateScore(0,0),0);
        Assert.assertEquals(score.calculateScore(1,0),10);
        Assert.assertEquals(score.calculateScore(2,0),20);
        Assert.assertEquals(score.calculateScore(2,0),20);
    }

    @Test
    public void shouldBonusScoreNotBelowZero(){
        GameScore score = new BonusScore();
        Assert.assertEquals(score.calculateScore(0,1),0);
        Assert.assertEquals(score.calculateScore(0,2),0);
        Assert.assertEquals(score.calculateScore(1,2),10);
        Assert.assertEquals(score.calculateScore(1,3),5);
        Assert.assertEquals(score.calculateScore(1,4),0);
        Assert.assertEquals(score.calculateScore(1,5),0);
    }

    @Test
    public void shouldBonusScoreSubtract(){
        GameScore score = new BonusScore();
        Assert.assertEquals(score.calculateScore(0,1),0);
        Assert.assertEquals(score.calculateScore(1,1),10);
        Assert.assertEquals(score.calculateScore(2,1),20);
        Assert.assertEquals(score.calculateScore(3,1),30);
        Assert.assertEquals(score.calculateScore(3,2),25);
        Assert.assertEquals(score.calculateScore(3,3),20);
    }


    @Test
    public void shouldBonusScoreBeInGame(){
        GameScore score = new BonusScore();
        Assert.assertEquals(score.calculateScore(0,1),0);
        Assert.assertEquals(score.calculateScore(0,2),0);
        Assert.assertEquals(score.calculateScore(0,3),0);
        Assert.assertEquals(score.calculateScore(0,4),0);
        Assert.assertEquals(score.calculateScore(1,4),10);
        Assert.assertEquals(score.calculateScore(1,5),5);
        Assert.assertEquals(score.calculateScore(2,5),15);
        Assert.assertEquals(score.calculateScore(2,6),10);
        Assert.assertEquals(score.calculateScore(2,7),5);
        Assert.assertEquals(score.calculateScore(2,8),0);
        Assert.assertEquals(score.calculateScore(2,9),0);
    }

    @Test
    public void shouldPowerBonusScoreSum(){
        GameScore score = new PowerBonusScore();
        Assert.assertEquals(score.calculateScore(0,0),0);
        Assert.assertEquals(score.calculateScore(1,0),5);
        Assert.assertEquals(score.calculateScore(1,1),0);
        Assert.assertEquals(score.calculateScore(2,1),5);
    }

    @Test
    public void shouldPowerBonusScoreNotBelowZero(){
        GameScore score = new PowerBonusScore();
        Assert.assertEquals(score.calculateScore(0,1),0);
        Assert.assertEquals(score.calculateScore(0,2),0);
        Assert.assertEquals(score.calculateScore(1,2),5);
        Assert.assertEquals(score.calculateScore(1,3),0);
        Assert.assertEquals(score.calculateScore(1,4),0);
    }

    @Test
    public void shouldPowerBonusScoreSubtract(){
        GameScore score = new PowerBonusScore();
        Assert.assertEquals(score.calculateScore(1,0),5);
        Assert.assertEquals(score.calculateScore(2,0),30);
        Assert.assertEquals(score.calculateScore(2,1),22);
        Assert.assertEquals(score.calculateScore(2,2),14);
    }
    @Test
    public void shouldPowerBonusScoreBehaviorPowerBe(){
        GameScore score = new PowerBonusScore();
        Assert.assertEquals(score.calculateScore(1,0),5);
        Assert.assertEquals(score.calculateScore(2,0),30);
        Assert.assertEquals(score.calculateScore(3,0),155);
        Assert.assertEquals(score.calculateScore(3,1),147);
        Assert.assertEquals(score.calculateScore(4,1),152);
    }



}





