package ecommerce.model;

import java.util.ArrayList;
import java.util.List;

public class CatalogoProdutos {
	
	public static final List <produto> produtos = new ArrayList();
	
	 public static void adicionarproduto (produto Produto) {
		 produtos.add(0, Produto);
	 }
	
public static List<produto> obterProduto (){
	return new ArrayList <> (produtos);
}

}
