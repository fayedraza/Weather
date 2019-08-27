//created by Fayed Raza
public class results {
	float temperature;
     float dewPoint;
     float percipitation;
     String timeStamp;
     
     
     //constructor
     public results(float temperature,float dewPoint ,float percipitation, String timeStamp ) {
    	 this.temperature=temperature;
    	 this.dewPoint=dewPoint;
    	 this.percipitation=percipitation;
    	 this.timeStamp = timeStamp;
    	 
     }
     
     
 
     
     //getter methods which returns a value
     public float getTemperature(){
	return temperature;
    	}
	
	public float getDewPoint(){
		return dewPoint;
	    	}
	public float getPercipitation(){
		return percipitation;
	    	}
	public String getTimeStamp() {
		return timeStamp;
		
	}
	
	public String toString() {
		return "Results: " +"\nTemperature: " + getTemperature() + " °C"
				+"\nDewPoint: " + getDewPoint() + " °C" 
				+"\nPercipitation: " + getPercipitation()+ " mm"
				+"\nTimeStamp: " + getTimeStamp();
		
		
		
	}
			
			
			
	
}
