package projetoAlysson;

public class Produto implements Comparable<Produto>{
	private String nome;
	private float preco;
	private int quantidade_estoque, codigo;
	private Estoque estoque;

	public Produto(int codigo, String nome, float preco, int quantidade_estoque) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.quantidade_estoque = quantidade_estoque;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getQuantidade_estoque() {
		return quantidade_estoque;
	}

	public void setQuantidade_estoque(int quantidade_estoque) {
		this.quantidade_estoque = quantidade_estoque;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Estoque getEstoque() {
		return estoque;
	}

	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}

	@Override
	public String toString() {
		return "Produto - nome: " + nome + ", preço: " + preco + ", quantidade estoque: " + quantidade_estoque;
	}

	@Override
	public int compareTo(Produto o) {
		return 0;
	}
	
}
