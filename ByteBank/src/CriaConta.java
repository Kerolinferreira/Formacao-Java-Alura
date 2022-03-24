
public class CriaConta {
	public static void name(String[] args){
		Conta primeiraConta = new Conta ();
		primeiraConta.saldo=200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo+=100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta ();
segundaConta.saldo=50;

System.out.println("primeira conta tem"+primeiraConta.saldo);
System.out.println("Na segunda conta tem"+segundaConta.saldo);
System.out.println("referenciar:"+primeiraConta);
	}
		
	}


