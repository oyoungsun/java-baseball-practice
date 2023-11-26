package baseball.domain;

import java.util.Collections;
import java.util.List;

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

    public List<Integer> getBalls() {
        return Collections.unmodifiableList(balls);
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

    public int compareBall(final Ball userBall, final int strike) {
        int ball = (int) this.balls.stream().filter(
                number -> userBall.getBalls().contains(number)
        ).count();
        return ball - strike;
    }

    public int compareStrike(final Ball userBall) {
        int strike = 0;
        for(int i = 0; i < BALL_SIZE; i++) {
            if(this.balls.get(i) == userBall.getBalls().get(i)) {
                strike++;
            }
        }
        return strike;
    }
}
