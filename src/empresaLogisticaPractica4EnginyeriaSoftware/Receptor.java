package empresaLogisticaPractica4EnginyeriaSoftware;

import java.sql.Date;

public class Receptor {
	private String dni, nom, email, telefon;

	public Receptor(String dni, String nom, String email, String telefon) {
		this.dni=dni;
		this.nom=nom;
		this.email=email;
		this.telefon=telefon;
	}

	public String getDni() {return dni;}
	public void setDni(String dni) {this.dni=dni;}

	public String getNom() {return nom;}
	public void setNom(String name) {nom=name;}

	public String getEmail() {return email;}
	public void setEmail(String correu) {email=correu;}

	public String getTelefon() {return telefon;}
	public void setTelefon(String tel) {telefon=tel;}
	

	// CHECK: *
	public Comanda consultarComanda(/*codiSeguiment*/) {
		return null;
	}
	public Geolocalitzacio geolocalitzacioComanda(/*codiSeguiment*/) {
		return null;
	}
	public Date calcularEnviament(/*dataCreacio*/) {
		return null;
	}
	public Valoracio valorarRepartidor(/*id repartidor*/) {
		return new Valoracio();
	}
}
