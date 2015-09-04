import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

int r=(int)(Math.random()*100)+50;
int sX=r;
int sY=0;
int sX2=r;
int sY2=0;
float c=1;
float c2=1;
int slend=1;

public void setup()
{
	background(25,25,25);
 	size(300,300);
}
public void draw()
{

		
	while(sY2<270){
		stroke(255,255,255);
		strokeWeight(1);
		line(sX, sY, sX2, sY2);
		r=(int)(Math.random()*100)+50;
		sX=sX2;
		sY=sY2;
		sX2=r;
		sX2=r+(int)(Math.random()*20)-10;
		sY2=sY2+(int)(Math.random()*20)+10;		
	};
	c=c+1;
	c2=c2+1;
	if(c>5)
	{
		//little farm
		background(255,255,255);
		fill(0,60,0);
		rect(0,250,300,50);
		stroke(0);
		fill(80,0,0);
		rect(240,240,20,20);
		fill(80,80,80);
		triangle(240,240,250,230,260,240);
		//slender man
		fill(0);
		rect(slend-5.515f,85+140,10,20,10);
		fill(75,75,75);
		ellipse(slend,80+140,10,15);
		fill(0);
		rect(slend,103+140,3,16);
		rect(slend-6,103+140,3,16);
		triangle(slend-5,243,slend-4,87+140, slend-11,114+140);
		triangle(slend+5,243,slend+4,87+140, slend+11,114+140);
		

	}
	if(c2>12)
	{
		background(25,25,25);
	}
	if(c2>100)
	{
		mousePressed();     
	}

}
public void mousePressed()
{
	slend=(int)(Math.random()*290)+10;
	r=(int)(Math.random()*100)+50;
	sX=r;
	sY=0;
	sX2=r;
	sY2=0;
	redraw();
	background(25,25,25);
	c=0;
	c2=0;
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
