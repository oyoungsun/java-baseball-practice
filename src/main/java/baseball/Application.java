package baseball;

import baseball.controller.GameController;
import baseball.service.BallService;
import baseball.utils.BallGenerator;
import baseball.view.Input;
import baseball.view.InputView;

public class Application {
    public static void main(String[] args) {
        Input input = InputView.getInstance();
        BallService service = new BallService(new BallGenerator());
        GameController controller = GameController.from(input, service);
        controller.run();
    }
}
