package com.example.e_recycle;

public class Coletor_Cad {
    String codregiao, nome, email, telefone, cpf;

    public Coletor_Cad() {
    }

    public Coletor_Cad(String codregiao, String nome, String email, String telefone, String cpf) {
        this.codregiao = codregiao;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public String getCodregiao() {
        return codregiao;
    }

    public void setCodregiao(String codregiao) {
        this.codregiao = codregiao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
