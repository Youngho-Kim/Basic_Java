package com.kwave.java.basic;

import java.util.ArrayList;
import java.util.Scanner;

import com.kwave.java.bbs.Bbs;

public class BasicMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		String class1Name = "�ȵ���̵� ����";
//		int class1Size = 20;
//		
//		int student1Count  = 15;
//		
//		String student1Name = "ȫ�浿";
//		int student1Age = 15;
//		
//		String student2Name = "�̼���";
//		int student2Age = 33;
//		
//		String student3Name = "�������";
//		int student3Age = 27;
//		
//		
//		String class2Name = "ios";
//		int class2Size = 17;
//		
//		int student2Count  = 15;
//		

		// Ŭ���� �ܺ��� Ŭ������ �ִ� ������ �������� ���ؼ��� ��ü�� �����ϴ� �۾��� �ʿ��ϴ�.
		Class class1 = new Class();
		// ������ ��ü�� ������ ����Ѵ�.
		class1.name = "�ȵ���̵� ����";
		class1.size = 15;
		class1.studentCount = 15;
		
		
		
		
		// Ŭ���� �ܺ��� Ŭ������ �ִ� ������ �������� ���ؼ��� ��ü�� �����ϴ� �۾��� �ʿ��ϴ�.
		Student student1 = new Student();
		// ������ ��ü�� ������ ����Ѵ�.
		student1.name = "ȫ�浿";
		student1.age = 15;
		
		// Ŭ���� �ܺ��� Ŭ������ �ִ� ������ �������� ���ؼ��� ��ü�� �����ϴ� �۾��� �ʿ��ϴ�.
		Student student2 = new Student();
		// ������ ��ü�� ������ ����Ѵ�.
		student2.name = "�̼���";
		student2.age = 27;
		
		// Ŭ���� �ܺ��� Ŭ������ �ִ� ������ �������� ���ؼ��� ��ü�� �����ϴ� �۾��� �ʿ��ϴ�.
		Student student3 = new Student();
		// ������ ��ü�� ������ ����Ѵ�.
		student3.name = "�������";
		student3.age = 33;
		
		
		
		
		
