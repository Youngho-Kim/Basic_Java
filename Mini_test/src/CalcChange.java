
public class CalcChange {

	
	public void calc(int money, int price)
	{
		int change = money-price;
		System.out.println(" 거스름돈 : " + change);
		
		
//		// 오천원권
//		int c5000 = change/5000;
//		change = change - (c5000*5000);
//		System.out.println("오천원권 : " + c5000 + "개");
//		
//		// 천원권
//		int c1000 = change/1000;
//		change = change - (c1000*1000);
//		System.out.println("천원권 : " + c1000 + "개");
//		
//		// 오백원권
//		int c500 = change/500;
//		change = change - (c500*500);
//		System.out.println("오백원권 : " + c500 + "개");
//		
//		// 백원권
//		int c100 = change/100;
//		change = change - (c100*100);
//		System.out.println("백원권 : " + c100 + "개");
//		
//		// 오십원권
//		int c50 = change/50;
//		change = change - (c50*50);
//		System.out.println("오십원권 : " + c50 + "개");
//		
//		// 십권원
//		int c10 = change/10;
//		change = change - (c10*10);
//		System.out.println("십원권 : " + c10 + "개");
		
		
//		change = printChange(change, 5000);
//		change = printChange(change, 1000);
//		change = printChange(change, 500);
//		change = printChange(change, 100);
//		change = printChange(change, 50);
//		change = printChange(change, 10);
		

		
		int[] arr = {5000,1000,500,100,50,10};
		 
//		int units_length = arr.length;	
		// arr.length를 바로 넣지 않는 이유는 배열의 값이 중간에 변하는 경우 반복문의 값이 틀려지기 때문이다.

		// 일반적인 for문
		//		for(int i =0; i<units_length;i++)
//		{
//			change = printChange(change, arr[i]);
//		}

		// 향상된 for문
		// 배열만 사용 가능함
//		for(int obj : arr)	// obj에는 String도 가능함 단, arr의 타입에 따라 다름
//		{
//			System.out.println(""+ obj);
//		}
		for(int unit : arr)	// 숫자를 사용할 수 없고 배열에서 사용가능
		{
//			System.out.println(unit);
			change = printChange(change, unit);
			
		}


		
	}
	
	public int printChange(int change, int unit)
	{
		int count = change/unit;	
		// change는 잔액   unit은 현재 구하고자 하는 금액권
		
		change = change-(count*unit);
		// 잔액 -= 갯수*금액권
		System.out.println(unit + "원권 : " + count + "개");
		return change;	// 계산하고 남은 잔액 return

	}
}
