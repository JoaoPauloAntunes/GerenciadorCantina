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
    private String cep;
    private String logradouro;
    private String numero;
    private String estado;
    private String cidade;
    private String bairro;
    private String complemento;
    private String tel;
    private String email;
    private String anotacoes;
    
    public Fornecedor(String codigo, String razaoSocial, String nome, String cep, String logradouro, String numero, String estado, String cidade, String bairro, String complemento, String tel, String email, String anotacoes) {
        this.codigo = codigo;
        this.razaoSocial = razaoSocial;
        this.nome = nome;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.complemento = complemento;
        this.tel = tel;
        this.email = email;
        this.anotacoes = anotacoes;
    }
    
    public String[] getArray() {
        String[] aFornecedor = new String[13];
        aFornecedor[0] = this.codigo;
        aFornecedor[1] = this.razaoSocial;
        aFornecedor[2] = this.nome;
        aFornecedor[3] = this.cep;
        aFornecedor[4] = this.logradouro;
        aFornecedor[5] = this.numero;
        aFornecedor[6] = this.estado;
        aFornecedor[7] = this.cidade;
        aFornecedor[8] = this.bairro;
        aFornecedor[9] = this.complemento;
        aFornecedor[10] = this.tel;
        aFornecedor[11] = this.email;
        aFornecedor[12] = this.anotacoes;
        
        return aFornecedor;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
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