//=====================================	�Խ��� ����� ==================================================================
		
		ArrayList<Bbs> datas = new ArrayList<>();	// BbsŬ������ datas�迭 ��ü�� ����
		
		
		// �� �Է¹ޱ�
		Scanner scanner = new Scanner(System.in);
		while(true){
			//��ɾ� �Է��ϱ�
			System.out.println("��ɾ �Է��ϼ��� : 1.�Է�, 2.���, 3.�󼼺���, 4. ��� ����, q.������");
			String command = scanner.nextLine();
			
			if(command.equals("1"))	// �Է�
			{
				Bbs bbs = new Bbs();	// BbsŬ������ bbs�� ��ü ����
				
				System.out.println("������ �Է��ϼ��� : ");
	//			String title = scanner.nextLine();	// �Է��� ���� �Ѱ��� , �з��� ���� ������ ���⼭ �ý����� ����Ѵ�.
				bbs.title = scanner.nextLine();	// �Է��� ���� �Ѱ��� , �з��� ���� ������ ���⼭ �ý����� ����Ѵ�.
				
				System.out.println("�̸��� �Է��ϼ��� : ");
	//			String author = scanner.nextLine();	// �Է��� ���� �Ѱ��� , �з��� ���� ������ ���⼭ �ý����� ����Ѵ�.
				bbs.author = scanner.nextLine();	// �Է��� ���� �Ѱ��� , �з��� ���� ������ ���⼭ �ý����� ����Ѵ�.
	
				System.out.println("������ �Է��ϼ��� : ");
	//			String content = scanner.nextLine();	// �Է��� ���� �Ѱ��� , �з��� ���� ������ ���⼭ �ý����� ����Ѵ�.
				bbs.content = scanner.nextLine();	// �Է��� ���� �Ѱ��� , �з��� ���� ������ ���⼭ �ý����� ����Ѵ�.
				
	//			bbs.date = System.currentTimeMillis();	// Ŭ���� ���ο��� ó���ؾ��ϴ� ���� ������ �Լ��� ���� ����Ѵ�.
				bbs.initDate();
				datas.add(bbs);
			}
			else if(command.equals("2"))	// ��� ����
			{
				for(Bbs item : datas)	// ���� for���� ���׸� ������ �ݺ���
				{
					System.out.print(item.title);
					System.out.print("  ");
					System.out.println(item.date);
				}
			}
			else if(command.equals("3"))	// �󼼺���
			{
				for(Bbs item : datas)	// ���� for���� ���׸� ������ �ݺ���
				{
					System.out.println(item.title);
				}
				System.out.print("�� �� ����� ���ðڽ��ϱ�? : ");	// Ȯ���� ���
				String temp = scanner.nextLine();	// Ȯ���� ��� �ޱ�
				int temp1=0;
				try{
					temp1 = Integer.parseInt(temp);	// String -> int�� �ٲٱ�
				}
				catch(Exception e){
				}
				int temp2 = 0; // �Է� ���� ����� ����
				
				// ����� �迭����Ʈ ���� �ٸ� ���� �Էµ� ��� ����ó��
				int length = datas.size();	// ����� �迭�� ���� ���� ����
				while((temp1>length)||(temp1<=0)){	// �Էµ� ������ ũ�ų� 0������ ���� ���� ���
						System.out.println("1���� �Է��ϼ���.");
						temp = scanner.nextLine();	// Ȯ���� ��� �ޱ�
						try{
							temp1 = Integer.parseInt(temp);	// String -> int�� �ٲٱ�
						}
						catch(Exception e){
						}
				}
					temp2 = temp1 - 1;				// �ԷµǴ� ���� 1�����̰� �Խ����� �迭�� 0���� �̹Ƿ� -1�� ��
				
				Bbs abc = datas.get(temp2);
					System.out.print("å ���� : ");
					System.out.println(abc.title);
					System.out.print("���� : ");
					System.out.println(abc.author);
					System.out.print("���� : ");
					System.out.println(abc.content);
			}
			
			else if(command.equals("4"))	// ��� ����
			{
				for(Bbs item : datas)	// ���� for���� ���׸� ������ �ݺ���
				{
					System.out.println(item.title);
				}
				System.out.print("������ ����� ����Դϱ�? : ");	// ������ ���
				String temp = scanner.nextLine();	// ������ ��� �ޱ�
				int temp1=0;
				try{
					temp1 = Integer.parseInt(temp);	// String -> int�� �ٲٱ�
				}
				catch(Exception e){
				}
				int temp2 = temp1 -1; // ������  ���� ����� ����
				
				// ����� �迭����Ʈ ���� �ٸ� ���� �Էµ� ��� ����ó��
				int length = datas.size();	// ����� �迭�� ���� ���� ����
				while(!((temp1<=length)&(temp1>0))){	// �Էµ� ������ ũ�ų� 0������ ���� ���� ���
					System.out.println("1���� �Է��ϼ���.");
					temp = scanner.nextLine();	// Ȯ���� ��� �ޱ�
					try{
						temp1 = Integer.parseInt(temp);	// String -> int�� �ٲٱ�
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
//		System.out.println("-------�Է� ���-------");
//		System.out.println("���� : " +title);
//		System.out.println("�̸� : " +author);
//		System.out.println("���� : " +content);
		
		
		
//		Bbs bbs = new Bbs();
//		bbs.title = "�ȳ��ϼ���";
//		bbs.author = "ȫ�浿";
//		bbs.date = System.currentTimeMillis();	
//		// System.currentTimeMillis()�� return ���� long�̹Ƿ� date�� Ÿ�Ե� long���� �ٲ��ش�.
//		bbs.content = "��¼�� ��¼�� �����";
			
		
		
		
		
		
		
	}
}
//class Class{
//	// Ŭ������ ��������� ó���� �ʱ�ȭ�� ���� �ʾƵ� �ȴ�.
//	String name;
//	int size;
//	int studentCount;
//	
//}

// Ŭ���� ����
class Student{
//	���� ��Ű�� �ȿ� �ִ� Ŭ������ public�� ���� �ʾƵ� ��
	String name;
	int age;
}