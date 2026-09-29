interface Imprime { public void imprimir(String d); }
interface Escanea { public void  escanear(String d); }
interface Fotocopia { public void fotocopiar(String d); }
interface EnviaFax { public void enviarFax(String d); }

class ImpresoraMultifuncional implements Imprime, Escanea, Fotocopia, EnviaFax {
	public void imprimir(String d) { System.out.println("Imprimiendo " + d); }
	public void escanear(String d) { System.out.println("Escaneando " + d); }
	public void enviarFax(String d) { System.out.println("Enviando fax " + d); }
	public void fotocopiar(String d) { System.out.println("Fotocopiando " + d); }
}

class ImpresoraBasica implements Imprime {
	public void imprimir(String d) { System.out.println("Imprimiendo " + d); }
}

class Escaner implements Escanea {
    public void  escanear(String d) { System.out.println("Escaneando " + d); }
}

public class Main
{
	public static void main(String[] args) {
        
        ImpresoraBasica basic1 = new ImpresoraBasica();
        System.out.println("IMPRESORA BÁSICA");
        basic1.imprimir("Hola");
        //basic1.escanear("Hola");
        //basic1.enviarFax("Hola");
        //basic1.fotocopiar("Hola");
        
        ImpresoraMultifuncional multi1 = new ImpresoraMultifuncional();
        System.out.println("\nIMPRESORA MULTIFUNCIONAL");
        multi1.imprimir("Hola");
        multi1.escanear("Hola");
        multi1.enviarFax("Hola");
        multi1.fotocopiar("Hola");
    
        Escaner esc = new Escaner();
        System.out.println("\nESCANER");
        esc.escanear("Hola");
	}
}
