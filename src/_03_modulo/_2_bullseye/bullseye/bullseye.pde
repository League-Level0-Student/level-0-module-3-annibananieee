
void setup() {
  
  size(500,500);
 

  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.

  for(int i = 200;i > 0 ;i-=25){
    //Use an if statement and modulo to alternate the color of your rings.
     if (i % 2 == 0) {
        fill(10);
    }
    else {
        fill();
    }
    ellipse(250,240,i,i);
   
  }
 
 
 
    
   
  
}
