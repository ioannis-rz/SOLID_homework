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