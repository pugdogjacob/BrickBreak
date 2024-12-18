import java.awt.*;

public class Ball {
	//your code here!
	
	//don't forget you need instance variables:
	private int Xpos;
	private int Ypos;
	private int size;
	private int XVelocity;
	private int YVelocity;
	private int velocity;



	
	
	//constructor(s):
	public Ball(int Xpos, int Ypos, int size){
		this.Xpos= Xpos;
		this.Ypos=Ypos;
		this.size=size;
	}

	

	//methods:
	public int getXpos(){
		return Xpos;
	}
	public int getYpos(){
		return Ypos;
	}
	public int getSize(){
		return size; 
	}
	public void move(){
		Xpos += XVelocity;
		Ypos += YVelocity;
	}
	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}
	public void reverseX (){
		XVelocity= XVelocity*-1;
	}
	public void  reverseY (){
		YVelocity=YVelocity*-1;
	}
	public void setX(int settedX){
		Xpos=settedX;
	}
	public void setY(int settedy){
		Ypos=settedy;
	}
	public void draw(Graphics g){
		g.setColor(Color.WHITE);
		g.fillOval(Xpos,Ypos,size,size);
	}
	public void setXVelocity(int setted){
		XVelocity=setted;
	}	
	public void setYVelocity(int setted2){
		YVelocity=setted2;
	}
	public int getVelocity(){
		return velocity;
	}

	}

