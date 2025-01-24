//Brian Mouyard 12/7/25
//this makes getters and setters for the paddlle
import java.awt.*;

public class Paddle {

	//your code here!
	
	//don't forget you need instance variables:
	private int Xpos;
	private int Ypos;
	private int Velocity;
	private int height;
	private int width;

	//constructor(s):
	public Paddle(int Xpos, int Ypos, int width, int height){
		this.Xpos= Xpos;
		this.Ypos=Ypos;
		this.width=width;
		this.height=height;
	}

	//methods:
	public int getXpos(){
		return Xpos;
	}
	public int getYpos(){
		return Ypos;
	}
	public void move(){
		Xpos += Velocity;
		if(Xpos<0)
		{
			Xpos=0;
			Velocity=0;
		}
		else if(Xpos+width>682){
			Xpos=682-width;
			Velocity=0;
		}

	}
	public int getHeight(){
		return height;
	}
	public int getWidth(){
		return width;
	}
	public void addVelocity(int incSpeed){
		if((Velocity<=6)&&(Velocity>=-6)){
			Velocity+=incSpeed/2;
		}	
	}
	public int getVelocity(){
		return Velocity;
	}
	public void setVelocity(int newVelocity){
		Velocity=newVelocity;
	}
	public int getX(){
		return Xpos;
	}
	public int getY(){
		return Ypos;
	}
	public void setX(int newX){
		Xpos=newX;
	}
	public void draw(Graphics g){
		g.setColor(Color.WHITE);	
		g.drawRect(Xpos, Ypos, width, height);
	}
}
