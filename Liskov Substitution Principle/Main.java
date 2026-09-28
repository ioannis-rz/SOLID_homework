import java.util.List;
import java.util.LinkedList;

abstract class Archivo {
	 protected String contenido = "";
	 public String leer() { return contenido; }
}
interface Escribible {
    public void escribir(String text);
}

class ArchivoSoloLectura extends Archivo {}

class ArchivoEscrituraLectura extends Archivo implements Escribible {
    public void escribir(String texto) { contenido += texto; }
}

class Editor {
    public void agregarFirma(java.util.List<Escribible> archivos) {
    	for (Escribible a : archivos) {
    		a.escribir("\n-- Firmado por el sistema");
    	}
    }
}

public class Main
{
	public static void main(String[] args) {
    
    ArchivoEscrituraLectura arc = new ArchivoEscrituraLectura();
    arc.escribir("Merequetengue");
    
    ArchivoSoloLectura asl = new ArchivoSoloLectura();
    
    List<Escribible> list = new LinkedList();
    list.addLast(arc);
    list.addLast(asl);
    
    Editor editor = new Editor();
    editor.agregarFirma(list);
    
    System.out.println(arc.leer());
    
	}
}
