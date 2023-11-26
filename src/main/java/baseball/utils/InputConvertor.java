package baseball.utils;

import baseball.dto.BallDto;
import java.util.List;

public class InputConvertor {

    private static final int MIN_BALL = 123;
    private static final int MAX_BALL = 987;
    private static final String BASEBALL_BOUNDARY = "야구게임에서 입력 가능한 숫자 범위를 벗어났습니다. ";

    public static BallDto convertToBallDto(final String input) {
        int inputToInt = Integer.parseInt(input);
        if(MIN_BALL > inputToInt || inputToInt > MAX_BALL) {
            throw new IllegalArgumentException(BASEBALL_BOUNDARY);
        }
        int first = inputToInt / 100;
        int second = (inputToInt % 100) / 10;
        int third = inputToInt % 10;
        return BallDto.of(first, second, third);
    }
}
