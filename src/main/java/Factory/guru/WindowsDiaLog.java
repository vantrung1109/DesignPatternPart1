package Factory.guru;

public class WindowsDiaLog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
