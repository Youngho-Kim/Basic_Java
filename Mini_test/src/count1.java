
public class count1 {

		public void calculation(int a, int b)
		{
			int c =0;
			c = a-b ;
			System.out.println(" �ѰŽ������� : " + c);
//-----------------------------------------------------------------			

			
//			int five_thousand =0;
//			int one_thousand =0;
//			int five_hundred =0;
//			int one_hundred =0;
//			int fifty =0;
//			int ten =0;
//			if(c>5000)
//			{
//				five_thousand = 1;
//			}
//			c -= 5000*five_thousand;			
//			System.out.println("��õ�� : " + five_thousand + "��");
//			System.out.println(" �ѰŽ������� : " + c);
//			
//			if(c>1000)
//			{
//				for(int i = 1000; i>c; i=i+1000)
//				{
//					one_thousand +=i;
//				}
//			}
//			c-=one_thousand*1000;
//			System.out.println("õ�� : " + one_thousand + "��");
//			System.out.println(" �ѰŽ������� : " + c);
//			
//			if(c>500)
//			{
//				five_hundred = 1;
//			}
//			c -= 500;
//			System.out.println("����� : " + five_hundred + "��");
//			System.out.println(" �ѰŽ������� : " + c);
//			
//			if(c>100)
//			{
//				for(int i = 100; i>c; i=i+100)
//				{
//					one_hundred +=i;
//				}
//			}
//			c-=(one_hundred*100);
//			System.out.println("��� : " + one_hundred + "��");
//			System.out.println(" �ѰŽ������� : " + c);
//			
//			if(c>50)
//			{
//				fifty = 1;
//			}
//			c -= 50;
//			System.out.println("���ʿ� : " + fifty + "��");
//			System.out.println(" �ѰŽ������� : " + c);
//			
//			if(c>10)
//			{
//				for(int i = 10; i>c; i=i+10)
//				{
//					ten =i;
//				}
//			}
//			c-=(ten*10);
//			
//			System.out.println("�ʿ� : " + ten + "��");
//			System.out.println(" �ѰŽ������� : " + c);
//		}
		
			
		
//-----------------------------------------------------------------
//		if(c/5000==1)
//		{
//			five_thousand = 1;
//		}
//		else
//		{
//			five_thousand = 0;
//		}
//		c-=5000*five_thousand;
//		System.out.println("��õ�� : " + five_thousand + "��");
////		System.out.println(" �ѰŽ������� : " + c);
//		
//		
//		if(c/1000==0)
//		{
//			one_thousand = 0;
//		}
//		else
//		{
//			one_thousand = c/1000;
//		}
//		c-=1000*one_thousand;
//		System.out.println("õ�� : " + one_thousand + "��");
////		System.out.println(" �ѰŽ������� : " + c);
//		
//		
//		if(c/500==1)
//		{
//			five_hundred = 1;
//		}
//		else
//		{
//			five_hundred = 0;
//		}
//		c-=500*five_hundred;
//		System.out.println("����� : " + five_hundred + "��");
////		System.out.println(" �ѰŽ������� : " + c);
//		
//		if(c/100==0)
//		{
//			one_hundred = 0;
//		}
//		else
//		{
//			one_hundred = c/100;
//		}
//		c-=100*one_hundred;
//		System.out.println("��� : " + one_hundred + "��");
////		System.out.println(" �ѰŽ������� : " + c);
//		
//		if(c/50==1)
//		{
//			fifty = 1;
//		}
//		else
//		{
//			fifty = 0;
//		}
//		c-=50*fifty;
//		System.out.println("���ʿ� : " + fifty + "��");
////		System.out.println(" �ѰŽ������� : " + c);
//		
//		if(c/10==0)
//		{
//			ten = 0;
//		}
//		else
//		{
//			ten = c/10;
//		}
//		c-=10*ten;
//		System.out.println("�ʿ� : " + ten + "��");
////		System.out.println(" �ѰŽ������� : " + c);

//			five_thousand = c/5000;
//			c-=5000;
//			
//			one_thousand = c/1000;
//			c-=one_thousand * 1000;
//			
//			five_hundred = c/500;
//			c-=500*five_hundred;
//			
//			one_hundred = c/100;
//			c-=one_hundred * 100;
//			
//			fifty = c/50;
//			c-=50*fifty;
//			
//			ten = c/1000;
//			System.out.println("��õ�� : " + five_thousand + "��");
//			System.out.println("õ�� : " + one_thousand + "��");
//			System.out.println("����� : " + five_hundred + "��");
//			System.out.println("��� : " + one_hundred + "��");
//			System.out.println("���ʿ� : " + fifty + "��");
//			System.out.println("�ʿ� : " + ten + "��");
//			
//			
		
			
			
//-----------------------------------------------------------------			
//		int[] arr = {5000,1000,500,100,50,10};
//		 
//		for(int i =0; i<arr.length;i++)
//		{
//			//c = �ܾ�	arr[i] = �ݾױ�
//			c = printChange(c, arr[i]);
//		}			
//	}
//		
//		public int printChange(int change, int unit)
//		{
//			int count = change/unit;	
//			// change�� �ܾ�   unit�� ���� ���ϰ��� �ϴ� �ݾױ�
//			// count = ���� = �ܾ�/�ݾױ� 
//			// ex) 6500/5000 = 1
//			// �ܾ� = 6500, �ݾױ� = 5000, ���� = 1
//			change = change-(count*unit);
//			// �ܾ� -= ����*�ݾױ�
//			System.out.println(unit + "���� : " + count + "��");
//			return change;	// ����ϰ� ���� �ܾ� return
//
//		}

			int[] arr = {5000,1000,500,100,50,10};
			
			for(int i = 0; i<arr.length;i++)
			{
				int c1 =0;
				c1 = c/arr[i];
				c-=arr[i]*c1;		
				System.out.println(arr[i]+"������ " + c1 + " �� �Դϴ�.");
			}
		}
}

