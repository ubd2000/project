package mo;

import java.util.Scanner;

public class MC {
	
	Scanner sc = new Scanner(System.in);
    static String[][] seatArr = new String[3][3];
	
    static {
		for (int i = 0; i < seatArr.length; i++) {
			for(int j = 0; j < seatArr[i].length; j++) {
				if (i == 0) {
					seatArr[i][j] = "A" + (j+1);
				}else if (i == 1) {
					seatArr[i][j] = "B" + (j+1);
				}else {
					seatArr[i][j] = "C" + (j+1);
				}

			}
		}
	}  
	
	private int menu() {
		
		
		System.out.println("\n�ۡۡۡ� ��ȭ���� �ۡۡۡۡ�");
		System.out.println("�ۡۡۡۡۡۡۡۡۡۡۡۡۡۡۡ�");
		System.out.println("�ۡ� 1. �ڸ� ����   �ۡ�");
		System.out.println("�ۡ� 2. �� �ڸ� Ȯ�Ρۡ�");
		System.out.println("�ۡ� 3. �� �ڸ� Ȯ�Ρۡ�");
		System.out.println("�ۡ� 4. �ڸ� ����   �ۡ�");
		System.out.println("�ۡ� 5. ����        �ۡ�");
		System.out.println("�ۡۡۡۡۡۡۡۡۡۡۡۡۡۡۡ�");

		System.out.println("\n��ȣ�� �Է��ϼ���");
		int number = Integer.parseInt(sc.nextLine());
		
		return number;
	}
	
	private void res() {
		
		

			for (int i = 0; i < seatArr.length; i++) {
				for (int j = 0; j < seatArr[i].length; j++) {
					System.out.printf("[%s]",seatArr[i][j]);
				}
				System.out.println();
			}
		
		
		System.out.println("\n�¼��� ������\n");
		String pick = sc.nextLine();
		
		for (int i = 0; i < seatArr.length; i++) {
			for (int j = 0; j < seatArr[i].length; j++) {
				if(seatArr[i][j].equals(pick)) {
					seatArr[i][j] = "X";
				}
			}
		}
		
		
	}
	
	private void mySeat() {
		System.out.println("�� �ڸ�");
		
		for (int i = 0; i < seatArr.length; i++) {
			for (int j = 0; j < seatArr[i].length; j++) {
				System.out.printf("[%s]",seatArr[i][j]);
			}
			System.out.println();
		}
		
	}
	
	private void emptySeat() {
		System.out.println("�� �ڸ� Ȯ��");
		
		for (int i = 0; i < seatArr.length; i++) {
			for(int j = 0; j < seatArr[i].length; j++) {
				System.out.printf("[%s]",seatArr[i][j]);
			}
			System.out.println();
		}
		
	}
	
	private void changeSeat() {
		System.out.println("�ڸ�����");
		
		System.out.println("���� �¼��� �����ϼ���");
		String ch = sc.nextLine();
		
		System.out.println("���� �¼��� �����ϼ���");
		String ch2 = sc.nextLine();
		
		
		
		
		
		
		
	}
	
	private void end() {
		System.out.println("����");
	}
	
	public void displayMenu() {
a:		while(true) {
			switch(menu()){
			case 1 : res();
				break;
				
			case 2 : mySeat();
				break;
			
			case 3 : emptySeat();
				break;
			
			case 4 : changeSeat();
				break;
			
			default : end();
				break a; 
			}
		}
			
		
	}
	
	
	
	
	
}
