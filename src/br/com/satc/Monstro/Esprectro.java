
package br.com.satc.Monstro;

import br.com.satc.personagens.Monstros;
import br.com.satc.personagens.Personagem;


public class Esprectro extends Monstros {

    public Esprectro(int drop, String descricao, int exp, String nome, int forca, int agilidade, int vitalidade, int inteligencia, int destreza, int sorte, int lvl) {
        
        super(drop, descricao, exp, nome, forca, agilidade, vitalidade, inteligencia, destreza, sorte, lvl);
        this.setNome("Espectro");
        this.setLvl(11);
        this.setExp(3883);
        this.setForca(1);
        this.setAgilidade(4);
        this.setInteligencia(4);
        this.setDrop(315);
        this.setVitalidade(7);
        this.setDestreza(1);
        this.setDescricao("Espectros são humanóides fantasmas, espíritos de seres que não terminaram seus objetivos em terra e, por magia negra, ressurgiram em forma de espectros.");
        this.setSorte(2);
        
    }

    @Override
    public void atacar(Personagem personagem) {
        personagem.receberDano(130);
        
    }

    @Override
    public void bloquear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AtaquesEspeciais(Personagem personagem) {
        System.out.println("Aura Especral");
            personagem.receberDano(130);
    }

    @Override
    public void HabilidadesEspeciais(Personagem personagem) {
        System.out.println("Barragem Espectral");
            personagem.receberDano(115);
        
    }
    
    
    
}
