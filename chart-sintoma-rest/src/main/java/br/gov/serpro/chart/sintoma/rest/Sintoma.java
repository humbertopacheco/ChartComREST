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

    private String name;
    private int computerMark;
    private int mathematicsMark;
    private int geographyMark;
    private int historyMark;
    private int litratureMark;

    public Sintoma() {

    }

    public Sintoma(String name, int computerMark, int mathematicsMark, int geographyMark, int historyMark, int litratureMark) {
        this.name = name;
        this.computerMark = computerMark;
        this.mathematicsMark = mathematicsMark;
        this.geographyMark = geographyMark;
        this.historyMark = historyMark;
        this.litratureMark = litratureMark;
    }

    public int getLitratureMark() {
        return litratureMark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setComputerMark(int i) {
        this.computerMark = i;
    }

    public void setMathematicsMark(int i) {
        this.mathematicsMark = i;
    }

    public void setGeographyMark(int i) {
        this.geographyMark = i;
    }

    public void setHistoryMark(int i) {
        this.historyMark = i;
    }

    public void setLitratureMark(int i) {
        this.litratureMark = i;
    }

    public int getComputerMark() {
        return computerMark;
    }

    public int getGeographyMark() {
        return geographyMark;
    }

    public int getHistoryMark() {
        return historyMark;
    }

    public int getMathematicsMark() {
        return mathematicsMark;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return new StringBuffer(" First Name : ").append(this.name)
                .append(" Last Name : ").append(this.computerMark)
                .append(" Age : ").append(this.geographyMark).append(" ID : ")
                .append(this.litratureMark).toString();
    }

}
