public class Archivo {
	 protected String contenido = "";
	 public String leer() { return contenido; }
	 public void escribir(String texto) { contenido += texto; }
}

public class ArchivoSoloLectura extends Archivo {
	@Override
	public void escribir(String texto) {
		throw new UnsupportedOperationException("Este archivo es de solo lectura");
	}
}

public class Editor {
	public void agregarFirma(java.util.List<Archivo> archivos) {
		for (Archivo a : archivos) {
			a.escribir("\n-- Firmado por el sistema");
		}
	}
}
