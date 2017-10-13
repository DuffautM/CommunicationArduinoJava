package fr.DuffautM.CommunicationArduino;

import java.io.BufferedReader;
import java.io.OutputStream;

import gnu.io.CommPortIdentifier;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;

public class Arduino implements SerialPortEventListener{
	
	private CommPortIdentifier port;
	private BufferedReader input;
	private OutputStream output;

	public Arduino(CommPortIdentifier port, BufferedReader input, OutputStream output) {
		
		this.port = port;
		this.input = input;
		this.output = output;

	}

	@Override
	public void serialEvent(SerialPortEvent event) {

	    if (event.getEventType() != SerialPortEvent.DATA_AVAILABLE) {
	    	return;	 
	    }
	    
	    try 
	    {
	    	while(!input.ready());
            String inputLine = input.readLine();
            System.out.println(inputLine);

        } 
	    catch (Exception e) {
            System.err.println(e.getMessage());
        }
	
	}

}
