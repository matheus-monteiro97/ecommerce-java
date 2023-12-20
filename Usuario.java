package ecommerce;

import java.util.regex.Pattern;

public class Usuario {

    private String nome;
    private String documento;
    private String email;
    private String senha;
    private String numeroTelefone;
    private String logradouro;
    private int numeroResidencial;
    private String complemento;

    // Verificar se o nome é maior do que a quantidade de caracteres permitidos.
    public void validarDados(String textoNome, int tamanho) {
        if (textoNome.length() > tamanho) {
            System.out.println("Nome inválido, por favor, digite novamente");
        }
    }

    // Verificar se o documento possui apenas números, é igual a 11 e inicia-se com
    // 0 ou 1.
    public void validarDados(String textoDocumento) {
        if (textoDocumento.matches("\\d+") && textoDocumento.length() == 11) {
            if (textoDocumento.startsWith("0") || textoDocumento.startsWith("1")) {
                System.out.println("Documento válido, pode prosseguir");
            }
        } else {
            System.out.println("Documento inválido, por favor, digite novamente");
        }
    }

    // Verificar se o e-mail possui os caracteres especiais (.) (@)
    public void validarDados(String textoEmail, String caracteresEspeciais) {

        if (Pattern.matches(textoEmail, caracteresEspeciais)) {
            System.out.println("Email válido, pode prosseguir");
        } else {
            System.out.println("Email inválido, por favor, digite novamente");
        }
    }

    // Verificar se a senha possui caracteres especiais e algum número.
    public void validarSenha(String textoSenha, String caracteresEspeciais) {
        caracteresEspeciais = ".*[@#$%&*].*";

        if (Pattern.matches(textoSenha, caracteresEspeciais) && textoSenha.matches(".*\\d.*")) {
            System.out.println("Senha válida, pode prosseguir");
        } else {
            System.out.println("Senha inválida, por favor, digite novamente");
        }
    }

    // Verificar se o telefone possui apenas números e também 11 caracteres:
    // (00) 0.0000-0000
    public void validarTelefone(String textoTelefone) {
        if (textoTelefone.matches("\\d+") && textoTelefone.length() == 11) {
            System.out.println("Número válido, pode prosseguir");
        } else {
            System.out.println("Número inválido, por favor, digite novamente");
        }
    }

    public Usuario() {
    }

    public Usuario(String nome, String email, String senha, String numeroTelefone,
            String logradouro, int numeroResidencial, String complemento, String documento) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.numeroTelefone = numeroTelefone;
        this.logradouro = logradouro;
        this.numeroResidencial = numeroResidencial;
        this.complemento = complemento;
        this.documento = documento;
    }

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    };

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumeroResidencial() {
        return numeroResidencial;
    }

    public void setNumeroResidencial(int numeroResidencial) {
        this.numeroResidencial = numeroResidencial;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

}