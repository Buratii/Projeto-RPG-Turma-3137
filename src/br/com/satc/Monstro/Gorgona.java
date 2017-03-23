
package br.com.satc.Monstro;

import br.com.satc.personagens.Monstros;
import br.com.satc.personagens.Personagem;


public class Gorgona extends Monstros {

    public Gorgona(int drop, String descricao, int exp, String nome, int forca, int agilidade, int vitalidade, int inteligencia, int destreza, int sorte, int lvl) {
        super(drop, descricao, exp, nome, forca, agilidade, vitalidade, inteligencia, destreza, sorte, lvl);
        this.setNome("Gorgona");
        this.setLvl(13);
        this.setExp(11143);
        this.setForca(2);
        this.setAgilidade(2);
        this.setInteligencia(8);
        this.setDrop(315);
        this.setVitalidade(7);
        this.setDestreza(1);
        this.setDescricao("Considerada um monstro, esta mulher tinha na cabeça, no lugar de seus cabelos, serpentes.");
        this.setSorte(4);

    }
    

    @Override
    public void atacar(Personagem personagem) {
            personagem.receberDano(35);
    }

    @Override
    public void bloquear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void AtaquesEspeciais(Personagem personagem) {
        System.out.println("Gorgona usa Petrificar");
            personagem.receberDano(140);
    }

    @Override
    public void HabilidadesEspeciais(Personagem personagem) {
        System.out.println("Presas Venenosas");
            personagem.receberDano(130);
    }
    
}
