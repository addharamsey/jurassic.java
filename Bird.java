
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.io.File;
import javax.swing.JButton;
import java.awt.Color;
class Bird{
	BufferedImage Bird1_image;
	BufferedImage Bird2_image;
	int x;
	int y;
	double v;
	int eCounter;
	int counter;
	boolean dead;
	int energy;
	Bird(){
		x = 20;
        y = 10;      
        v = 0;
        energy = 90;
        //tubeCount = 0;
        counter = 15;
        dead = false;
        eCounter = 0;

		try
		{
			this.Bird1_image =
				ImageIO.read(new File("bird1.png"));
			this.Bird2_image =
				ImageIO.read(new File("bird2.png"));
		} catch(Exception e) {
			e.printStackTrace(System.err);
			System.exit(1);
		}
	}

	boolean update(){
		
		 eCounter++;
		counter++;
                
               
                if(dead == false){
                    v+= 1.2;
                    y +=(int) v;
                }
                if(this.y > 395){
                    energy -= 10;
                }
                 
                
                if(energy < 90){
                    if(eCounter > 10){
                        energy++;
                    }
                }
                return false;
	}

	void flap(){
		v -=10;
		counter = 0;
	}


	int height(){
       if(counter <= 10){
           //System.out.println(" ");
           //System.out.println(bird1_image.getHeight(null));
           return Bird2_image.getHeight(null);}
    
         return Bird1_image.getHeight(null);
    }
    int width(){
      if(counter <= 10){
         // System.out.println(bird1_image.getWidth(null));
          return Bird2_image.getWidth(null);}
 
        return Bird1_image.getWidth(null);
    }
}