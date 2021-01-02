/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soldadospatronvisitor.Weapons;

import static soldadospatronvisitor.Weapons.WEAPON_CLASS.ARCHER;

/**
 * @author Antonio Miguel Martel
 */
public class Bow extends Weapon{
    
        public Bow(String name, int damage) {
        // Rango= 1 casilla.
        super(name, 4, damage, WEAPON_CLASS.ARCHER);
    }
    
    
}
