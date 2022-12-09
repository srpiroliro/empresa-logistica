package empresaLogisticaPractica4EnginyeriaSoftware;

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
	

	public Comanda consultarComanda(String codi_seguiment){
		// retorna la comanda amb el especificat codi de seguiment desde la base de dades.
		return null;
	}
	public Geolocalitzacio geolocalitzacioComanda(String codi_seguiment) {
		// si l'usuari ha demanat la opcio de poder geolocalitzar la comanda, retorna l'objecte
		// Geolocalitzacio amb el qual es pot saber la ubicacio directe.
		// En cas contrari retornara null.

		return null;
	}
	public void valorarRepartidor(int id_repartidor, int puntuacio, String comentari) {
		// aquesta valoracio s'assignara al repartidor amb el id corresponent.
		// es guardaran a la base de dades de valoracions.
		Valoracio v=new Valoracio(puntuacio, comentari);
		// guardar
	}
}
