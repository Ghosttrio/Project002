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
//			System.out.print("�޴����� �Է��Ͻÿ�: ");
//			String A = s.nextLine();
//			menu.setName(A);
//			System.out.print("������ �Է��Ͻÿ�: ");
//			int B = s1.nextInt();
//			menu.setPrice(B);
//		}
		System.out.println("------�޴����------");
		menu.display();	
		System.out.println("------------------");
	}
	
	
		// ��ĳ�ʷ� �Է�
		// �¿��� �������� �ϳ��� �߰�
		
	
		// o ��¿뵵
		

		// �޴��� �߰�(Latte) setmenuȣ��
		// �����߰�(3200) setpriceȣ��
		// �޴��� �߰�(Espresso)
		// ���� �߰�(2500)
		// �޴��� �߰�(Americano
		// ���� �߰�(2700)
		// �޴���/���� ��� ��� (display())
		
	

}