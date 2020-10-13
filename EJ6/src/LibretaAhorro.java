
public class LibretaAhorro extends CuentaBancaria {
	private double interes;
	public LibretaAhorro(int cuenta, double saldo, double interes) {
		super(cuenta,saldo);
		this.interes=interes;
	}
	public double get_interes() {
		return interes;
	}
	public void set_interes(double i) {
		this.interes=i;
	}
	public void calcular_interes() {
		saldo-=saldo*interes/100;
	}
}
