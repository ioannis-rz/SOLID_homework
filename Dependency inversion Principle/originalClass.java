public class MySQLDatabase {
	public void guardar(String dato) {
		System.out.println("[MySQL] Guardando: " + dato);
	}
}

public class ServicioUsuarios {
	private MySQLDatabase db = new MySQLDatabase();
	
	public void registrar(String nombreUsuario) {
		if (nombreUsuario == null || nombreUsuario.isBlank()) {
			throw new IllegalArgumentException("Nombre inválido");
		}
		db.guardar(nombreUsuario);
	 }
}
