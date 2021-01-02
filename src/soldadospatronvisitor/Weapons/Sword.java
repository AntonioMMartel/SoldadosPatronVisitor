/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soldadospatronvisitor.Weapons;

import soldadospatronvisitor.Soldiers.Soldier;

/**
 * @author Antonio Miguel Martel
 */
public class Sword extends Weapon{

    public Sword(String name, int damage, WEAPON_CLASS wep_class) {
        // Rango= 1 casilla.
        super(name, 1, damage, wep_class);
    }
    
    
}
