package baseball.dto;

public class BallResultDto {
    final int strike;
    final int ball;

    private BallResultDto(final int strike, final int ball) {
        this.strike = strike;
        this.ball = ball;
    }

    public static BallResultDto from(final int strike, final int ball) {
        return new BallResultDto(strike, ball);
    }

    public boolean isNothing() {
        return strike == 0 && ball == 0;
    }

    public boolean isOnlyBall() {
        return strike == 0;
    }

    public boolean isOnlyStrike() {
        return ball == 0;
    }

    public int getBall() {
        return ball;
    }

    public int getStrike() {
        return strike;
    }
}
