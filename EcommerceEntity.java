package ecommerce;

import java.io.Serializable;

public class EcommerceEntity implements Serializable {

    private Usuario usuario;
    private Produto produto;
    private Compra compra;

    public EcommerceEntity() {
    }

    public EcommerceEntity(Usuario usuario, Produto produto, Compra compra) {
        this.usuario = usuario;
        this.produto = produto;
        this.compra = compra;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setEnvio(Compra compra) {
        this.compra = compra;
    };

}