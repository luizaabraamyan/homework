
public class sampleFromExam2 {

	public static void main(String[] args) {
		
		String str = "luiza luiza georgieva";
		String[] splitStr = str.split(" ");
		
		int counter = 0;
		int currentCount = 0;
		int max = Integer.MIN_VALUE;
		int index = 0;
		
		for(int i = 0; i < splitStr.length; i++){
			for(int j = 0; j < splitStr.length; j++){
				
				if(splitStr[i].equals(splitStr[j])){
					counter++;
					
				}
				if(i == j){
					counter--;
					index = i;
				}
				
				
			}
		}
		System.out.println(index + "" + counter);
		
			
			
		
		
		
		//System.out.println(/*splitStr[index] + "" +*/ currentCount);
	}
}

