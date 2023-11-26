package baseball;

import baseball.controller.GameController;
import baseball.view.Input;
import baseball.view.InputView;

public class Application {
    public static void main(String[] args) {
        Input input = InputView.getInstance();
        GameController controller = GameController.from(input);
        controller.run();
    }
}
