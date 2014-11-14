/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chipchallenge.engine.obstacle.staticObs;

import chipchallenge.engine.Chip;
import chipchallenge.engine.obstacle.Obstacle;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 *
 * @author Jonathan Surya Laksa
 */
public class Barrier extends Obstacle{
    private Chip identifyChip;

    public Barrier(int locationX, int locationY, Chip newChip) {
        super(locationX, locationY);
        URL imgBarrierURL = getClass().getClassLoader().getResource("images/barrier.png");
        if (imgBarrierURL == null) {
            System.err.println("Couldn't find file: " + "images/barrier.png");
        } else {
            try {
                img = ImageIO.read(imgBarrierURL);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        identifyChip = newChip;
    }

    

    @Override
    public boolean isVisible() {
        if(identifyChip.getChipRemain()==0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    @Override
    public boolean passAllow() {
        if(this.isVisible())
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    @Override
    public boolean killAllow() {
        return false;
    }

    @Override
    public boolean pushAllow() {
        return false;
    }
    
}
