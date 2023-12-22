package ecommerce.model;

public class itemVendas{
	
	private produto Produto;
	private int quantidade;
	
	public itemVendas(produto produto, int quantidade) {
		this.Produto = produto;
		this.quantidade = quantidade;
		
	}

	public produto getProduto() {
		return Produto;
	}

	public void setProduto(produto produto) {
		Produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
		
	}
	
	

		



