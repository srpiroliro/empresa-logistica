package empresaLogisticaPractica4EnginyeriaSoftware;

public class Valoracio {
	private int puntuacio;
	private String comentari;
	
	public Valoracio(int p, String c) {
		puntuacio=p;
		comentari=c;
	}
	
	public int getPuntuacio() {return puntuacio;}
	public void setPuntuacio(int punts) {puntuacio=punts;}

	public String getComentari() {return comentari;}
	public void setComentari(String com) {comentari=com;}
}
