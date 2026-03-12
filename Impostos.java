public class Impostos {
	public class Impostos {
	    public static double calcularINSS(double salarioBruto) {
	        if (salarioBruto <= 1412.00) return salarioBruto * 0.075;
	        else if (salarioBruto <= 2666.68) return salarioBruto * 0.09;
	        else return salarioBruto * 0.14; 
	    }

	    public static double calcularIRRF(double salarioBaseCalculo) {
	        if (salarioBaseCalculo <= 2112.00) return 0;
	        else if (salarioBaseCalculo <= 2826.65) return salarioBaseCalculo * 0.075;
	        else return salarioBaseCalculo * 0.15;
	    }
	}


}
