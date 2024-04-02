package AbstractFactory.guru.factories;


import AbstractFactory.guru.buttons.Button;
import AbstractFactory.guru.checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
	Button createButton();

	Checkbox createCheckbox();
}