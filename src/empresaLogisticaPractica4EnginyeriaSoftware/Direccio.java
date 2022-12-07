package empresaLogisticaPractica4EnginyeriaSoftware;

public class Direccio {
	private String carrer, poblacio;
	private int numero, codiPostal;

	public Direccio(String carrer, String poblacio, int numero, int codiPostal) {
		this.carrer=carrer;
		this.poblacio=poblacio;
		this.numero=numero;
		this.codiPostal=codiPostal;
	}
	
	public String getCarrer() {return carrer;}
	public void setCarrer(String carrer) {this.carrer=carrer;}
	public String getPoblacio() {return poblacio;}
	public void setPoblacio(String poble) {poblacio=poble;}
	public int getNumero() { return numero;}
	public void setNumero(int num) {numero=num;}
	public int getCodiPostal() { return codiPostal;}
	public void setCodiPostal(int codi) {codiPostal=codi;}
}
