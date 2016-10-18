import ch.aplu.turtle.*;

Turtle t1=new Turtle();
void drawTriangle(int size){
  for(int i=0;i<3;i++){
    t1.left(120);
    t1.forward(size);
  }
}
drawTriangle(100);