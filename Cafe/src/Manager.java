import java.util.ArrayList;
import java.util.Scanner;

public class Manager {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		Menu menu = new Menu();
		
		menu.setName("Latte");
		menu.setPrice(3200);
		menu.setName("Espresso");
		menu.setPrice(2500);
		menu.setName("Americano");
		menu.setPrice(2700);
//		for(int i=0; i<=2; i++) {
//			System.out.print("메뉴명을 입력하시오: ");
//			String A = s.nextLine();
//			menu.setName(A);
//			System.out.print("가격을 입력하시오: ");
//			int B = s1.nextInt();
//			menu.setPrice(B);
//		}
		System.out.println("------메뉴목록------");
		menu.display();	
		System.out.println("------------------");
	}
	
	
		// 스캐너로 입력
		// 셋에서 포문으로 하나씩 추가
		
	
		// o 출력용도
		

		// 메뉴명 추가(Latte) setmenu호출
		// 가격추가(3200) setprice호출
		// 메뉴명 추가(Espresso)
		// 가격 추가(2500)
		// 메뉴명 추가(Americano
		// 가격 추가(2700)
		// 메뉴명/가격 목록 출력 (display())
		
	

}