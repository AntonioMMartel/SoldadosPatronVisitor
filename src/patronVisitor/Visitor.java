/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package patronVisitor;

import soldadospatronvisitor.Soldiers.Archer;
import soldadospatronvisitor.Soldiers.Warrior;

/**
 * @author Antonio Miguel Martel
 * Esta interfaz se me amplia cunado añado mas soldados.
 */
public interface Visitor {
    public void visit(Archer archer);
    public void visit(Warrior warrior);
    
}
