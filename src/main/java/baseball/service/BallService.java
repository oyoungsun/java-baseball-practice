package baseball.service;

import baseball.domain.Ball;
import baseball.dto.BallDto;

public class BallService {

    private final Ball computerBall;
    private Ball userBall;

    public BallService(final BallGenerator ballGenerator) {
        this.computerBall = ballGenerator.generate();
    }

    public void setUserBall(final BallDto dto) {
        this.userBall = BallDto.toEntity(dto);
    }
}
