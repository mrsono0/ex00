package pusanit.bigdata.consoleapp;

import java.util.ArrayList;
import java.util.Scanner;

public class CMDAO2 {
	public void insertCustomerData(ArrayList<Customer> custList, Scanner scan) {
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("성별(M/F) : ");
		char gender = scan.next().charAt(0);
		System.out.print("이메일 : ");
		String email = scan.next();
		System.out.print("출생년도 : ");
		int birthYear = scan.nextInt();

		// 입력받은 데이터로 고객 객체를 생성
		Customer cust = new Customer(name, gender, email, birthYear);

		// 고객 객체를 ArrayList에 저장
		custList.add(cust);
	}

	// 고객데이터 출력
	public void printCustomerData(ArrayList<Customer> custList, int index, Scanner scan) {
		Customer cust = custList.get(index);
		System.out.println("==========CUSTOMER INFO================");
		System.out.println("이름 : " + cust.getName());
		System.out.println("성별 : " + cust.getGender());
		System.out.println("이메일 : " + cust.getEmail());
		System.out.println("출생년도 : " + cust.getBirthYear());
		System.out.println("=======================================");
	}

	// index 위치의 고객정보를 삭제합니다.
	public void deleteCustomerData(ArrayList<Customer> custList, int index) {
		custList.remove(index);
	}

	// index 위치의 고객 정보를 수정합니다.
	public void updateCustomerData(ArrayList<Customer> custList, int index, Scanner scan) {
		Customer cust = custList.get(index);
		System.out.println("---------UPDATE CUSTOMER INFO----------");
		System.out.print("이름(" + cust.getName() + ") :");
		cust.setName(scan.next());

		System.out.print("성별(" + cust.getGender() + ") :");
		cust.setGender(scan.next().charAt(0));

		System.out.print("이메일(" + cust.getEmail() + ") :");
		cust.setEmail(scan.next());

		System.out.print("출생년도(" + cust.getBirthYear() + ") :");
		cust.setBirthYear(scan.nextInt());
	}
}
