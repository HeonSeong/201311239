public class SeoulPeople {
	static void calculate(){
		int menSum = 0;
		float menAvg = 0;
		int womenSum = 0;
		float womenAvg = 0;
		int[] districtSum = new int[25];
		float[] districtAvg = new float[25];
		String[]  district = {"district1","district2","district3","district4","district5"
		 ,"district6","district7","district8","district9","district10"
		 ,"district11","district12","district13","district14","district15"
		 ,"district16","district17","district18","district19","district20"
		 ,"district21","district22","district23","district24","district25"};
	
		int[][] data={
		     {74425, 76326},
		     {61164, 61636},
		     {109688, 115744},
		     {144796, 146776},
		     {174996, 181676},
		     {177841, 177434},
		     {204630, 205980},
		     {223373, 232245},
		     {161055, 166130},
		     {171576, 176735},
		     {279169, 293772},
		     {239450, 251066},
		     {148690, 156510},
		     {182977, 196992},
		     {237792, 242641},
		     {283869, 296762},
		     {209344, 210282},
		     {118965, 114441},
		     {186503, 186856},
		     {195734, 203014},
		     {254381, 249472},
		     {212401, 229111},
		     {271654, 295354},
		     {319197, 335045},
		     {229829, 231671}
		}; 
		
		for(int i=0; i<data.length;i++ ){
			menSum += data[i][0];
			womenSum += data[i][1];
			for(int j = 0;j<data[i].length;j++){
				districtSum[i] += data[i][j];
			}
			districtAvg[i] = (float)districtSum[i]/(data[i].length);
			System.out.println(district[i]+"(Sum : "+districtSum[i] + ", Avg : " + districtAvg[i]+")");
			}
			menAvg = (float)menSum/(data.length);
			womenAvg = (float)womenSum/(data.length);
			System.out.println();
			System.out.println("[9-1] MenNumber : "+menSum+", MenAvg : "+menAvg);
			System.out.println("[9-2] WomenNumber : "+womenSum+", WomenAvg : "+womenAvg+"\n");
			
			for(int i=0;i<data.length;i++){
			    System.out.print("(");
			    for(int j =0;j<data[i].length;j++){
			       System.out.printf(" %d ",data[i][j]);
			    }
			    System.out.print(")\n");
			}
			}
			 public static void main(String[] args){
			 calculate();
			 }
			}