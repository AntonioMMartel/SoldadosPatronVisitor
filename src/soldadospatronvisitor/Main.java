/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soldadospatronvisitor;

import soldadospatronvisitor.Soldiers.*;
import soldadospatronvisitor.Weapons.*;

/**
 * @author Antonio Miguel Martel
 */
public class Main {


    public static void main(String[] args) {
        
        Soldier guerreroManolo = new Warrior("Manolo", 350, 0, 0);
        Soldier guerreroFederico = new Warrior("Federico", 350, 0, 0);
        guerreroManolo.attacks(guerreroFederico);
        Weapon alabarda1 = new Sword("Alabarda",100);
        guerreroManolo.equips(alabarda1);
        guerreroFederico.equips(alabarda1);
        guerreroManolo.attacks(guerreroFederico);
        guerreroFederico.moveTo(1, 1);
        guerreroManolo.attacks(guerreroFederico);
    }

}
