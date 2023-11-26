package baseball.utils;

import baseball.domain.Ball;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class BallGenerator {
    private static final int BALL_SIZE = 3;
    private static final int MIN_BALL_NUMBER = 1;
    private static final int MAX_BALL_NUMBER = 9;


    public Ball generate() {
        List<Integer> computer = new ArrayList<>();
        while (computer.size() < BALL_SIZE) {
            int randomNumber = Randoms.pickNumberInRange(MIN_BALL_NUMBER, MAX_BALL_NUMBER);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }
        return Ball.from(computer);
    }
}
