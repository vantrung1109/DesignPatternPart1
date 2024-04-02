package DependencyInjection.gpcoder.di;

public class DependencyInjectionPatternExample {

	public static void main(String[] args) {
		MessageService messageService = new EmailService();
		UserController userController = new UserController(messageService);
		userController.send();
	}
}