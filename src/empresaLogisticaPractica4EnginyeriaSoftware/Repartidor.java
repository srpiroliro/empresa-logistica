package empresaLogisticaPractica4EnginyeriaSoftware;

public class Repartidor {
	private String horari, correu, contrasenya;
	
	public Repartidor(String h, String cor, String con) {
		horari=h; correu=cor; contrasenya=con;
	}
	
	public String getHorari() {return horari;}
	public void setHorari(String hora) {horari=hora;}

	public String getCorreu() {return correu;}
	public void setCorreu(String mail) {correu=mail;}

	public String getContrasenya() {return contrasenya;}
	public void setContrasenya(String contra) {contrasenya=contra;}
	

	// versio simple
	public void modificarComanda(/* que es vol modificar i el seu valor,*/ String codi_seguiment) throws Exception {
		// agafara la comanda que tingui el mateix codi_seguiment de la base de dades i la modificara. 
	}

	// versio complicada
	public void modificarComanda(String que, Object valor, String codi_seguiment) throws Exception {
		// Comanda comanda=getComandaByCodiSeguiment(codi_seguiment)
		switch(que) {
			case "entrega":
				// comanda.setEntrega((Date) valor)
				break;
			case "dimensions":
				// comanda.setDimensions((String) valor)
				break;
			case "classeEntrega":
				// comanda.setClasseEntrega((String) valor)
				break;
			case "prioritat":
				// comanda.setPrioritat((Integer) valor)
				break;
			case "pes":
				// comanda.setPes((Float) valor)
				break;
			case "creacio":
				// comanda.setCreacio((Date) valor)
				break;
			case "codi":
				// comanda.setCodi((String) valor)
				break;
			default: throw new Exception();
		}
	}

	public Comanda consultarComanda(String codi_seguiment) {
		// retorna la comanda del id que s'ha passat com a parametre.
		// return getComandaByID(id).toString();
		return null;
	}

	public Comanda[] llistarComanda(){
		// retorna una llista de totes les comandes asignades a aquest repartidor.
		return null;
	}

	public void entregaComanda(Comanda x) {x.setEstat("entregada");}
	public void entregaFirmaComanda(Comanda x) {x.setEstat("entregada amb firma");}
}