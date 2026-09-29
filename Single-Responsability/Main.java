class Estudiante {
    private String nombre;
    private double[] notas;
    	
    public Estudiante(String nombre, double[] notas) {
    	this.nombre = nombre;
    	this.notas = notas;
    }
    public String getNombre() {
        return this.nombre;
    }
    public double[] getNotas() {
        return this.notas;
    }
}
class CalculadoraPromedio {
    public double calcularPromedio(Estudiante e) {
    	double suma = 0;
    	for (double n : e.getNotas()) suma += n;
    	return suma / e.getNotas().length;
    }
}
class GeneradorBoletin {
    public void imprimirBoletin(Estudiante e) {
        CalculadoraPromedio calc = new CalculadoraPromedio();
        System.out.println("=== BOLETÍN ===");
        System.out.println("Nombre: " + e.getNombre());
        System.out.println("Promedio: " + calc.calcularPromedio(e));
    }
}
class GuardadoArchivo {
    public static void guardarEnArchivo(Estudiante e) { System.out.println("Guardando " + e.getNombre() + " en estudiantes.txt..."); }
}
class EnviadorCorreo {
    public static void enviarCorreoAlAcudiente(Estudiante e) { System.out.println("Enviando boletín por correo al acudiente de " + e.getNombre()); }
}

public class Main
{
    public static void main(String[] args) {
		double[] arr = {4.0, 5.0};
		Estudiante e1 = new Estudiante("Luis", arr); 
        
        GuardadoArchivo guar = new GuardadoArchivo();
        guar.guardarEnArchivo(e1);
		
		GeneradorBoletin gen = new GeneradorBoletin();
		gen.imprimirBoletin(e1);
		
		EnviadorCorreo cor = new EnviadorCorreo();
		cor.enviarCorreoAlAcudiente(e1);
	}
}
