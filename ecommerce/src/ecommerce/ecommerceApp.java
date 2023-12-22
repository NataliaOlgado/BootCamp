package ecommerce;

import ecommerce.model.CatalogoProdutos;
import ecommerce.model.produto;

public class ecommerceApp {
	 public static void main(String[] args) {
	        inicializarCatalogoProdutos();
	
     Menu.exibirMenu();
 }
private static void inicializarCatalogoProdutos() {
	
	CatalogoProdutos.adicionarproduto(new produto("Blusa Moletom", 99.99));
    CatalogoProdutos.adicionarproduto(new produto("Calca de Moletom", 80.99));
    CatalogoProdutos.adicionarproduto(new produto("Tênis", 30.99));
    CatalogoProdutos.adicionarproduto(new produto("Bolsa de Ombro", 39.99));
    CatalogoProdutos.adicionarproduto(new produto("Saia", 19.99)); 
    CatalogoProdutos.adicionarproduto(new produto("Conjunto de meias", 14.99));  
 }
}


