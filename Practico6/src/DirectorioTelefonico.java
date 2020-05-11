
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
public class DirectorioTelefonico {

	private	HashMap<String, Cliente> telefonica = new HashMap<String, Cliente>();
	
	
		 
	public  Cliente agregarCliente(Cliente cliente, String tel){
		return telefonica.put(tel, cliente);
		
	}
	
	public  Cliente buscarCliente(String numero){
		return telefonica.get(numero);
	}
	
	public ArrayList<String> buscarApellido(String apellido){
        ArrayList<String> resultados = new ArrayList<>();
        for(String num : telefonica.keySet()){
            if (telefonica.get(num).getApellido().equals(apellido))
                resultados.add(num);
        }
        return resultados;
    }
	
	public ArrayList<Cliente>  buscarClientes(String ciudad){
		ArrayList<Cliente> resultados = new ArrayList<>();
        for(String aux : telefonica.keySet()){
            if (telefonica.get(aux).getCiudad().equals(ciudad))
                resultados.add(telefonica.get(aux));
        }
        return resultados;
	}
	
	public void eliminarCliente(String dni){ 
		for(String num : telefonica.keySet()){
			if (telefonica.get(num).getNro().equals(dni)){
				telefonica.remove(num);
			}
		}
	}
	
	public void mostrar(){
		Iterator it = telefonica.entrySet().iterator();
		while (it.hasNext()) {
		    Map.Entry e = (Map.Entry)it.next();
		    System.out.println(e.getKey() + " " + e.getValue());
		}
	}

}
