 public class Cargo {

    private String nomeCargo;
    private double salarioBase;

    public Cargo(String nomeCargo) {
        this.nomeCargo = nomeCargo;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
}