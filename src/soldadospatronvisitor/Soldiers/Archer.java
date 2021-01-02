/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soldadospatronvisitor.Soldiers;


import patronVisitor.MovementMechanics;
import soldadospatronvisitor.Weapons.Bow;
import soldadospatronvisitor.Weapons.Weapon;

/**
 * @author Antonio Miguel Martel
 */
public class Archer extends Soldier {
    
     public Archer(String name, int health, int posx, int posy) {
        super(name, health, posx, posy, 6);
    }

    
    @Override
    public void equips(Weapon weapon) {
        if(weapon instanceof Bow) {
            if(weapon.isEquippedBy(this)) this.weapon = weapon;
        } else {
            System.out.println("El arquero solo puede usar un arma para arqueros.");
        }        
    }

    @Override
    public void patrol(int posx1, int posy1, int posx2, int posy2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void applyMovementMechanics(MovementMechanics movementMechanics) {
        movementMechanics.applyMovement(this);
    }
    
    
}
