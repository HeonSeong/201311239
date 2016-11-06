class TriangleTest {
	private int height;
	private String symbol;
	
	void drawTriangleWithChar(int height,String symbol){
		this.height=height;
		this.symbol=symbol;
		StringBuffer hbuf=new StringBuffer();
		for(int i=0; i<height; i++){
			for(int j=i; j<height-1;j++){
				hbuf.append(" ");
			}
			for(int k=0; k<=(i*2); k++){
				hbuf.append("*");
			}
			System.out.printf("%s\n",hbuf.toString());
			hbuf.delete(0, hbuf.length());
		}
	}
	public static void main(String[] args) {
		TriangleTest a=new TriangleTest();
		a.drawTriangleWithChar(5, "*");
	}
}
