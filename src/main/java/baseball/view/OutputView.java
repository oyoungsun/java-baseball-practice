package baseball.view;

import baseball.dto.BallResultDto;

public class OutputView {
    public static void showStart() {
        System.out.println(OutMessage.START_MESSAGE.getMessage());
    }

    public static void printExceptionMessage(final String error) {
        System.out.println(error);
    }

    public static void requestUserNumeber() {
        System.out.print(OutMessage.REQUEST_USER_NUMBER.getMessage());
    }

    public static void showResult(final BallResultDto dto) {
        if(dto.isNothing()){
            System.out.println(OutMessage.NOTHING.getMessage());
            return;
        }
        if(dto.isOnlyBall()){
            System.out.println(String.format(OutMessage.BALL.getMessage(), dto.getBall()));
            return;
        }
        if(dto.isOnlyStrike()){
            System.out.println(String.format(OutMessage.STRIKE.getMessage(), dto.getStrike()));
            return;
        }
        System.out.println(String.format(OutMessage.BALL.getMessage(), dto.getStrike())
                + " " + String.format(OutMessage.STRIKE.getMessage(), dto.getBall()));

    }


    enum OutMessage{
        START_MESSAGE("숫자 야구 게임을 시작합니다."),
        REQUEST_USER_NUMBER("숫자를 입력해주세요 : "),
        ALL_STRIKE("3개의 숫자를 모두 맞히셨습니다! 게임 종료"),
        END_MESSAGE("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요."),
        STRIKE("%d스트라이크"),
        BALL("%d볼"),
        NOTHING("낫싱");

        private String message;

        private OutMessage(String message){
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }
}
