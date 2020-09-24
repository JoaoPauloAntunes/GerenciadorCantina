/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu.analise_sist_elab_vinho_e_derivados.elaboracao.recepcao;

import java.io.Serializable;

/**
 *
 * @author joao
 */
public class Fornecedor implements Serializable {
    private String codigo;
    private String razaoSocial;
    private String nome;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String tel;
    private String email;
    private String anotacoes;
    
    public Fornecedor(String codigo, String razaoSocial, String nome, String logradouro, String bairro, String cidade, String estado, String cep, String tel, String email, String anotacoes) {
        this.codigo = codigo;
        this.razaoSocial = razaoSocial;
        this.nome = nome;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.tel = tel;
        this.email = email;
        this.anotacoes = anotacoes;
    }
    
    public String[] getArray() {
        String[] aFornecedor = new String[11];
        aFornecedor[0] = this.codigo;
        aFornecedor[1] = this.razaoSocial;
        aFornecedor[2] = this.nome;
        aFornecedor[3] = this.logradouro;
        aFornecedor[4] = this.bairro;
        aFornecedor[5] = this.cidade;
        aFornecedor[6] = this.estado;
        aFornecedor[7] = this.cep;
        aFornecedor[8] = this.tel;
        aFornecedor[9] = this.email;
        aFornecedor[10] = this.anotacoes;
        
        return aFornecedor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAnotacoes() {
        return anotacoes;
    }

    public void setAnotacoes(String anotacoes) {
        this.anotacoes = anotacoes;
    }
}
