package org.example.javatest.player;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class PlayerTest {
    @Test
    public void loseWhenDiceNumberIsLow() {
        Dice dice = Mockito.mock(Dice.class);//new Dice(6);

        Mockito.when(dice.roll()).thenReturn(2);

        Player player = new Player(dice, 3);
        Assert.assertEquals(false, player.play());
    }

    @Test
    public void winWhenDiceNumberIsBig() {
        Dice dice = Mockito.mock(Dice.class);

        Mockito.when(dice.roll()).thenReturn(2);

        Player player = new Player(dice, 3);
        Assert.assertEquals(false, player.play());
    }
}