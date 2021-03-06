/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soldadospatronvisitor.Soldiers;

import soldadospatronvisitor.Weapons.Sword;
import soldadospatronvisitor.Weapons.Weapon;
import patronVisitor.Visitor;

/**
 * @author Antonio Miguel Martel
 */
public class Warrior extends Soldier {

    public Warrior(String name, int health, int posx, int posy) {
        super(name, health, posx, posy, 2);
    }
    
    
    
    
    @Override
    public void equips(Weapon weapon) {
        if(weapon instanceof Sword) {
            if(weapon.isEquippedBy(this)) this.weapon = weapon;
        } else {
            System.out.println("El guerrero solo puede usar un arma para guerreros.");
        }        
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    
    
}
