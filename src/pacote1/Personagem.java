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
public class Personagem {
    protected int HP;
    protected int dano;
    protected int armadura;
    protected String nome;

    public Personagem() {
    }

    public Personagem(int HP, int dano, int armadura) {
        this.HP = HP;
        this.dano = dano;
        this.armadura = armadura;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
