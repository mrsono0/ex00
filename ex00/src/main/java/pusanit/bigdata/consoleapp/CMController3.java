package pusanit.bigdata.consoleapp;

import java.util.ArrayList;
import java.util.Scanner;

public class CMController3 {

	static CMService cmservice = new CMServiceConsole();

	public static void main(String[] args) {
		// 고객 정보를 저장할 자료구조 선언
		ArrayList<Customer> custList = new ArrayList<>();

		// 리스트 정보를 조회하기 위해 인덱스를 필요로 함
		int index = -1;
		int count = 0;// custList.size()

		// 기본 입력장치로부터 데이터를 입력받기 위해 Scanner객체 생성
		Scanner scan = new Scanner(System.in);

		while (true) {
			count = custList.size();
			String menu = cmservice.initMenu(custList, scan, count, index); // 입력한 문자열을 모두소문자로 변환
			switch (menu.charAt(0)) {
			case 'i':
				custList = cmservice.insertCustomerData(custList, scan);
				break;
			case 'p':
				index = cmservice.printPCustomerData(custList, index, scan);
				break;
			case 'n':
				index = cmservice.printNCustomerData(custList, index, scan, count);
				break;
			case 'c':
				cmservice.printCustomerData(custList, index, scan, count);
				break;
			case 'u':
				custList = cmservice.updateCustomerData(custList, index, scan, count);
				break;
			case 'd':
				custList = cmservice.deleteCustomerData(custList, index, count);
				break;
			case 'q':
				cmservice.quitSystem(scan);
				break;
			default:
				System.out.println("메뉴를 잘 못 입력했습니다.");
			}// end switch
		} // end while
	}
}
