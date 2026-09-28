public interface Dispositivo {
	void imprimir(String documento);
	void escanear(String documento);
	void enviarFax(String documento);
	void fotocopiar(String documento);
}

public class ImpresoraMultifuncional implements Dispositivo {
	public void imprimir(String d) { System.out.println("Imprimiendo " + d); }
	
	public void escanear(String d) { System.out.println("Escaneando " + d); }
	
	public void enviarFax(String d) { System.out.println("Enviando fax " + d); }
	
	public void fotocopiar(String d) { System.out.println("Fotocopiando " + d); }
}

public class ImpresoraBasica implements Dispositivo {
	public void imprimir(String d) { System.out.println("Imprimiendo " + d); }
	public void escanear(String d) { } // no puede
	public void enviarFax(String d) { } // no puede
	public void fotocopiar(String d) { } // no puede
}
