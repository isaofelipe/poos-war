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
class Guerreiro extends Heroi{
    private int rage = 100;

    public Guerreiro() {
    }

    public Guerreiro(int rage) {
        this.rage = rage;
    }

    public int getRage() {
        return rage;
    }

    public void setRage(int rage) {
        this.rage = rage;
    }
    
}
