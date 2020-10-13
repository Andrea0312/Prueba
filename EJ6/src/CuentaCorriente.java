
public class CuentaCorriente extends CuentaBancaria {
	private LibretaAhorro asociado;
	public CuentaCorriente(int cuenta, double saldo,LibretaAhorro asociado) {
		super(cuenta,saldo);
		this.asociado=asociado;
	}
	public LibretaAhorro get_asociado() {
		return asociado;
	}
	public void set_asociado(LibretaAhorro asociado) {
		this.asociado=asociado;
	}
	public double retirar(double cantidad) {
		double n_saldo=0;
		if(saldo<cantidad) {
			n_saldo=asociado.get_saldo()-cantidad;
		}else {
			n_saldo=saldo-cantidad;
		}
		return n_saldo;
	}

}
