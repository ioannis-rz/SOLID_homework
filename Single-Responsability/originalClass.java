public class Estudiante {
	private String nombre;
	private double[] notas;
	
	public Estudiante(String nombre, double[] notas) {
		this.nombre = nombre;
		this.notas = notas;
	}
	
	public double calcularPromedio() {
		double suma = 0;
		for (double n : notas) suma += n;
		return suma / notas.length;
	}
	
	public void guardarEnArchivo() {
		System.out.println("Guardando " + nombre + " en estudiantes.txt...");
	}
	
	public void imprimirBoletin() {
		System.out.println("=== BOLETÍN ===");
		System.out.println("Nombre: " + nombre);
		System.out.println("Promedio: " + calcularPromedio());
	}
	
	public void enviarCorreoAlAcudiente() {
		System.out.println("Enviando boletín por correo al acudiente de " + nombre);
	}
}
