package baseball.view;

import baseball.utils.ExceptionHandler;

public class ProxyInputView implements Input {
    private final Input viewable;

    public ProxyInputView(Input viewable) {
        this.viewable = viewable;
    }

    @Override
    public String requestUserNumber() {
        return ExceptionHandler.input(viewable::requestUserNumber, 0);
    }
}
