
package br.com.satc.Monstro;

import br.com.satc.personagens.Monstros;
import br.com.satc.personagens.Personagem;


public class Harpia extends Monstros{
    

    public Harpia(int drop, String descricao, int exp, String nome, int forca, int agilidade, int vitalidade, int inteligencia, int destreza, int sorte, int lvl) {
        super(drop, descricao, exp, nome, forca, agilidade, vitalidade, inteligencia, destreza, sorte, lvl);
        this.setNome("Harpia");
        this.setLvl(5);
        this.setExp(164);
        this.setForca(6);
        this.setAgilidade(8);
        this.setInteligencia(2);
        this.setDrop(160);
        this.setVitalidade(6);
        this.setDestreza(1);
        this.setDescricao("As Harpias, que significa arrebatadoras, eram criaturas representadas ora como formosas e sedutoras mulheres com longas unhas, ora como terríveis monstros com corpo de ave de rapina, rosto de mulher e seios.");
        this.setSorte(1);
    
    }
    
    
    

    @Override
    public void atacar(Personagem personagem) {
            personagem.receberDano(45);
    }

    @Override
    public void bloquear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AtaquesEspeciais(Personagem personagem) {
        System.out.println("Tufão Cortante");
            personagem.receberDano(100);
            
        
        
    }

    @Override
    public void HabilidadesEspeciais(Personagem personagem) {
        System.out.println("Rasante");
            personagem.receberDano(95);
    }

    
}
