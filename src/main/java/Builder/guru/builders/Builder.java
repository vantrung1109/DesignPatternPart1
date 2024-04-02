package Builder.guru.builders;


import Builder.guru.cars.CarType;
import Builder.guru.components.Engine;
import Builder.guru.components.GPSNavigator;
import Builder.guru.components.Transmission;
import Builder.guru.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
	void setCarType(CarType type);

	void setSeats(int seats);

	void setEngine(Engine engine);

	void setTransmission(Transmission transmission);

	void setTripComputer(TripComputer tripComputer);

	void setGPSNavigator(GPSNavigator gpsNavigator);
}