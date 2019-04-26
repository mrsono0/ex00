package pusanit.bigdata.consoleapp;

import java.util.ArrayList;

public class CMDAO3 {
	public ArrayList<Customer> insertCustomerData(ArrayList<Customer> custList, Customer cust) {
		// 고객 객체를 ArrayList에 저장
		custList.add(cust);
		return custList;
	}

	// 고객데이터 출력
	public void printCustomerData(ArrayList<Customer> custList, int index) {
		Customer cust = custList.get(index);
		System.out.println("==========CUSTOMER INFO================");
		System.out.println("이름 : " + cust.getName());
		System.out.println("성별 : " + cust.getGender());
		System.out.println("이메일 : " + cust.getEmail());
		System.out.println("출생년도 : " + cust.getBirthYear());
		System.out.println("=======================================");
	}

	// index 위치의 고객 정보를 수정합니다.
	public ArrayList<Customer> updateCustomerData(ArrayList<Customer> custList, Customer cust, int index) {
		custList.set(index, cust);
		return custList;

	}

	// index 위치의 고객정보를 삭제합니다.
	public  ArrayList<Customer> deleteCustomerData(ArrayList<Customer> custList, int index) {
		custList.remove(index);
		return custList;
	}
}
