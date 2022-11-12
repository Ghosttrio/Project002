import java.util.Scanner;

public class gitmanual{
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 2;
		boolean bFlag = false;
		while(i<n) {
			if(n%i==0) {
				bFlag=true;
				break;
			}
			i++;
		}
		if(bFlag==false) {
			System.out.println("소수");
		}else {
			System.out.println("소수x");
		}
	}
}