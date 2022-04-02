package Day1;

import java.util.ArrayList;
import java.util.Scanner;

public class section24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2진수 10자리를 입력하세요");
		String a = sc.nextLine();
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list1 = new ArrayList<>();
		float sum = 0;
		
		int i=0;
		int c=1;
		float d = (float) 0.5;
		
		// 5자리씩 잘라주기.
		do {
			if(i<=4) {
				list.add(Integer.parseInt(a.toString().substring(i,i+1)));
			}
			if(i>4) {
				list1.add(Integer.parseInt(a.toString().substring(i,i+1)));
			}
			i++;	
		}
		while(i<a.length());
		//=============앞5자리================
		i=4;
		do {
			sum += list.get(i)*c;
			c=2*c;
			i--;	
		}while(i>=0);
		//=============뒤5자리================
		i=0;
		do {
			sum += (float)list1.get(i)*d;
			d=(float) (d/2.0);
			i++;	
		}while(i<list1.size());
		//===================================
		System.out.print(sum);
		sc.close();

	}

}
