package AbstractFactory.guru.factories;


import AbstractFactory.guru.buttons.Button;
import AbstractFactory.guru.buttons.WindowsButton;
import AbstractFactory.guru.checkboxes.Checkbox;
import AbstractFactory.guru.checkboxes.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new WindowsCheckbox();
	}
}