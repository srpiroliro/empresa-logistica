package empresaLogisticaPractica4EnginyeriaSoftware;

import java.util.Date;

public class Client {
	private String horari;
	
	public Client(String h) {horari=h;}
	
	public void setHorari(String horari) {this.horari=horari;}
	public String getHorari() {return horari;}

	public String crearComanda(Date entrega, String dimensions, String classe_entrega, int prior, float pes, Date creacio, String codi) {
		Comanda nova=new Comanda(entrega,dimensions,classe_entrega,prior,pes,creacio,codi);
		// guardar la comanda a la base de dades i retorna el codi de segiument.
		return null;
	}

	// versio simple
	public void modificarComanda(/* que es vol modificar i el seu valor,*/ String codi_seguiment) throws Exception {
		// agafara la comanda que tingui el mateix codi_seguiment de la base de dades i la modificara. 
	}


	// versio complicada
	public void modificarComanda(String que, Object valor, String codi_seguiment) throws Exception {
		// valors acceptables a `que`: [entrega,dimensions,classeEntrega,prioritat,pes,creacio,codi]
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


	public boolean eliminarComanda(int id) {
		/* cancela la comanda. retornara true o false depenent de si s'ha aconseguit eliminarla o no. */
		return false; 
	}
	public Comanda consultarComanda(int id) {
		// retorna la comanda del id que s'ha passat com a parametre.
		// return getComandaByID(id).toString();
		return null;
	}
}
