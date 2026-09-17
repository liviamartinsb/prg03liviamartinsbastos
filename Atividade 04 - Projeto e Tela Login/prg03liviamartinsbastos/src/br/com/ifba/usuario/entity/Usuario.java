/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.usuario.entity;
/**
 *
 * @author Lívia Martins Bastos
 */


// Classe que representa o usuário do sistema.
public class Usuario {

    // Nome completo do usuário.
private String nome;

// CPF do usuário.
private String cpf;

// Gênero do usuário.
private String genero;

// Data de nascimento do usuário.
private String dataNascimento;

// Telefone do usuário.
private String telefone;

// E-mail do usuário.
private String email;

// Login utilizado para acessar o sistema.
private String login;

// Senha utilizada para acessar o sistema.
private String senha;

public Usuario(){
    
}

// Construtor que recebe os principais dados do usuário.
public Usuario(String nome, String cpf, String login, String senha) {

    // Armazena o nome recebido no atributo nome.
    this.nome = nome;

    // Armazena o CPF recebido no atributo cpf.
    this.cpf = cpf;

    // Armazena o login recebido no atributo login.
    this.login = login;

    // Armazena a senha recebida no atributo senha.
    this.senha = senha;
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


}
