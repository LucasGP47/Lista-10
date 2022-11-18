package pessoasArrays;

import java.util.ArrayList;
import java.util.List;


public class Listas {
	
	private List<Pessoa> lista = new ArrayList<Pessoa>();
		
	public List<Pessoa> getLista() {
		return lista;
	}

	public void setLista(List<Pessoa> lista) {
		this.lista = lista;
	}

	public boolean add(Pessoa pessoa) {
		lista.add(pessoa);
		return true;
	}
	
	

	
}
