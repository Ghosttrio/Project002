// �޴���, ����
import java.util.ArrayList;

public class Menu {

	ArrayList<String> alName;
	ArrayList<Integer> alPrice;

	

	Menu(){
		alName = new ArrayList<String>();
		alPrice = new ArrayList<Integer>();
	}
	
	void display() {
		for(int i=0; i<alName.size(); i++) {
		System.out.println(this.alName.get(i) + ":" + this.alPrice.get(i));
		}
		// name : price
		// name : prices
		// �޴���, ���� ��� ���

	}
	void setName(String alName) {
		this.alName.add(alName);
	}
	void setPrice(int alPrice) {
		this.alPrice.add(alPrice);
//		setName�� �ѹ� ȣ��Ǹ� �̰͵� ���
	}
}





