package com.kwave.java.basic;

import java.util.ArrayList;
import java.util.Scanner;

import com.kwave.java.bbs.Bbs;

public class BasicMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		String class1Name = "안드로이드 스쿨";
//		int class1Size = 20;
//		
//		int student1Count  = 15;
//		
//		String student1Name = "홍길동";
//		int student1Age = 15;
//		
//		String student2Name = "이순신";
//		int student2Age = 33;
//		
//		String student3Name = "세종대왕";
//		int student3Age = 27;
//		
//		
//		String class2Name = "ios";
//		int class2Size = 17;
//		
//		int student2Count  = 15;
//		

		// 클래스 외부의 클래스에 있는 변수를 가져오기 위해서는 객체를 생성하는 작업이 필요하다.
		Class class1 = new Class();
		// 생성된 객체로 변수를 사용한다.
		class1.name = "안드로이드 스쿨";
		class1.size = 15;
		class1.studentCount = 15;
		
		
		
		
		// 클래스 외부의 클래스에 있는 변수를 가져오기 위해서는 객체를 생성하는 작업이 필요하다.
		Student student1 = new Student();
		// 생성된 객체로 변수를 사용한다.
		student1.name = "홍길동";
		student1.age = 15;
		
		// 클래스 외부의 클래스에 있는 변수를 가져오기 위해서는 객체를 생성하는 작업이 필요하다.
		Student student2 = new Student();
		// 생성된 객체로 변수를 사용한다.
		student2.name = "이순신";
		student2.age = 27;
		
		// 클래스 외부의 클래스에 있는 변수를 가져오기 위해서는 객체를 생성하는 작업이 필요하다.
		Student student3 = new Student();
		// 생성된 객체로 변수를 사용한다.
		student3.name = "세종대왕";
		student3.age = 33;
		
		
		
		
		
//=====================================	게시판 만들기 ==================================================================
		
		ArrayList<Bbs> datas = new ArrayList<>();	// Bbs클래스를 datas배열 객체로 생성
		
		
		// 값 입력받기
		Scanner scanner = new Scanner(System.in);
		while(true){
			//명령어 입력하기
			System.out.println("명령어를 입력하세요 : 1.입력, 2.목록, 3.상세보기, 4. 목록 삭제, q.끝내기");
			String command = scanner.nextLine();
			
			if(command.equals("1"))	// 입력
			{
				Bbs bbs = new Bbs();	// Bbs클래스를 bbs로 객체 생성
				
				System.out.println("제목을 입력하세요 : ");
	//			String title = scanner.nextLine();	// 입력한 값을 넘겨줌 , 압력이 들어올 때까지 여기서 시스템이 대기한다.
				bbs.title = scanner.nextLine();	// 입력한 값을 넘겨줌 , 압력이 들어올 때까지 여기서 시스템이 대기한다.
				
				System.out.println("이름을 입력하세요 : ");
	//			String author = scanner.nextLine();	// 입력한 값을 넘겨줌 , 압력이 들어올 때까지 여기서 시스템이 대기한다.
				bbs.author = scanner.nextLine();	// 입력한 값을 넘겨줌 , 압력이 들어올 때까지 여기서 시스템이 대기한다.
	
				System.out.println("내용을 입력하세요 : ");
	//			String content = scanner.nextLine();	// 입력한 값을 넘겨줌 , 압력이 들어올 때까지 여기서 시스템이 대기한다.
				bbs.content = scanner.nextLine();	// 입력한 값을 넘겨줌 , 압력이 들어올 때까지 여기서 시스템이 대기한다.
				
	//			bbs.date = System.currentTimeMillis();	// 클래스 내부에서 처리해야하는 것이 있으면 함수를 만들어서 사용한다.
				bbs.initDate();
				datas.add(bbs);
			}
			else if(command.equals("2"))	// 목록 보기
			{
				for(Bbs item : datas)	// 향상된 for문은 제네릭 단위로 반복함
				{
					System.out.print(item.title);
					System.out.print("  ");
					System.out.println(item.date);
				}
			}
			else if(command.equals("3"))	// 상세보기
			{
				for(Bbs item : datas)	// 향상된 for문은 제네릭 단위로 반복함
				{
					System.out.println(item.title);
				}
				System.out.print("몇 번 목록을 보시겠습니까? : ");	// 확인할 목록
				String temp = scanner.nextLine();	// 확인할 목록 받기
				int temp1=0;
				try{
					temp1 = Integer.parseInt(temp);	// String -> int로 바꾸기
				}
				catch(Exception e){
				}
				int temp2 = 0; // 입력 값이 저장될 변수
				
				// 저장된 배열리스트 값과 다른 값이 입력될 경우 예외처리
				int length = datas.size();	// 저장된 배열의 길이 갖고 오기
				while((temp1>length)||(temp1<=0)){	// 입력된 값보다 크거나 0이하의 값이 들어올 경우
						System.out.println("1부터 입력하세요.");
						temp = scanner.nextLine();	// 확인할 목록 받기
						try{
							temp1 = Integer.parseInt(temp);	// String -> int로 바꾸기
						}
						catch(Exception e){
						}
				}
					temp2 = temp1 - 1;				// 입력되는 값은 1부터이고 게시판의 배열은 0부터 이므로 -1을 함
				
				Bbs abc = datas.get(temp2);
					System.out.print("책 제목 : ");
					System.out.println(abc.title);
					System.out.print("저자 : ");
					System.out.println(abc.author);
					System.out.print("내용 : ");
					System.out.println(abc.content);
			}
			
			else if(command.equals("4"))	// 목록 삭제
			{
				for(Bbs item : datas)	// 향상된 for문은 제네릭 단위로 반복함
				{
					System.out.println(item.title);
				}
				System.out.print("삭제할 목록은 몇번입니까? : ");	// 삭제할 목록
				String temp = scanner.nextLine();	// 삭제할 목록 받기
				int temp1=0;
				try{
					temp1 = Integer.parseInt(temp);	// String -> int로 바꾸기
				}
				catch(Exception e){
				}
				int temp2 = temp1 -1; // 삭제할  값이 저장될 변수
				
				// 저장된 배열리스트 값과 다른 값이 입력될 경우 예외처리
				int length = datas.size();	// 저장된 배열의 길이 갖고 오기
				while(!((temp1<=length)&(temp1>0))){	// 입력된 값보다 크거나 0이하의 값이 들어올 경우
					System.out.println("1부터 입력하세요.");
					temp = scanner.nextLine();	// 확인할 목록 받기
					try{
						temp1 = Integer.parseInt(temp);	// String -> int로 바꾸기
					}
					catch(Exception e){
					}
				}
				datas.remove(temp2);
			}
			else if(command.equals("q"))
			{
				break;
			}
		}
//		System.out.println("-------입력 결과-------");
//		System.out.println("제목 : " +title);
//		System.out.println("이름 : " +author);
//		System.out.println("내용 : " +content);
		
		
		
//		Bbs bbs = new Bbs();
//		bbs.title = "안녕하세요";
//		bbs.author = "홍길동";
//		bbs.date = System.currentTimeMillis();	
//		// System.currentTimeMillis()의 return 값이 long이므로 date의 타입도 long으로 바꿔준다.
//		bbs.content = "어쩌고 저쩌고 블라블라";
			
		
		
		
		
		
		
	}
}
//class Class{
//	// 클래스의 멤버변수는 처음에 초기화를 하지 않아도 된다.
//	String name;
//	int size;
//	int studentCount;
//	
//}

// 클래스 생성
class Student{
//	같은 패키지 안에 있는 클래스는 public을 쓰지 않아도 됨
	String name;
	int age;
}