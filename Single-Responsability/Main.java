
public class Main
{
    public static double calcularPromedio(Estudiante e) {
    	double suma = 0;
    	for (double n : e.getNotas()) suma += n;
    	return suma / e.getNotas().length;
    }
    
    public static void enviarCorreoAlAcudiente(Estudiante e) {
        System.out.println("Enviando boletín por correo al acudiente de " + e.getNombre());
    }
        
    public static void imprimirBoletin(Estudiante e) {
        System.out.println("=== BOLETÍN ===");
        System.out.println("Nombre: " + e.getNombre());
        System.out.println("Promedio: " + calcularPromedio(e));
    }
    
    public static void guardarEnArchivo(Estudiante e) {
    	System.out.println("Guardando " + e.getNombre() + " en estudiantes.txt...");
    }
    
	public static void main(String[] args) {
		double[] arr = {4.0, 5.0};
		Estudiante e1 = new Estudiante("Luis", arr); 
		
		guardarEnArchivo(e1);
		imprimirBoletin(e1);
		enviarCorreoAlAcudiente(e1);
	}
}