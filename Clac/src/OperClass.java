import java.util.Scanner;

public class OperClass {
//	int num1;
//	int num2;
//	AddClass ac;
//	SubClass ac; //���ؾ� �Ǵ� 
	Hab ac;
	
	NumVo nc; // ����
	
	//������
	public OperClass() {
		System.out.println("���� ���α׷�");
		ac = new SubClass(); 
		nc = new NumVo();
		
	}
	public void inputNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���� �Է�: ");
		nc.setNum1(sc.nextInt());
		System.out.println("�ι�° ���� �Է�: ");
		nc.setNum2(sc.nextInt());
	}
	
	public void printResult() {
		ac.clac(nc);

	}
}
