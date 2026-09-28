public class CalculadoraEnvio {
	public double calcular(String tipoEnvio, double peso) {
		if (tipoEnvio.equals("NORMAL")) {
			return peso * 2000;
		} else if (tipoEnvio.equals("EXPRESS")) {
			return peso * 5000 + 10000;
		} else if (tipoEnvio.equals("INTERNACIONAL")) {
			return peso * 15000 + 50000;
		}
		throw new IllegalArgumentException("Tipo de envío no soportado");
	}
}
