package intities;

public class conta {

	private int numero;
	private String correntista;
	private double saldoConta;
	
		
	public conta(int numero, String correntista) {
		this.numero = numero;
		this.correntista = correntista;
	}
	
	public conta(int numero, String correntista, double depositoInicial) {
		this.numero = numero;
		this.correntista = correntista;
		deposito(depositoInicial);
	}

	public int getNumero() {
		return numero;
	}


	public String getCorrentista() {
		return correntista;
	}

	public void setCorrentista(String correntista) {
		this.correntista = correntista;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	public void deposito(double valor) {
		saldoConta += valor;
		}
	
	public void saque(double valor) {
		saldoConta -= valor + 5.00;
		
		
	}
	
public String toString() {
	return "Nº da conta "
			+ numero
			+ ", Correntista: "
			+ correntista
			+ ", Saldo na conta: R$ "
			+ String.format("%.2f", saldoConta);
}
	
	
	
	
}
