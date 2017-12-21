package Test;
import java.util.ArrayList;
import java.util.List;

public class Bghost {
	public static void main(String[] args) {
		int num[] = new int[4];
		int num1;
		int num2;
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 1001; i <= 9999; i++) {
			boolean flag = false;
			int equal = i;
			int temp = i;
			for(int j = 0; j < 4; j++) {
				num[j] = temp % 10;
				temp = temp /10;
			}
			
			for(int k = 0; k < 4; k++) {
				int one = num[k];
				if(one != 0) {
					for(int m = 0; m < 4; m++) {
						if(k < m) {
							int two = num[m];
							num1 = one *10 + two;
							
							for(int p = 0; p < 4; p++) {
								if((p != k) && (p != m)) {
									int three = num[p];
									if(p != 0) {
										for(int q = 0; q < 4; q++) {
											if((q != k) && (q != m) && (q != p)) {
												int four = num[q];
												num2 = three * 10 + four;
												
												if(equal == (num1 * num2)) {
													flag = true;
													//System.out.println(equal);
												}
											}
										}
									}
								}
							}
						}
					}
				}				
			}
			if(flag) {
				list.add(equal);
			}
		}
		
		for(Integer t : list) {
			System.out.println(t);
		}
	}
}
