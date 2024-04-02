package AbstractFactory.guru.factories;


import AbstractFactory.guru.buttons.Button;
import AbstractFactory.guru.buttons.MacOSButton;
import AbstractFactory.guru.checkboxes.Checkbox;
import AbstractFactory.guru.checkboxes.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new MacOSButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new MacOSCheckbox();
	}
}