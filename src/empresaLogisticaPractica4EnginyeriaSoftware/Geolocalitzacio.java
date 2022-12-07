package empresaLogisticaPractica4EnginyeriaSoftware;

import java.util.ArrayList;
import java.util.List;

public class Geolocalitzacio {
	private List<Float> latitud=new ArrayList<Float>();
	private List<Float> longitud=new ArrayList<Float>();
	// CHECK: pq llista? -> pq es va actualitzant guardant els valors previs?
	

	public Geolocalitzacio(){latitud=null; longitud=null;}
	public Geolocalitzacio(float la,float lo){latitud.add(la); longitud.add(lo);}
	public Geolocalitzacio(List<Float> la,List<Float> lo){latitud=la; longitud=lo;}

	public void update(float latitud,float longitud){
		this.latitud.add(latitud); this.longitud.add(longitud);
	}
	
	public List<Float> getLatitud() {return latitud;}
	public void setLatitud(List<Float> lat) { latitud=lat;}
	public List<Float> getLongitud() {return longitud;}
	public void setLongitud(List<Float> longitut) { this.longitud=longitut;}
}
