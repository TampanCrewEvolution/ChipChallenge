/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chipchallenge.engine.item;

/**
 *
 * @author Jonathan Surya Laksa
 */
public class IntergratedCircuit extends Item{

    public IntergratedCircuit(int locationX, int locationY) {
        super(locationX, locationY);
        this.setVisible(true);
        
    }

    @Override
    public boolean canBeObtained() {
        return false;
    }
    
}
