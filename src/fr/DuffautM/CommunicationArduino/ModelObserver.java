package fr.DuffautM.CommunicationArduino;

public interface ModelObserver {
	
	void onTemperatureIntChanged(double value);
	void onHumidityIntChanged(double value);
	void onTemperatureConsignChanged(double value);

}
