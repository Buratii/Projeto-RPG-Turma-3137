package br.com.satc.Monstro;

import br.com.satc.personagens.Monstros;
import br.com.satc.personagens.Personagem;


public class Aparicao extends Monstros {

    public Aparicao(int drop, String descricao, int exp, String nome, int forca, int agilidade, int vitalidade, int inteligencia, int destreza, int sorte, int lvl) {
        super(drop, descricao, exp, nome, forca, agilidade, vitalidade, inteligencia, destreza, sorte, lvl);
    
        this.setNome("Espectro");
        this.setLvl(12);
        this.setExp(3883);
        this.setForca(1);
        this.setAgilidade(4);
        this.setInteligencia(5);
        this.setDrop(315);
        this.setVitalidade(7);
        this.setDestreza(2);
        this.setDescricao("Aparições são espíritos malignos designados para matar humanos que não fazem o bem. ");
        this.setSorte(2);
    
    }

    @Override
    public void atacar(Personagem personagem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void bloquear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AtaquesEspeciais(Personagem personagem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void HabilidadesEspeciais(Personagem personagem) {
        System.out.println("Aura Especral");
            personagem.receberDano(130);
    }
    
    
    
}
