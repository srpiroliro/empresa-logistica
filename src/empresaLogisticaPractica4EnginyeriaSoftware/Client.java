package empresaLogisticaPractica4EnginyeriaSoftware;

import java.util.Date;

public class Client {
	private String horari;
	
	public Client() {this("");} // CHECK: 
	public Client(String h) {horari=h;}
	
	public void setHorari(String horari) {this.horari=horari;}
	public String getHorari() {return horari;}
	
	// CHECK: comanda la guardem aqui?
	// CHECK: llista de comandes fetes? + getter comanda activa/mes recent? (o es complicarse massa la vida)

	// CHECK: aixo a aqui o a comanda?
	public void crearComanda(Date entrega, String dimensions, String classe_entrega, int prior, float pes, Date creacio, String codi) {
		Comanda nova=new Comanda(entrega,dimensions,classe_entrega, prior,pes,creacio,codi);
	}

	// CHECK: modificar aqui o fer servir els sets publics?
	public void modificarComanda(String que, Object valor/*, Comanda comanda */) throws Exception { // CHECK
		// valors acceptables a `que`: entrega,dimensions,classeEntrega,prioritat,pes,creacio,codi
		
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
	public void eliminarComanda(/*id comanda*/) {return; /* cancela la comanda */}
	public void consultarComanda(/*id comanda*/) {return; /*omplir*/}
}
