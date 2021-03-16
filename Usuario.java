package com.example.gerenciador;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.sql.Date;
import java.util.Date;

import java.text.spi.DateFormatProvider;


@Entity
public class Usuario {

    @Id
    @Column(name = "id", nubllable=false, unique = true)
    private int id;

    @Column(name = "userName", nullable = false, unique = true)
    private String nomeUsuario;

    @Column(name = "password", nullable = false, unique = false)
    private String senha;

    @Column(name = "Acesso", unique = true)
    @Temporal(TemporalType.DATE)
    private Data ultimoAcesso;

    public String getNomeUsuario(){
        return nomeUsuario;

    }

    public void setNomeUsuario(String nomeUsuario) {

        this.nomeUsuario = nomeUsuario;
    }
    public String getSenha(){
        return senha;

    }

    public void setSenha(String senha) {

        this.senha = senha;
    }

    public Data getUltimoAcesso() {

        return ultimoAcesso;
    }
   public void setUltimoAcesso(Date AultimoAcesso){

        this.ultimoAcesso = ultimoAcesso;
}

}




