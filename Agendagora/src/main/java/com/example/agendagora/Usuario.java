package com.example.agendagora;

public class Usuario {
    public int codigo;
    public String usuario;
    public String senha;
    public String nome;
    public String endereco;
    public String cpfouCNPJ;
    public String telefone;
    public String Ramodetividade;
    public int qtdvagas;

    public int getQtdvagas() {
        return qtdvagas;
    }

    public void setQtdvagas(int qtdvagas) {
        this.qtdvagas = qtdvagas;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpfouCNPJ() {
        return cpfouCNPJ;
    }

    public void setCpfouCNPJ(String cpfouCNPJ) {
        this.cpfouCNPJ = cpfouCNPJ;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRamodetividade() {
        return Ramodetividade;
    }

    public void setRamodetividade(String ramodetividade) {
        Ramodetividade = ramodetividade;
    }

    public Usuario(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }


}

