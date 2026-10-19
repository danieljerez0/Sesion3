package sesion3;

public class Cuenta {

	private String numero;
	private String titular;
	private double saldo;
	
	public Cuenta(double saldo){
		this.saldo=saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void ingresar(double s) {
		saldo+=s;
	}
	
	public void retirar(double s) {
		saldo-=s;
	}
}
