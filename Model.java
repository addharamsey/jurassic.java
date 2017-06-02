



class Model{

	
	int dest_x;
	int dest_y;
	Bird bird;
	Tube tube;

	Model()
	{
		 bird = new Bird();
		 tube = new Tube();
	}

	public void update()
	{
		bird.update();
		tube.update();
		if(doesCollide(bird, tube)){
			System.out.println("HIT");
		}
		
	}

	public void setDestination(int x, int y)
	{
		this.dest_x = x;
		this.dest_y = y;
	}

	boolean doesCollide(Bird b, Tube t){
		if((b.x  < (t.x + t.width())) &&
            ((b.x + b.width()) > t.x) &&
            (b.y < (t.y + t.height())) &&
            ((b.y + b.height()) > t.y) ){
            return true;}
        return false;
	}


}