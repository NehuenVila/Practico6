
public class Main {

	public static void main(String[] args) {
		
		DirectorioTelefonico claro = new DirectorioTelefonico();
		
		Cliente juan = new Cliente("1234", "juan", "peres", "madrir");
		
		claro.agregarCliente(juan, "123456");
		claro.agregarCliente(new Cliente("1255", "pedro", "jas", "senil"),"222222");
		claro.agregarCliente(new Cliente("4444", "diego", "vinda", "senil"), "333333");
		
		claro.buscarCliente("123456");
		claro.buscarApellido("jas");
		claro.buscarClientes("senil");
		claro.eliminarCliente("4444");
		claro.mostrar();

	}

}
