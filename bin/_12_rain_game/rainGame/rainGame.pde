  int y= 75;
  int x = 75;
  int score =0;
  
  
void setup(){
  size(500,500);

}

    void checkCatch(int x){
         if (x > mouseX && x < mouseX+70)
            score+=1;
         else if (score > 0) 
            score--;
    }
    
void draw(){

    background(100, 130, 0);
    fill(0, 0, 255);
    stroke(0,0 , 255);
    ellipse(x, y, 30, 30);
    y+=7;
    fill(0,0,0);
    rect(mouseX,425,70,50);
    fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
        
    if(y>=440){
        checkCatch(x);
        y=75;
        x = (int) random(500);
        fill(255,255,255);
    }
}
 
