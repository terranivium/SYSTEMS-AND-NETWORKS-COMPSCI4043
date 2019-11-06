public class AssessedEXSandN{
	public static void main(String[] args){
		
		int n = 12;
		int[] x = {3, -6, 27, 101, 50, 0, -20, -21, 19, 6, 4, -10};
		int possum = 0;
		int negcount = 0;
		int oddcount = 0;

		for(int i=0;i<n;i++){
	        if(x[i]<0){
	            negcount++;
	        } else {
	        	possum += x[i];
	        	if(x[i] % 2 != 0){
	            	oddcount++;
	    		}
			}
		}
		System.out.printf("Oddcount %d Negcount %d Possum %d \n", oddcount, negcount, possum);
	}
}