package Decorator.guru.decorators;

public interface DataSource {
	void writeData(String data);

	String readData();
}