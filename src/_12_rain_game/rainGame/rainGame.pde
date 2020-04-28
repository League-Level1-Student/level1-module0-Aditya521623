  int y= 75;
  int x = 75;
  
  
void setup(){
  size(500,500);

}


void draw(){

    background(100, 130, 0);
    fill(0, 0, 255);
    stroke(0,0 , 255);
    ellipse(x, y, 30, 30);
    y+=7;
    fill(0,0,0);
       rect(mouseX,425,50,50);
       
     
if(y>=height){
y=75;
x = (int) random(500);
fill(255,255,255);

    
}
}
