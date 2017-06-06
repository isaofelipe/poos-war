/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote1;

/**
 *
 * @author Isao Felipe Morigaki
 */
class Heroi extends Personagem{
    protected int level;
    protected int exp;
    protected Bolsa bolsa;

    public Heroi() {
        this.HP = 100;
        this.armadura = 0;
        this.dano = 10;
        this.nome = "Heroi";
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
    
    
}
