
public class CuentaBancaria {
	protected int cuenta;
	protected double saldo;
	public CuentaBancaria(int cuenta, double saldo) {
		this.cuenta=cuenta;
		this.saldo=saldo;
	}
	public int get_cuenta() {
		return cuenta;
		
	}
	public double get_saldo() {
		return saldo;
	}
	public void set_cuenta(int c) {
		this.cuenta=c;
	}
	public void set_saldo(double s) {
		this.saldo=s;
	}
	public void depositar(double cantidad) {
		saldo=saldo+cantidad;
	}
	public double retirar(double cantidad) {
		double n_saldo=0;
		if(cantidad<saldo) {
			n_saldo=saldo-cantidad;
		}else {
			n_saldo=saldo;
		}
		return n_saldo;
	
	}
	public String tostring() {
		return "Cuenta Bancaria "+cuenta+ "tiene un saldo de "+saldo;
		}
}
