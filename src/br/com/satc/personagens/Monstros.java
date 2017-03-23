/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.personagens;

/**
 *
 * @author Edutec
 */
public abstract class Monstros extends Personagem implements IMonstro{
    
    int drop;
    String descricao;
    int exp;
    int lvl;

    public Monstros(int drop, String descricao, int exp, String nome, int forca, int agilidade, int vitalidade, int inteligencia, int destreza, int sorte, int lvl) {
        super(nome, forca, agilidade, vitalidade, inteligencia, destreza, sorte);
        this.drop = drop;
        this.descricao = descricao;
        this.exp = exp;
        this.lvl = lvl;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }


    public int getDrop() {
        return drop;
    }

    public void setDrop(int drop) {
        this.drop = drop;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
    
    
    
    
}
