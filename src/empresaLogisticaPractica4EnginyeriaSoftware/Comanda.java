package empresaLogisticaPractica4EnginyeriaSoftware;
import java.util.Date;

public class Comanda {
	private float pes;
	private String dimensions;
	private Date dataEntrega, dataCreacio;
	private String estat, classeEntrega, codiSeguiment;
	private int prioritat;
	
	public Comanda() {
		pes=0;
		dimensions=null;
		dataCreacio=null;
		dataEntrega=null;
		codiSeguiment=null;
		prioritat=0;
		estat=null;
		classeEntrega=null;
	}
	public Comanda(float pes, String dimensions, Date entrega, Date creacio, String codi, int prior) {
		this.pes=pes;
		this.dimensions=dimensions;
		dataCreacio=creacio;
		dataEntrega=entrega;
		codiSeguiment=codi;
		prioritat=prior;
		estat=null;
		classeEntrega=null;
	}
	
	public void setPes(float pes) {this.pes=pes;}
	public float getPes() {return pes;}
	public void setDimensions(String dimensions) {this.dimensions=dimensions;}
	public String getDimensions() {return dimensions;}
	public void setDataEntrega(Date entrega) {dataEntrega=entrega;}
	public Date getDataEntrega() {return dataEntrega;}
	public void setDataCreacio(Date creacio) {dataCreacio=creacio;}
	public Date getDataCreacio() {return dataCreacio;}
	public void setEstat(String estat) {this.estat=estat;}
	public String getEstat() {return estat;}
	public void setClasseEntrega(String classe) {classeEntrega=classe;}
	public String getClasseEntrega() {return classeEntrega;}
	public void setCodiSeguiment(String codi) {codiSeguiment=codi;}
	public String getCodiSeguiment() {return codiSeguiment;}
	public void setPrioritat(int pr) {prioritat=pr;}
	public int getPrioritat() {return prioritat;}
}
