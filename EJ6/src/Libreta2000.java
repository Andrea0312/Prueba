
public class Libreta2000 extends LibretaAhorro{
	private double penalizacion;
	public Libreta2000(int cuenta, double saldo,double interes) {
		super(cuenta,saldo,interes);
		
	}
	public double get_penalizacion() {
		return penalizacion;
	}
	public void set_penalizacion(double pena) {
		this.penalizacion=pena;
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
}
