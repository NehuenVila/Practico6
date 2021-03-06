
public class Cliente {

	private String dni;
	private String nombre;
	private String apellido;
	private String ciudad;
	
	public String getNro() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public Cliente(String dni, String nombre, String apellido, String ciudad){
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.ciudad = ciudad;
	}
	
}
