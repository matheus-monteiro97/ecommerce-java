package ecommerce;

import java.util.List;
import java.util.ArrayList;

public class Repository {

    private List<Produto> produtoList = new ArrayList<>();

    public void salvarProduto(Produto produto) {
        produtoList.add(produto);
    }

    public Produto buscarProduto(int index) {
        return produtoList.get(index);
    }

    public List<Produto> buscarTodosProdutos() {
        return produtoList;
    }

    public void deletarProduto(int index) {
        produtoList.remove(index);
        System.out.println("Dados apagados");
    }

    public void atualizarProduto(Produto produto, int index) {
        produtoList.get(index);
    }

    private List<Usuario> usuarioList = new ArrayList<>();

    public void salvarUsuario(Usuario usuario) {
        usuarioList.add(usuario);
    }

    public Usuario buscarUsuario(int index) {
        return usuarioList.get(index);
    }

    public List<Usuario> buscarTodosUsuarios() {
        return usuarioList;
    }

    public void deletarUsuario(int index) {
        usuarioList.remove(index);
        System.out.println("Dados apagados");
    }

    public void atualizarUsuario(Usuario usuario, int index) {
        produtoList.get(index);
    }

    private List<Compra> compraList = new ArrayList<>();

    public void salvarCompra(Compra compra) {
        compraList.add(compra);
    }

    public Compra buscarCompra(int index) {
        return compraList.get(index);
    }

    public List<Compra> buscarTodasCompras() {
        return compraList;
    }

    public void deletarCompra(int index) {
        compraList.remove(index);
        System.out.println("Dados apagados");
    }

    public void atualizarCompra(Compra compra, int index) {
        compraList.get(index);
    }
}
