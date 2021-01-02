/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package patronVisitor;

import java.util.Random;
import soldadospatronvisitor.Soldiers.Archer;
import soldadospatronvisitor.Soldiers.Warrior;

/**
 * @author Antonio Miguel Martel
 */
public class RandomTeleportVisitor implements Visitor {
    
    int factor;

    public RandomTeleportVisitor(int factor) {
        this.factor = factor;
    }
    
    
    @Override
    public void visit(Archer archer) {
        int newx = new Random().nextInt( (10 - 1 + 1) + 1) * factor;
        int newy = new Random().nextInt( (10 - 1 + 1) + 1) * factor;
        archer.getPosition().setPosx(newx);
        archer.getPosition().setPosy(newy);
        System.out.println("El solado " + archer.getName() + " ha sido teletransportado"
                + " en la posicion (" + newx + ", " + newy + ")");
    }

    @Override
    public void visit(Warrior warrior) {
        int newx = new Random().nextInt( (5 - 1 + 1) + 1) * factor;
        int newy = new Random().nextInt( (5 - 1 + 1) + 1) * factor;
        warrior.getPosition().setPosx(newx);
        warrior.getPosition().setPosy(newy);
        System.out.println("El solado " + warrior.getName() + " ha sido teletransportado"
                + " en la posicion (" + newx + ", " + newy + ")");
    }
    
    
    
}
