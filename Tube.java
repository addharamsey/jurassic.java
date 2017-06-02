import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.io.File;
import javax.swing.JButton;
import java.awt.Color;
import java.util.Random;


class Tube{
	BufferedImage Tube1_image;
	BufferedImage Tube2_image;
	Random rand;
	boolean isUp;
	int x;
	int y;
	Tube(){
		rand = new Random();
		isUp = rand.nextBoolean();
		x = rand.nextInt(400) + 200;
			if(isUp) //chose y coridinate based on direction
                y = rand.nextInt(400) +100 ; 
            if(!isUp)
                y = rand.nextInt(400) -400;



		try
		{
			this.Tube1_image =
				ImageIO.read(new File("tube_up.png"));
			this.Tube2_image =
				ImageIO.read(new File("tube_down.png"));
		} catch(Exception e) {
			e.printStackTrace(System.err);
			System.exit(1);
		}
	}

	boolean update(){
		x += -12;
		if(x <= -50){
			x = rand.nextInt(500) + 400;
			isUp = rand.nextBoolean();
			if(isUp) //chose y coridinate based on direction
                y = rand.nextInt(400) +100 ; 
            if(!isUp)
                y = rand.nextInt(400) -400;
		}
		return false;

	}

	int height(){
     
        return Tube1_image.getHeight(null);
    }
    int width(){
       
        return Tube1_image.getWidth(null);
    }


}