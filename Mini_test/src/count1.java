
public class count1 {

		public void calculation(int a, int b)
		{
			int c =0;
			c = a-b ;
			System.out.println(" 총거스름돈은 : " + c);
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
//			System.out.println("오천원 : " + five_thousand + "개");
//			System.out.println(" 총거스름돈은 : " + c);
//			
//			if(c>1000)
//			{
//				for(int i = 1000; i>c; i=i+1000)
//				{
//					one_thousand +=i;
//				}
//			}
//			c-=one_thousand*1000;
//			System.out.println("천원 : " + one_thousand + "개");
//			System.out.println(" 총거스름돈은 : " + c);
//			
//			if(c>500)
//			{
//				five_hundred = 1;
//			}
//			c -= 500;
//			System.out.println("오백원 : " + five_hundred + "개");
//			System.out.println(" 총거스름돈은 : " + c);
//			
//			if(c>100)
//			{
//				for(int i = 100; i>c; i=i+100)
//				{
//					one_hundred +=i;
//				}
//			}
//			c-=(one_hundred*100);
//			System.out.println("백원 : " + one_hundred + "개");
//			System.out.println(" 총거스름돈은 : " + c);
//			
//			if(c>50)
//			{
//				fifty = 1;
//			}
//			c -= 50;
//			System.out.println("오십원 : " + fifty + "개");
//			System.out.println(" 총거스름돈은 : " + c);
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
//			System.out.println("십원 : " + ten + "개");
//			System.out.println(" 총거스름돈은 : " + c);
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
//		System.out.println("오천원 : " + five_thousand + "개");
////		System.out.println(" 총거스름돈은 : " + c);
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
//		System.out.println("천원 : " + one_thousand + "개");
////		System.out.println(" 총거스름돈은 : " + c);
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
//		System.out.println("오백원 : " + five_hundred + "개");
////		System.out.println(" 총거스름돈은 : " + c);
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
//		System.out.println("백원 : " + one_hundred + "개");
////		System.out.println(" 총거스름돈은 : " + c);
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
//		System.out.println("오십원 : " + fifty + "개");
////		System.out.println(" 총거스름돈은 : " + c);
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
//		System.out.println("십원 : " + ten + "개");
////		System.out.println(" 총거스름돈은 : " + c);

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
//			System.out.println("오천원 : " + five_thousand + "개");
//			System.out.println("천원 : " + one_thousand + "개");
//			System.out.println("오백원 : " + five_hundred + "개");
//			System.out.println("백원 : " + one_hundred + "개");
//			System.out.println("오십원 : " + fifty + "개");
//			System.out.println("십원 : " + ten + "개");
//			
//			
		
			
			
//-----------------------------------------------------------------			
//		int[] arr = {5000,1000,500,100,50,10};
//		 
//		for(int i =0; i<arr.length;i++)
//		{
//			//c = 잔액	arr[i] = 금액권
//			c = printChange(c, arr[i]);
//		}			
//	}
//		
//		public int printChange(int change, int unit)
//		{
//			int count = change/unit;	
//			// change는 잔액   unit은 현재 구하고자 하는 금액권
//			// count = 갯수 = 잔액/금액권 
//			// ex) 6500/5000 = 1
//			// 잔액 = 6500, 금액권 = 5000, 갯수 = 1
//			change = change-(count*unit);
//			// 잔액 -= 갯수*금액권
//			System.out.println(unit + "원권 : " + count + "개");
//			return change;	// 계산하고 남은 잔액 return
//
//		}

			int[] arr = {5000,1000,500,100,50,10};
			
			for(int i = 0; i<arr.length;i++)
			{
				int c1 =0;
				c1 = c/arr[i];
				c-=arr[i]*c1;		
				System.out.println(arr[i]+"원권은 " + c1 + " 개 입니다.");
			}
		}
}

