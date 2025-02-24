public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static int[] createIntArray(){
		int[] numarr = new int[5];
		for(int i = 0; i < 5; i++){
			numarr[i] = i+1;
		}
		return numarr;

	}
	public static String[] createArray(String s1, String s2, String s3, String s4){
		return new String[]{s1,s2,s3,s4};
	}
	public static int findValue(int key, int[] arr){
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == key){
				return i;
			}
		}
		return -1;
	}
	public static int findThirdValue(String key, String[] arr){
		int count = 0;
		for(int i = 0; i < arr.length; i++){
			if(key.equals(arr[i])){
				count++;
			}
			if(count >= 3){
				return i;
			}
		}
		return -1;
	}

}
