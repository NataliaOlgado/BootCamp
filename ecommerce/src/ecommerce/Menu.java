package ecommerce;
import ecommerce.model.CatalogoProdutos;
import ecommerce.model.Pedido;
import ecommerce.model.cliente;
import ecommerce.model.produto;
import java.util.InputMismatchException;
import java.util.Scanner;
import ecommerce.util.Cores;
import java.util.List;

public class Menu {
	
	static Scanner read = new Scanner(System.in);

	static Pedido pedido = new Pedido(new cliente("Cliente Teste"), null);
	
public static void exibirMenu() {
    	
    	System.out.print("Como gostaria de ser chamade? \n");
    	String nomeCliente = read.nextLine();
        
        
        System.out.println("\nBem-vinde " + nomeCliente + " ao nosso e-commerce!\n");

    	
        int escolha = 0;

        do {
            try {
            	System.out.println(Cores.TEXT_BLUE+"************************************");
            	System.out.println("*        Menu Principal            *");
            	System.out.println("*                                  *");
            	System.out.println("* 1. Listar Produtos               *");
            	System.out.println("* 2. Adicionar Produto ao Carrinho *");
            	System.out.println("* 3. Visualizar Carrinho           *");
            	System.out.println("* 4. Finalizar Compra              *");
            	System.out.println("* 0. Sair                          *");
            	System.out.println("************************************" + Cores.TEXT_RESET);

                System.out.print("Escolha uma opção: ");
                escolha = read.nextInt();

                switch (escolha) {
                    case 1:
                        listarProdutos();
                        break;
                    case 2:
                        adicionarProdutoAoCarrinho();
                        break;
                    case 3:
                        visualizarCarrinho();
                        break;
                    case 4:
                        finalizarCompra();
                        break;
                    case 0:
                        System.out.println(Cores.TEXT_BLUE+"Saindo do sistema. Volte sempre!");
                        break;
                    default:
                        System.out.println(Cores.TEXT_BLUE+"Opção inválida. Tente novamente.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println(Cores.TEXT_BLUE+"Por favor, insira um número válido.");
                read.next(); 
            }

        } while (escolha != 0);
    }

    private static void listarProdutos() {
        List<produto> produtos = CatalogoProdutos.obterProduto();
        if (produtos.isEmpty()) {
            System.out.println(Cores.TEXT_BLUE+"Nenhum produto disponível no catálogo.");
        } else {
            System.out.println(Cores.TEXT_BLUE+"Lista de Produtos:");
            for (int i = 0; i < produtos.size(); i++) {
                produto produto = produtos.get(i);
                System.out.println(Cores.TEXT_BLUE +(i + 1) + ". " + produto.getNome() + " - R$" + produto.getPreco());
            }
        }
    }

    private static void adicionarProdutoAoCarrinho() {
        List<produto> produtos = CatalogoProdutos.obterProduto();
        if (produtos.isEmpty()) {
            System.out.println(Cores.TEXT_BLUE+"Nenhum produto disponível para adicionar ao carrinho.");
        } else {
            try {
                System.out.print(Cores.TEXT_BLUE+"Escolha o número do produto a adicionar: ");
                int escolhaProduto = read.nextInt();
                if (escolhaProduto >= 1 && escolhaProduto <= produtos.size()) {
                    produto produtoSelecionado = produtos.get(escolhaProduto - 1);
                    System.out.print(Cores.TEXT_BLUE +"Digite a quantidade desejada: ");
                    int quantidade = read.nextInt();
                    pedido.adicionarItemVenda(produtoSelecionado, quantidade);
                    System.out.println(Cores.TEXT_BLUE+ "Produto adicionado ao carrinho com sucesso!");
                } else {
                    System.out.println(Cores.TEXT_BLUE+ "Escolha inválida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println(Cores.TEXT_BLUE+ "Por favor, insira um número válido.");
                read.next(); 
            }
        }
    }

    private static void visualizarCarrinho() {
        pedido.exibirItensVenda();
        System.out.println(Cores.TEXT_BLUE+ "Total do Carrinho: R$" + pedido.calcularTotal());
    }

    private static void finalizarCompra() {
        System.out.println(Cores.TEXT_BLUE+ "Compra finalizada. Obrigado por utilizar nosso e-commerce!");
    }

		
	}



