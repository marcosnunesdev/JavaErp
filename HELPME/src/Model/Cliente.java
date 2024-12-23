package Model;

public class Cliente {
	protected int codigo;
	protected int cpf;
	protected String nome;

	public Cliente() {

	}

	public Cliente(int codigo, int cpf, String nome) {
		super();
		this.codigo = codigo;
		this.cpf = cpf;
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
