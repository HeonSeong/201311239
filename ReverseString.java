public class ReverseString {
	static void reverse(String s){
	String hello="hello";
	
	hello.toCharArray();
	char[] chArr=hello.toCharArray();
	
	 StringBuilder olleh=new StringBuilder();
	
	 for(int i=chArr.length-1;i>=0;i--){
	   olleh.append(chArr[i]);
	 }
	 System.out.println(olleh);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello";
		reverse(str);

	}

}