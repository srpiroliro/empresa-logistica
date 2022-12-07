package empresaLogisticaPractica4EnginyeriaSoftware;

import java.util.List;

public class Geolocalitzacio {
	private List<Number> latitud, longitud;
	
	public Geolocalitzacio() {
		latitud=null;
		longitud=null;
	}
	
	public List<Number> getLatitud() {return latitud;}
	public void setLatitud(List<Number> lat) { latitud=lat;}
	public List<Number> getLongitud() {return longitud;}
	public void setLongitud(List<Number> longitut) { this.longitud=longitut;}
}
