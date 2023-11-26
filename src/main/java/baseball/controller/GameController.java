package baseball.controller;

import baseball.dto.BallDto;
import baseball.utils.ExceptionHandler;
import baseball.utils.InputConvertor;
import baseball.view.Input;
import baseball.view.OutputView;

public class GameController {
    final Input inputView;

    private GameController(final Input input) {
        this.inputView = input;
    }

    public static GameController from(final Input input) {
        return new GameController(input);
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
            InputConvertor.convertToBallDto(input);
        }catch (IllegalArgumentException e) {
            ExceptionHandler.printExceptionMessage(e);
            settingUserNumbers();
        }
    }

    private void settingComputerNumbers() {
    }
}
