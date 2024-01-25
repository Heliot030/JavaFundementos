package logica;

public class CuentaLimitada extends Cuenta {
	private double limite;
	public CuentaLimitada(double saldo, double limite){
		super(saldo);
		this.limite = limite;
	}
	public void fijarlimite(){
		limite = getSaldo()/2;
	}
}
