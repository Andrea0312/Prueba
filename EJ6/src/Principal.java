
public class Principal {
	public static void main(String []args) {
		
		CuentaBancaria b=new CuentaBancaria(34567298,350.2);
		LibretaAhorro a=new LibretaAhorro(678329,2000,4);
		CuentaCorriente cc=new CuentaCorriente(2456783,200, a);
		Libreta2000 n= new Libreta2000(23945621,200,8);
		
		b.depositar(200);
		System.out.println("La Cuenta Bancaria tiene" +b.get_saldo());
	}

}
