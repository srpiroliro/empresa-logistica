package empresaLogisticaPractica4EnginyeriaSoftware;
import java.util.Date;

public class Comanda {
	private float pes;
	private String dimensions;
	private Date dataEntrega, dataCreacio;
	private String estat, classeEntrega, codiSeguiment;
	private int prioritat;

	public Comanda(Date entrega, String dimensions, String classe_entrega, int prior, float pes, Date creacio, String codi){
		dataEntrega=entrega;
		this.dimensions=dimensions;
		classeEntrega=classe_entrega;
		prioritat=prior;
		this.pes=pes;
		dataCreacio=creacio;
		codiSeguiment=codi;
		estat="En tràmit"; // "paquet està pendent d’enviament"
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
