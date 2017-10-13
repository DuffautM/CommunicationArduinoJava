package fr.DuffautM.CommunicationArduino;

import java.util.ArrayList;
import java.util.List;

public class Model {
	
	private List<ModelObserver> observers = new ArrayList<ModelObserver>();
	
	private double temperatureConsigne = 0;
	private double temperatureExt = 0;
	private double temperatureInt = 0;
	private double humidityInt = 0;
	
	public void addObserver(ModelObserver observer){
		observers.add(observer);
	}
	
	public void removeObserver(ModelObserver observer){
		observers.remove(observer);
	}
	
	private void notifyTemperatureIntChanged(){
		for (ModelObserver observer : observers)
		{
			observer.onTemperatureIntChanged(this.temperatureInt);
		}
	}

	private void notifyHumidityIntChanged(){
		for (ModelObserver observer : observers)
		{
			observer.onHumidityIntChanged(this.humidityInt);
		}
	}
	
	private void notifyConsignChanged(){
		for (ModelObserver observer : observers)
		{
			observer.onTemperatureIntChanged(this.temperatureConsigne);
		}
	}
	
	public double getTemperatureInt() {
		return temperatureInt;
	}
	public void setTemperatureInt(double temperatureInt) {

		this.temperatureInt = temperatureInt;
		notifyTemperatureIntChanged();
	}
	public double getHumidityInt() {
		return humidityInt;
	}
	public void setHumidityInt(double humidityInt) {

		this.humidityInt = humidityInt;
		notifyHumidityIntChanged();
	}
	public double getTemperatureConsigne() {
		return temperatureConsigne;
	}
	public void setTemperatureConsigne(double temperatureConsigne) {
		this.temperatureConsigne = temperatureConsigne;
	}
	public double getTemperatureExt() {
		return temperatureExt;
	}
	public void setTemperatureExt(double temperatureExt) {
		
		this.temperatureExt = temperatureExt;
		notifyConsignChanged();
	}

}
