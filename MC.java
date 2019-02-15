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
		
		
		System.out.println("\n○○○○ 영화예매 ○○○○○");
		System.out.println("○○○○○○○○○○○○○○○○");
		System.out.println("○○ 1. 자리 예매   ○○");
		System.out.println("○○ 2. 내 자리 확인○○");
		System.out.println("○○ 3. 빈 자리 확인○○");
		System.out.println("○○ 4. 자리 변경   ○○");
		System.out.println("○○ 5. 종료        ○○");
		System.out.println("○○○○○○○○○○○○○○○○");

		System.out.println("\n번호를 입력하세요");
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
		
		
		System.out.println("\n좌석을 고르세요\n");
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
		System.out.println("내 자리");
		
		for (int i = 0; i < seatArr.length; i++) {
			for (int j = 0; j < seatArr[i].length; j++) {
				System.out.printf("[%s]",seatArr[i][j]);
			}
			System.out.println();
		}
		
	}
	
	private void emptySeat() {
		System.out.println("빈 자리 확인");
		
		for (int i = 0; i < seatArr.length; i++) {
			for(int j = 0; j < seatArr[i].length; j++) {
				System.out.printf("[%s]",seatArr[i][j]);
			}
			System.out.println();
		}
		
	}
	
	private void changeSeat() {
		System.out.println("자리변경");
		
		System.out.println("원래 좌석을 선택하세요");
		String ch = sc.nextLine();
		
		System.out.println("변경 좌석을 선택하세요");
		String ch2 = sc.nextLine();
		
		
		
		
		
		
		
	}
	
	private void end() {
		System.out.println("종료");
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
