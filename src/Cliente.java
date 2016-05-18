
public class Cliente extends Pessoa {

	public String historicoCompras;
	
	public Cliente(String nome, String cpf, String endereco, int telefone, String historicoCompras){
		super(nome, cpf, endereco, telefone);
		this.historicoCompras = historicoCompras;
	}
	
}
