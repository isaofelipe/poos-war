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
public class Monstro extends Personagem{
    protected int expGive;
    protected int level;

    public Monstro() {
    }

    public Monstro(int expGive) {
        this.expGive = expGive;
    }

    public int getExpGive() {
        return expGive;
    }

    public void setExpGive(int expGive) {
        this.expGive = expGive;
    }
}
