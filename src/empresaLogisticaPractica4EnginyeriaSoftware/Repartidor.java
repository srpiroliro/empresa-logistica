package empresaLogisticaPractica4EnginyeriaSoftware;

public class Repartidor {
	private String horari, correu, contrasenya;
	
	public Repartidor(String h, String cor, String con) {
		horari=h;
		correu=cor;
		contrasenya=con;
	}
	
	public String getHorari() {return horari;}
	public void setHorari(String hora) {horari=hora;}

	public String getCorreu() {return correu;}
	public void setCorreu(String mail) {correu=mail;}

	public String getContrasenya() {return contrasenya;}
	public void setContrasenya(String contra) {contrasenya=contra;}
	


	// CHECK: *
	public void modificarComanda() {/*codi*/}

	public void llistarComanda() {/*codi*/}
	public Comanda consultarComanda(/*codiSeg*/) {return null;}

	public void entregaComanda(Comanda x) {x.setEstat("entregada");}
	public void entregaFirmaComanda(Comanda x) {x.setEstat("entregada amb firma");}
}