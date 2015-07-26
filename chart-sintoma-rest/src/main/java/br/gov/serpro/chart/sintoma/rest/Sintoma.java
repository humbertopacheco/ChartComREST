/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.serpro.chart.sintoma.rest;

/**
 *
 * @author Humberto
 */
public class Sintoma {

    private String nome;
    private int qtdeCasosJaneiro;
    private int qtdeCasosFevereiro;
    private int qtdeCasosMarco;
    private int qtdeCasosAbril;
    private int qtdeCasosMaio;
    private int qtdeCasosJunho;

    public Sintoma() {

    }

    public Sintoma(String nome, int qtdeCasosJaneiro, int qtdeCasosFevereiro, int qtdeCasosMarco, int qtdeCasosAbril, int qtdeCasosMaio, int qtdeCasosJunho) {
        this.nome = nome;
        this.qtdeCasosJaneiro = qtdeCasosJaneiro;
        this.qtdeCasosFevereiro = qtdeCasosFevereiro;
        this.qtdeCasosMarco = qtdeCasosMarco;
        this.qtdeCasosAbril = qtdeCasosAbril;
        this.qtdeCasosMaio = qtdeCasosMaio;
        this.qtdeCasosJunho = qtdeCasosJunho;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder(0);
        sb.append("Nome : ").append(this.getNome()).append("\n");

        return sb.toString();
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the qtdeCasosJaneiro
     */
    public int getQtdeCasosJaneiro() {
        return qtdeCasosJaneiro;
    }

    /**
     * @param qtdeCasosJaneiro the qtdeCasosJaneiro to set
     */
    public void setQtdeCasosJaneiro(int qtdeCasosJaneiro) {
        this.qtdeCasosJaneiro = qtdeCasosJaneiro;
    }

    /**
     * @return the qtdeCasosFevereiro
     */
    public int getQtdeCasosFevereiro() {
        return qtdeCasosFevereiro;
    }

    /**
     * @param qtdeCasosFevereiro the qtdeCasosFevereiro to set
     */
    public void setQtdeCasosFevereiro(int qtdeCasosFevereiro) {
        this.qtdeCasosFevereiro = qtdeCasosFevereiro;
    }

    /**
     * @return the qtdeCasosMarco
     */
    public int getQtdeCasosMarco() {
        return qtdeCasosMarco;
    }

    /**
     * @param qtdeCasosMarco the qtdeCasosMarco to set
     */
    public void setQtdeCasosMarco(int qtdeCasosMarco) {
        this.qtdeCasosMarco = qtdeCasosMarco;
    }

    /**
     * @return the qtdeCasosAbril
     */
    public int getQtdeCasosAbril() {
        return qtdeCasosAbril;
    }

    /**
     * @param qtdeCasosAbril the qtdeCasosAbril to set
     */
    public void setQtdeCasosAbril(int qtdeCasosAbril) {
        this.qtdeCasosAbril = qtdeCasosAbril;
    }

    /**
     * @return the qtdeCasosMaio
     */
    public int getQtdeCasosMaio() {
        return qtdeCasosMaio;
    }

    /**
     * @param qtdeCasosMaio the qtdeCasosMaio to set
     */
    public void setQtdeCasosMaio(int qtdeCasosMaio) {
        this.qtdeCasosMaio = qtdeCasosMaio;
    }

    /**
     * @return the qtdeCasosJunho
     */
    public int getQtdeCasosJunho() {
        return qtdeCasosJunho;
    }

    /**
     * @param qtdeCasosJunho the qtdeCasosJunho to set
     */
    public void setQtdeCasosJunho(int qtdeCasosJunho) {
        this.qtdeCasosJunho = qtdeCasosJunho;
    }

}
