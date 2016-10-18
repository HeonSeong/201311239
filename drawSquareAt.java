import ch.aplu.turtle.*;

Turtle t1=new Turtle();
void drawSqureAt(int size,double x,double y){
  t1.setPos(x,y);
  for(int i=0;i<4;i++){
    t1.right(90);
    t1.forward(size);
  }
}
drawSquareAt(50,20.0,20.0);
drawSquareAt(50,50.0,50.0);