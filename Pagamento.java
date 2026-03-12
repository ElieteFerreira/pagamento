public class Pagamento {
	
	public class Pagamento {
	public void gerarHolerite(Funcionario f, int horasExtras, int meses13) {
	        double salarioBase = f.getCargo().getSalarioBase();
	        double horasExtraValor = Horas.calcularHoraExtra(salarioBase, horasExtras);
	        double salarioBruto = salarioBase + horasExtraValor;
	        
	        double inss = Impostos.calcularINSS(salarioBruto);
	        double irrf = Impostos.calcularIRRF(salarioBruto - inss);
	        double salarioLiquido = salarioBruto - inss - irrf;

	        System.out.println("--- Holerite: " + f.getNome() + " ---");
	        System.out.printf("Salário Base: R$ %.2f\n", salarioBase);
	        System.out.printf("Horas Extras: R$ %.2f\n", horasExtraValor);
	        System.out.printf("Salário Bruto: R$ %.2f\n", salarioBruto);
	        System.out.printf("INSS: R$ %.2f\n", inss);
	        System.out.printf("IRRF: R$ %.2f\n", irrf);
	        System.out.printf("Salário Líquido: R$ %.2f\n", salarioLiquido);
	        System.out.printf("Valor 13º (prop): R$ %.2f\n", DecimoTerceiro.calcularDecimoTerceiro(salarioBase, meses13));
	        System.out.println("---\n");
	    }
	}
	
	}

