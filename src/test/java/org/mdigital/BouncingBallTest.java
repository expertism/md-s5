package org.mdigital;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BouncingBallTest {
    @Test
    public void baouncingBallReturnsCorrect(){
        BouncingBall ball = new BouncingBall();

        assertEquals(3, ball.bouncingBall(3.0, 0.66, 1.5));
    }

    @Test
    public void bouncingBallReturnsNegative(){
        BouncingBall ball = new BouncingBall();

        assertEquals(-1, ball.bouncingBall(3.0, 0.66, 4.0));
    }

}