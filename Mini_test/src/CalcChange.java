
public class CalcChange {

	
	public void calc(int money, int price)
	{
		int change = money-price;
		System.out.println(" �Ž����� : " + change);
		
		
//		// ��õ����
//		int c5000 = change/5000;
//		change = change - (c5000*5000);
//		System.out.println("��õ���� : " + c5000 + "��");
//		
//		// õ����
//		int c1000 = change/1000;
//		change = change - (c1000*1000);
//		System.out.println("õ���� : " + c1000 + "��");
//		
//		// �������
//		int c500 = change/500;
//		change = change - (c500*500);
//		System.out.println("������� : " + c500 + "��");
//		
//		// �����
//		int c100 = change/100;
//		change = change - (c100*100);
//		System.out.println("����� : " + c100 + "��");
//		
//		// ���ʿ���
//		int c50 = change/50;
//		change = change - (c50*50);
//		System.out.println("���ʿ��� : " + c50 + "��");
//		
//		// �ʱǿ�
//		int c10 = change/10;
//		change = change - (c10*10);
//		System.out.println("�ʿ��� : " + c10 + "��");
		
		
//		change = printChange(change, 5000);
//		change = printChange(change, 1000);
//		change = printChange(change, 500);
//		change = printChange(change, 100);
//		change = printChange(change, 50);
//		change = printChange(change, 10);
		

		
		int[] arr = {5000,1000,500,100,50,10};
		 
//		int units_length = arr.length;	
		// arr.length�� �ٷ� ���� �ʴ� ������ �迭�� ���� �߰��� ���ϴ� ��� �ݺ����� ���� Ʋ������ �����̴�.

		// �Ϲ����� for��
		//		for(int i =0; i<units_length;i++)
//		{
//			change = printChange(change, arr[i]);
//		}

		// ���� for��
		// �迭�� ��� ������
//		for(int obj : arr)	// obj���� String�� ������ ��, arr�� Ÿ�Կ� ���� �ٸ�
//		{
//			System.out.println(""+ obj);
//		}
		for(int unit : arr)	// ���ڸ� ����� �� ���� �迭���� ��밡��
		{
//			System.out.println(unit);
			change = printChange(change, unit);
			
		}


		
	}
	
	public int printChange(int change, int unit)
	{
		int count = change/unit;	
		// change�� �ܾ�   unit�� ���� ���ϰ��� �ϴ� �ݾױ�
		
		change = change-(count*unit);
		// �ܾ� -= ����*�ݾױ�
		System.out.println(unit + "���� : " + count + "��");
		return change;	// ����ϰ� ���� �ܾ� return

	}
}
