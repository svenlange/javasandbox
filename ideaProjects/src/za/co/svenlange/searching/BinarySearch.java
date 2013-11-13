package za.co.svenlange.searching;

public class BinarySearch {

	static final int[] FELD = {1,2,3,6,8,9};
	
	public static void main(String... args) {
		int param = Integer.parseInt(args[0]);
		
		int index = bSearchI(param);
		
		System.out.println("index: " + index);
	}
	
	static int bSearch(int param) {
		return bSearch(0, FELD.length, param);
	}
	
	static int bSearch(int u, int o, int param) {
		if(u>o) return -1;
		
		int m = (u+o)/2;
		
		if(FELD[m]==param) {
			return m;
		} else if(param>FELD[m]) {
			return bSearch(m+1, o, param);
		} else {
			return bSearch(u, m-1, param);
		}		
	}
	
	static int bSearchI(int param) {
		int a = 0;
		int b = FELD.length-1;
		
		while(a<=b) {
			int m = (a+b)/2;
			
			if(FELD[m]==param) {
				return m;
			} else if(param>FELD[m]) {
				a=m+1;
			} else {
				b=m-1;
			}
		}
		
		return -1;
	}

}