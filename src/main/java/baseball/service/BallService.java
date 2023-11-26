package baseball.service;

import baseball.domain.Ball;
import baseball.dto.BallDto;
import baseball.dto.BallResultDto;
import baseball.utils.BallGenerator;

public class BallService {

    private final BallGenerator ballGenerator;
    private Ball userBall;
    private Ball computerBall;

    public BallService(final BallGenerator ballGenerator) {
        this.ballGenerator = ballGenerator;
    }

    public void setUserBall(final BallDto dto) {
        this.userBall = BallDto.toEntity(dto);
    }

    public void setComputerBall() {
        this.computerBall = ballGenerator.generate();
    }

    public BallResultDto compareBall() {
        //user와 computer 비교
        int strike = computerBall.compareStrike(userBall);
        int ball = computerBall.compareBall(userBall, strike);
        return BallResultDto.from(strike, ball);
    }
}
