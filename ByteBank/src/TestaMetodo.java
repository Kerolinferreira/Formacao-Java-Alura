
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.Saldo = 100;
		contaDoPaulo.deposita(50);
		System.out.println(contaDoPaulo.pegasaldo);
		boolean conseguiuRetirar = contaDoPaulo.saca(25);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		boolean sucessoTransferencia = contaDaMarcela.transfere(200, contaDoPaulo);
		if (sucessoTransferencia) {
			System.out.println("transferência bem sucedida");
		} else {
			System.out.println("Faltou dinheiro!");
		}
		System.out.println(contaDaMarcela.pegaSaldo);
		System.out.println(contaDoPaulo.pegaSaldo);
	}
}
