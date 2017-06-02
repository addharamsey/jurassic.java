import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Controller implements ActionListener, MouseListener
{
	View view;
	Model mod;
	Controller(Model m)
	{
		mod = m;
	}

	public void setView(View V){
		view = V;
		view.addMouseListener(this);
	}

	public void actionPerformed(ActionEvent e)
	{
		view.removeButton();
	}
	public void mousePressed(MouseEvent e)
	{
		mod.bird.flap();
	}

	public void mouseReleased(MouseEvent e) {    }
	public void mouseEntered(MouseEvent e) {    }
	public void mouseExited(MouseEvent e) {    }
	public void mouseClicked(MouseEvent e) {    }

	


}
