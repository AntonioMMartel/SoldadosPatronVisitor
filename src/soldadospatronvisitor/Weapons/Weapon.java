/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soldadospatronvisitor.Weapons;

import static java.lang.Math.abs;
import soldadospatronvisitor.Soldiers.Soldier;

/**
 * @author Antonio Miguel Martel
 * Esto deberia ser abstracto y seguramente mas adelante lo tenga que hacer 
 * abstracto.
 * Pero lo necesito ya?
 * No.
 * Y si lo necesito hacer abstracto en un futuro?
 * Le cambio el nombre y poco mas.
 * Aun asi la voy a hacer abstracta por lo mismo de la clase soldier.
 */
public abstract class Weapon {
    String name;
    int range;
    int damage;
    //Solo 1 arma puede ser equipada por un soldado.
    Soldier soldier = null;
    WEAPON_CLASS weapon_class;
            


    public Weapon(String name, int range, int damage, WEAPON_CLASS weapon_class) {
        this.name = name;
        this.range = range;
        this.damage = damage;
        this.weapon_class = weapon_class;
    }
    
    public boolean isEquippedBy(Soldier soldier) {
        if (this.soldier == null) {
            this.soldier = soldier;
            return true;
        }
        System.out.println(soldier.getName() + " no puede equiparse el arma " + 
                this.name + " porque ya ha sido equipada por " + this.soldier.getName());
        return false;
    }
    
    // Clase que me dice si he golpeado
    public void hits(Soldier soldierAttacked) {
        if(this.isInRange(soldierAttacked)){
            soldierAttacked.setHealth(soldierAttacked.getHealth() - damage);
            System.out.println("El soldado " + soldier.getName() + " ha golpeado a " +
                    soldierAttacked.getName() + " inflingiendo " + 
                    (soldierAttacked.getHealth() - damage) + " puntos de salud."
            );
        }  else {
            System.out.println("El soldado " + soldier.getName() + " no esta a rango del soldado " +
                     soldierAttacked.getName());
        }
    }
    
    //Clase si me dice que puedo golpear en cuanto al rango del arma.
    private boolean isInRange(Soldier soldierAttacked) {
        // 2,4 -> 4,4 : vector = 2,2; 4 casillas de rango
        return abs(soldierAttacked.getPosition().getPosx() - this.soldier.getPosition().getPosx()) 
                + abs(soldierAttacked.getPosition().getPosy() - this.soldier.getPosition().getPosy())
                <= this.range;
    }
    
    
    
    
}
