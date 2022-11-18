package pessoasArrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o nome e o email que deseja adicionar:");
		
		String nome = entrada.next();
		String email = entrada.next();

		Listas l = new Listas();
		
		Pessoa p = new Pessoa(nome, email);	
		
		l.add(p);
		
	//	System.out.println("Deseja adicionar contatos?");
		

		
		List<Pessoa> lista = l.getLista();
		
		for (Pessoa item : lista) {
			System.out.println(item.toString());
		}

	}

}