package baseball.dto;

import baseball.domain.Ball;
import java.util.ArrayList;
import java.util.List;

public class BallDto {
    private final List<Integer> balls;

    private BallDto(final int first, final int second, final int third) {
        balls = List.of(first, second, third);
    }

    public static BallDto of(final int first, final int second, final int third) {
        return new BallDto(first, second, third);
    }

    public static Ball toEntity(BallDto ballDto){
        return Ball.from(ballDto.balls);
    }

    public static BallDto toDto(Ball ball){
        return new BallDto(ball.getFirst(), ball.getSecond(), ball.getThird());
    }
}
