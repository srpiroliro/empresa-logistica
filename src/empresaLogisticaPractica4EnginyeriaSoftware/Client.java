package empresaLogisticaPractica4EnginyeriaSoftware;

import java.util.Date;

public class Client {
	private String horari;
	
	public Client() {this("");} // CHECK: 
	public Client(String h) {horari=h;}
	
	public void setHorari(String horari) {this.horari=horari;}
	public String getHorari() {return horari;}
	
	
	// CHECK: aixo a aqui o a comanda?
	public void crearComanda(Date entrega, String dimensions, String classe_entrega, int prior, float pes, Date creacio, String codi) {
		Comanda nova=new Comanda(entrega,dimensions,classe_entrega,prior,pes,creacio,codi);
		// CHECK: comanda la guardem aqui en una llista? (llista de comandes fetes? + getter comanda activa/mes recent? (o es complicarse massa la vida))
	}



	// CHECK: modificar aqui o fer servir els sets publics?
	// CHECK: se li passa comanda, id de comanda o s'agafa la comanda assignada al client(client pot tenir varies comandes)?
	public void modificarComanda(String que, Object valor, int id_comanda) throws Exception {
		// valors acceptables a `que`: [entrega,dimensions,classeEntrega,prioritat,pes,creacio,codi]
		// Comanda comanda=getComandaByID(id_comanda)
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
	public void eliminarComanda(int id) {return; /* cancela la comanda */}
	public void consultarComanda(int id) {
		// return getComandaByID(id).toString();
		return;
	}
}
