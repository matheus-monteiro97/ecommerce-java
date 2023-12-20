package ecommerce;

public class Compra {

    // formaDePagamento: 1 - BOLETO, 2 - PIX e 3- Cartão de crédito
    // formaDeEnvio: 1 - Sedex e 2 - PAC
    private String produtoEscolhido;
    private int formaDePagamento;
    private int formaDeEnvio;
    private int qtdProduto;
    private double valorFrete;
    private double valorCompra;
    private double valorTotal;

    // Calcular o valor total sem o frete, apenas observando o valor e a quantidade
    // do produto
    public void calcularValor(double valorProduto, int qtdProduto) {
        this.valorCompra = valorProduto * qtdProduto;
    }

    // Comparar nome de produto escolhido, com nome de produto da loja.
    public void compararProduto(String produtoLoja, String produtoEscolhido) {
        if (produtoLoja.equals(produtoEscolhido)) {
            System.out.println("Prossiga com a compra");
        } else {
            System.out.println("Produto não encontrado");
        }
    }

    // Calcular o valor do frete baseado no tipo de entrega solicitada.
    public void calcularFrete(int valorFrete) {
        if (valorFrete == 1) {
            this.valorFrete = this.valorCompra * 0.3;
            System.out.println("Entrega em 4 dias úteis");
        } else if (valorFrete == 2) {
            this.valorFrete = this.valorCompra * 0.15;
            System.out.println("Entrega em 10 dias úteis");
        } else {
            System.out.println("Opção de envio inválida");
        }

    }

    // Calcular o valor total da compra com o frete incluso.
    public void calcularValor(double valorCompra, double valorFrete) {
        this.valorTotal = valorCompra + valorFrete;
    }

    // Verificar a forma de pagamento e se ela é compatível com o valor.
    public void calcularValor(int formaDePagamento) {
        if (this.valorTotal < 100) {
            switch (formaDePagamento) {
                case 1:
                    System.out.println("Pode prosseguir");
                    break;
                case 2:
                    System.out.println("Pode prosseguir");
                    break;
                case 3:
                    System.out.println("Cartão de crédito somente em compras acima de 100 reais");
                    break;
                default:
                    System.out.println("Forma de pagamento inválida, por favor, digite novamente");

            }
        }
    }

    public Compra() {
    }

    public Compra(String produtoEscolhido, int formaDePagamento, int formaDeEnvio, int qtdProduto, double valorFrete,
            double valorCompra, double valorTotal) {
        this.produtoEscolhido = produtoEscolhido;
        this.formaDePagamento = formaDePagamento;
        this.formaDeEnvio = formaDeEnvio;
        this.qtdProduto = qtdProduto;
        this.valorFrete = valorFrete;
        this.valorCompra = valorCompra;
        this.valorTotal = valorTotal;
    }

    public String getProdutoEscolhido() {
        return produtoEscolhido;
    }

    public void setProdutoEscolhido(String produtoEscolhido) {
        this.produtoEscolhido = produtoEscolhido;
    }

    public int getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(int formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public int getFormaDeEnvio() {
        return formaDeEnvio;
    }

    public void setFormaDeEnvio(int formaDeEnvio) {
        this.formaDeEnvio = formaDeEnvio;
    }

    public int getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public double getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(double valorFrete) {
        this.valorFrete = valorFrete;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

}