interface Database { public void guardar(String dato);}

class MySQLDatabase implements Database {
	public void guardar(String dato) {
		System.out.println("[MySQL] Guardando: " + dato);
	}
}
class MongoDBDatabase implements Database {
    public void guardar(String dato) {
		System.out.println("[MongoDB] Guardando: " + dato);
    }
}
class ServicioUsuarios {
    private final Database db;
    
    public ServicioUsuarios(Database db) {
        this.db = db;
    }
    
    public void registrar(String nombreUsuario) {
		if (nombreUsuario == null || nombreUsuario.isBlank()) {
			throw new IllegalArgumentException("Nombre inválido");
		}
		db.guardar(nombreUsuario);
	}  
}

public class Main
{
	public static void main(String[] args) {
	    Database control = new MySQLDatabase();
        ServicioUsuarios serv = new ServicioUsuarios(control);
        serv.registrar("Juan");
        
        control = new MongoDBDatabase();
        serv = new ServicioUsuarios(control);
        serv.registrar("Luis");
	}
}
