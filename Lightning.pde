int ro=(int)(Math.random()*100)+50;
int sX=ro;
int sY=0;
int sX2=ro;
int sY2=0;
float c=1;
int slend=1;
int addy=1;
void setup()
{
	background(25,25,25);
 	size(300,300);
}
void draw()
{
	while(sY2<260){
		stroke(255,255,255);
		strokeWeight(1);
		line(sX, sY, sX2, sY2);
		ro=(int)(Math.random()*100)+50;
		sX=sX2;
		sY=sY2;
		sX2=ro;
		sX2=ro+(int)(Math.random()*20)-10;
		sY2=sY2+(int)(Math.random()*20)+10;
	}
	c=c+addy;
	if(c>25)
	{
		//little farm
		background(255,255,255);
		
		fill(0,60,0);
		rect(0,250,300,50);
		stroke(0);
		fill(80,0,0);
		rect(240,220,40,40);
		fill(80,80,80);
		triangle(240,220,260,200,280,220);
		rect(255,240,10,20);
		//slender man
		fill(0);
		rect(slend-5.515,85+140,10,20,10);
		fill(75,75,75);
		ellipse(slend,80+140,10,15);
		fill(0);
		rect(slend,103+140,3,16);
		rect(slend-6,103+140,3,16);
		triangle(slend-5,243,slend-4,87+140, slend-11,114+140);
		triangle(slend+5,243,slend+4,87+140, slend+11,114+140);
		

	}
	if(c>45)
	{
		background(25,25,25);
		addy=0;
	}

}
void mousePressed()
{

	slend=(int)(Math.random()*290)+10;
	ro=(int)(Math.random()*100)+50;
	sX=ro;
	sY=0;
	sX2=ro;
	sY2=0;
	c=0;
	addy=1;
	background(25,25,25);
	redraw();
}

