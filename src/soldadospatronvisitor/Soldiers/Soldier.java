/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soldadospatronvisitor.Soldiers;

import static java.lang.Math.abs;
import soldadospatronvisitor.Weapons.Weapon;
import patronVisitor.Visitor;

/**
 * @author Antonio Miguel Martel
 * Pq una clse abstracta y no una interfaz?
 * Los soldados van a ser diferentes a esto?
 * Hay soldados sin health ni name ni posiciones?
 * Me da que no crack.
 * Una interfaz aqui me complicaria la implementacion.
 * Aun asi puedo combinar clases abstractas e interfaces.
 * Por ejemplo: Arquero_de_fuego implements Archer extends Soldier{}
 */
public abstract class Soldier {
    protected String name, status;
    protected int health;
    protected final Position position;
    protected final int maxMovementTiles;
    protected Weapon weapon = null;

    public Soldier(String name, int health, int posx, int posy, int maxMovementTiles) {
        this.name = name;
        this.health = health;
        this.position = new Position(posx, posy);
        this.maxMovementTiles = maxMovementTiles;
    }
    
    
    //Cada uno equipa un arma determinada
    public abstract void equips(Weapon weapon);
    
    // Teletransportar al soldado a unas coordenadas aleatorias.
    //empleando el patron visitor. SE IMPLEMENTA A NIVEL DEL MAIN
    //Aplicamos visitor
    public abstract void accept(Visitor visitor);
    
    //Mover a una posicion
    public void moveTo(int posx, int posy) {
        if (this.canMove(posx, posy)) {
            this.position.setPosx(posx);
            this.position.setPosy(posy);
            System.out.println("El soldado " + this.name + " se mueve a la posicion: "
                    + "(" + posx + ", " + posy + ")");
        } else {
            System.out.println("No se ha podido mover el soldado a la posicion: "
                    + "(" + posx + ", " + posy + ")");
        }
    }
    
    //Clase que me dice si me puedo mover a la posicion especificada.
    private boolean canMove(int posx, int posy ) {
        // 2,4 -> 4,4 : vector = 2,2; 4 casillas movidas
        //Miramos cuantas casilla se movera el soldado. Si son mas
        //que el limite no se moverá.
        return abs(posx - this.position.getPosx()) + abs(posy - this.position.getPosy()) <= this.maxMovementTiles;
    }
    
    public void attacks(Soldier soldier) {
        
        if (weapon != null) {
            weapon.hits(soldier);
        } else {
            
            System.out.println(this.getName() + " no tiene arma y no puede golpear"
                    + " al soldado " + soldier.getName() );
        }
    }

    
    //Getters y setters
    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    
    
    
    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public int getHealth() {
        return health;
    }

    public Weapon getWeapon() {
        return weapon;
    }
    
    
    public Position getPosition() {
        return position;
    }

    
    
    
    
    
    
    
    
    
}
