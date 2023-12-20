package ecommerce;

import java.util.Scanner;

public class Controller {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Usuario usuario = new Usuario(null, null, null, null, null, 0, null, null);

        Produto produto = new Produto("Ventilador", 90, 2);

        Compra compra = new Compra(null, 0, 0, 0, 0, 0, 0);

        // CADASTRO DE USUÁRIO
        System.out.println("Neste momento iremos realizar o cadastro de Usuário");

        System.out.println("Digite seu nome:");
        usuario.setNome(scan.nextLine());
        usuario.validarDados(usuario.getNome(), 20);

        System.out.println("Digite seu e-mail");
        usuario.setEmail(scan.nextLine());
        usuario.validarDados(usuario.getEmail(), ".* [.@].*");

        System.out.println("Digite sua senha:");
        usuario.setSenha(scan.nextLine());
        usuario.validarSenha(usuario.getSenha(), ".*[@#$%&*].*");

        System.out.println("Digite seu número de telefone:");
        usuario.setNumeroTelefone(scan.nextLine());
        usuario.validarTelefone(usuario.getNumeroTelefone());

        System.out.println("Digite o seu logradouro:");
        usuario.setLogradouro(scan.nextLine());

        System.out.println("Digite agora o número de sua casa:");
        usuario.setNumeroResidencial(scan.nextInt());

        System.out.println("Digite o complemento, caso não tenha, basta digitar '0' :");
        usuario.setComplemento(scan.nextLine());

        System.out.println("Agora digite o seu CPF:");
        usuario.setDocumento(scan.nextLine());
        usuario.validarDados(usuario.getDocumento());

        // PRODUTO E COMPRA

        System.out.println("Por favor, digite o nome do produto que quer comprar:");
        compra.setProdutoEscolhido(scan.nextLine());
        compra.compararProduto(compra.getProdutoEscolhido(), produto.getNomeProduto());

        System.out.println("Digite agora a quantidade de produtos que você deseja adquirir ");
        compra.setQtdProduto(scan.nextInt());
        produto.validarDadosProduto(produto.getEstoqueProduto(), compra.getQtdProduto());

        System.out.println("O valor de sua compra até o momento é:");
        compra.calcularValor(produto.getValorProduto(), compra.getQtdProduto());
        System.out.println(compra.getValorCompra());

        System.out.println("Agora digite a opção de entrega, sendo: 1 (SEDEX) e 2 (PAC)");
        compra.setFormaDeEnvio(scan.nextInt());
        compra.calcularFrete(compra.getFormaDeEnvio());

        System.out.println("O valor da compra é:" + compra.getValorTotal());

        System.out.println("Agora insira a forma de Pagamento");
        compra.setFormaDePagamento(scan.nextInt());
        compra.calcularValor(compra.getFormaDePagamento());

        scan.close();
    }
}
