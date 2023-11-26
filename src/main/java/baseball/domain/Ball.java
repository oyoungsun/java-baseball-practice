package baseball.domain;

import java.util.Collections;
import java.util.List;

public class Ball {
    private final List<Integer> balls;

    private Ball(final List<Integer> balls) {
        this.balls = balls;
    }

    public static Ball from(final List<Integer> balls) {
        return new Ball(balls);
    }

    public int getFirst() {
        return balls.get(0);
    }

    public int getSecond() {
        return balls.get(1);
    }

    public int getThird() {
        return balls.get(2);
    }
}
