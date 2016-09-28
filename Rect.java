   public class Rectangle{
   private int width;
   private int height;
   public Rectangle(int w, int h){
      this.width=w;
      this.height=h;
      }
   public void setRect(int w, int h){
      this.width=w;
      this.height=h;
    }
   public int clacRect(){
     return width*height;
     }
 }
Rectangle hs=new Rectangle(5,2);
hs.clacRect();
hs.setRect(10,5);
hs.clacRect();