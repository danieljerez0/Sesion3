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
		if(this.saldo-s >= -500.0)
			saldo-=s;
		else System.out.println("Fondos insuficientes (saldo " + this.saldo + " €) en la cuenta " + this.numero + " para el reintegro de " + s + " €");
		
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
}
