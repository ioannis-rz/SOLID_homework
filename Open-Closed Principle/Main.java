interface Calculadora {
    public abstract double calcular(double peso);
}

class CalcEnvioNormal implements Calculadora {
    public double calcular(double peso) { return peso * 2000; }
}
class CalcEnvioExpress implements Calculadora {
    public double  calcular(double peso) { return peso * 5000 + 10000; }
}
class CalcEnvioInternacional implements Calculadora {
    public double  calcular(double peso) { return peso * 15000 + 50000; }
}
class CalcEnvioMismoDia implements Calculadora {
    public double calcular(double peso) { return peso * 8000 + 20000; }
}

public class Main
{
	public static void main(String[] args) {
		Calculadora calculadora = new CalcEnvioNormal();
		System.out.println("Precio envío normal:\t\t" + calculadora.calcular(5));
		calculadora = new CalcEnvioExpress();
		System.out.println("Precio envío express:\t\t" + calculadora.calcular(5));
		calculadora = new CalcEnvioInternacional();
		System.out.println("Precio envío internacional: \t" + calculadora.calcular(5));
		calculadora = new CalcEnvioMismoDia();
		System.out.println("Precio envío mismo dia:\t\t" + calculadora.calcular(5));
	}
}
