package design.patterns.observer.headfirst.example2;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {

	private float currentPressure = 29.92f;
	private float lastPressure;
	Observable observable;

	public ForecastDisplay(Observable observable) {
		observable.addObserver(this);
		observable.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("lastPressure: " + lastPressure + "currentPressure " + currentPressure);
	}

	@Override
	public void update(Observable observable, Object arg) {
		if (observable instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) observable;
			this.lastPressure = currentPressure;
			this.currentPressure = weatherData.getPressure();
			display();
		}

	}

}
