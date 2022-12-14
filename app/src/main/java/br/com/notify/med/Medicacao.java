package br.com.notify.med;

import java.io.Serializable;

public class Medicacao implements Serializable {
    /*Declaração de Variaveis*/
    private String nome; // Ex: Amoxicillina
    private String tipo; // Ex: Antibiótico
    private String quantidade; // Ex: 1 comprimido
    private String horario; // Ex: A cada 12hs
    private String duracao; // Ex: 14 dias

    // Método Construtor Vazio
    public Medicacao () { }

    // Método Construtor
    public Medicacao(String nome, String tipo, String quantidade, String horario, String duracao) {
        this.nome = nome;
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.horario = horario;
        this.duracao = duracao;
    }

    /* Métodos Get e SET*/

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
}
