package ecommerce;

public class Produto  {

    private String nomeProduto;
    private double valorProduto;
    private int estoqueProduto;

    // Verificar a quantidade de produtos no estoque.
    public void validarDadosProduto(int estoque) {
        if (estoque == 0) {
            System.out.println("Infelizmente este produto está esgotado.");
        }
    }

    public void validarDadosProduto(int estoqueProduto, int qtdProduto) {
        if (estoqueProduto < qtdProduto) {
            System.out.println("Número maior do que temos em nosso estoque");
        } else {
            System.out.println("Prossiga com a compra");
        }
    }

    public Produto() {
    }

    public Produto(String nomeProduto, double valorProduto, int estoqueProduto) {
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
        this.estoqueProduto = estoqueProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public int getEstoqueProduto() {
        return estoqueProduto;
    }

    public void setEstoqueProduto(int estoqueProduto) {
        this.estoqueProduto = estoqueProduto;
    }

}