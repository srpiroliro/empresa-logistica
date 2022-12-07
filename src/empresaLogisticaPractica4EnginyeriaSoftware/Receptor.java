package empresaLogisticaPractica4EnginyeriaSoftware;

import java.sql.Date;

public class Receptor {
	private String DNI, nom, eMail;
	private float telefon;
	
	public Receptor() {
		DNI=null;
		nom=null;
		eMail=null;
		telefon=0;
	}
	
	public String getDNI() {return DNI;}
	public void setDNI(String DNI) {this.DNI=DNI;}
	public String getNom() {return nom;}
	public void setNom(String name) {nom=name;}
	public String getEmail() {return eMail;}
	public void setEmail(String correu) {eMail=correu;}
	public float getTelefon() {return telefon;}
	public void setTelefon(float tel) {telefon=tel;}
	
	public Comanda consultarComanda(/*codiSeguiment*/) {
		return new Comanda();
	}
	public Geolocalitzacio geolocalitzacioComanda(/*codiSeguiment*/) {
		return new Geolocalitzacio();
	}
	public Date calcularEnviament(/*dataCreacio*/) {
		return null;
	}
	public Valoracio valorarRepartidor(/*id repartidor*/) {
		return new Valoracio();
	}
}
