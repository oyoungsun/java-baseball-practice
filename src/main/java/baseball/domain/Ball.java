package baseball.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ball {
    private static final int BALL_SIZE = 3;
    private static final String BALL_DUPPLICATED = "세자리 수는 각자 다른 수로 이루어져야 합니다.";
    private final List<Integer> balls;

    private Ball(final List<Integer> balls) {
        this.balls = balls;
    }

    public static Ball from(final List<Integer> balls) {
        isDupplicated(balls);
        return new Ball(balls);
    }

    private static void isDupplicated(final List<Integer> balls) {
        int distincted = (int) balls.stream().distinct().count();
        if(distincted != BALL_SIZE) {
            throw new IllegalArgumentException(BALL_DUPPLICATED);
        }
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
