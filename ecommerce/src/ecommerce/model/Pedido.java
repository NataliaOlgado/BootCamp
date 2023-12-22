package ecommerce.model;

import java.util.ArrayList;
import java.util.List;


public class Pedido {
	
	private cliente Cliente;
	private static List<itemVendas> itensVenda;
	
	
	    public Pedido(cliente cliente, List<itemVendas> itensVenda) {
		this.Cliente = cliente;
		this.itensVenda = new ArrayList<>();
	}

		

	    public static void adicionarItemVenda(produto produto, int quantidade) {
	        itemVendas item = new itemVendas(produto, quantidade);
	        itensVenda.add(item);
	    }

	    public void exibirItensVenda() {
	        System.out.println("Itens do Carrinho:");
	        for (itemVendas item : itensVenda) {
	            System.out.println(item.getQuantidade() + "x " + item.getProduto().getNome() + " - R$" + item.getProduto().getPreco() * item.getQuantidade());
	        }
	    }

	    public double calcularTotal() {
	        double total = 0.0;
	        for (itemVendas item : itensVenda) {
	            total += item.getProduto().getPreco() * item.getQuantidade();   
	        }
	        return total;
	    }

		public cliente getCliente() {
			return Cliente;
		}

		public void setCliente(cliente cliente) {
			this.Cliente = cliente;
		}
	}
	
	
	


