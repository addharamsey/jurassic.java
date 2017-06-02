import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.io.File;
import javax.swing.JButton;
import java.awt.Color;

class View extends JPanel
{
	JButton b1;
	BufferedImage turtle_image;
	Model mod;
	View(Controller c, Model m)
	{
		b1 = new JButton("Never push me");
		b1.addActionListener(c);
		this.add(b1);
		c.setView(this);
		mod = m;
		
	}

	void removeButton(){
		this.remove(b1);
		this.repaint();
	}

	public void paintComponent(Graphics g)
	{
		g.setColor(new Color(128, 255, 255));
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		if(this.mod.bird.counter <= 10){
			g.drawImage(this.mod.bird.Bird2_image, this.mod.bird.x, this.mod.bird.y, null);
		}
		if(this.mod.bird.counter >10){
			g.drawImage(this.mod.bird.Bird1_image, this.mod.bird.x, this.mod.bird.y, null);
		}

		if(this.mod.tube.isUp){
			g.drawImage(this.mod.tube.Tube1_image, this.mod.tube.x, this.mod.tube.y, null);
		}
		if(!this.mod.tube.isUp){
			g.drawImage(this.mod.tube.Tube2_image, this.mod.tube.x, this.mod.tube.y, null);
		}
	}


}
