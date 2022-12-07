package empresaLogisticaPractica4EnginyeriaSoftware;

import java.util.Date;

public class Client {
	private String horari;
	
	public Client() {horari="";}
	public Client(String h) {horari=h;}
	
	public void setHorari(String horari) {this.horari=horari;}
	public String getHorari() {return horari;}
	
	public void crearComanda(float pes, String dimensions, Date entrega, Date creacio, String codi, int prior) {
		Comanda nova=new Comanda(pes,dimensions,entrega,creacio,codi,prior);
	}
	public void modificarComanda(/*cosa a modificar*/) {/*omplir*/}
	public void eliminarComanda(/*id comanda*/) {/*omplir*/}
	public void consultarComanda(/*id comanda*/) {/*omplir*/}
}
