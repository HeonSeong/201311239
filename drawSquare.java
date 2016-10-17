;
void drawSquare(int size){
  for(int i=0;i<4;i++){
    t1.forward(size);
    t1.right(90);
  }
}
import ch.aplu.turtle.*;
Turtle t1=new Turtle();
drawSquare(100);