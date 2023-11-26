package baseball.controller;

import baseball.dto.BallDto;
import baseball.service.BallService;
import baseball.utils.ExceptionHandler;
import baseball.utils.InputConvertor;
import baseball.view.Input;
import baseball.view.OutputView;

public class GameController {
    final Input inputView;
    final BallService ballService;

    private GameController(final Input input, final BallService ballService) {
        this.inputView = input;
        this.ballService = ballService;
    }

    public static GameController from(final Input input, final BallService ballService) {
        return new GameController(input, ballService);
    }

    public void run() {
        OutputView.showStart();
        settingComputerNumbers();
        //while(게임 진행)
        settingUserNumbers();


    }

    private void settingUserNumbers() {
        OutputView.requestUserNumeber();
        String input = inputView.requestUserNumber();
        try {
            BallDto dto = InputConvertor.convertToBallDto(input);
            ballService.setUserBall(dto);
        }catch (IllegalArgumentException e) {
            ExceptionHandler.printExceptionMessage(e);
            settingUserNumbers();
        }
    }

    private void settingComputerNumbers() {
    }
}
