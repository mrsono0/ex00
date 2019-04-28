package pusanit.bigdata.consoleapp;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.stereotype.Service;

@Service
public class CMServiceWeb implements CMService {
	public String run(String conf) {
		return conf;
	}

	public ArrayList<Customer> insertCustomerData(ArrayList<Customer> custList, Customer cust) {
		CMDAO3 cmdao = new CMDAO3();
		return cmdao.insertCustomerData(custList, cust);
	}
	public ArrayList<Customer> updateCustomerData(ArrayList<Customer> custList, Customer cust, int index, int count) {
		CMDAO3 cmdao = new CMDAO3();
		System.out.println("데이터를 수정합니다.");
		if ((index >= 0) && (index < count)) {
			System.out.println(index + "번째 데이터를 수정합니다.");
			custList = cmdao.updateCustomerData(custList, cust, index);
		} else {
			System.out.println("수정할 데이터가 선택되지 않았습니다.");
		}
		return custList;
	}
	public ArrayList<Customer> deleteCustomerData(ArrayList<Customer> custList, int index, int count) {
		CMDAO3 cmdao = new CMDAO3();
		System.out.println("데이터를 삭제합니다.");
		if ((index >= 0) && (index < count)) {
			System.out.println(index + "번째 데이터를 삭제합니다.");
			custList = cmdao.deleteCustomerData(custList, index);
		} else {
			System.out.println("삭제할 데이터가 선택되지 않았습니다.");
		}
		return custList;
	}
	public int printPCustomerData(ArrayList<Customer> custList, int index) {
		CMDAO3 cmdao = new CMDAO3();
		System.out.println("이전 데이터를 출력합니다.");
		if (index <= 0) {
			System.out.println("이전 데이터가 존재하지 않습니다.");
		} else {
			index--;
			cmdao.printCustomerData(custList, index);
		}
		return index;
	}
	public int printNCustomerData(ArrayList<Customer> custList, int index, int count) {
		CMDAO3 cmdao = new CMDAO3();
		System.out.println("다음 데이터를 출력합니다.");
		if (index >= count - 1) {
			System.out.println("다음 데이터가 존재하지 않습니다.");
		} else {
			index++;
			cmdao.printCustomerData(custList, index);
		}
		return index;
	}
	public void printCustomerData(ArrayList<Customer> custList, int index, int count) {
		CMDAO3 cmdao = new CMDAO3();
		System.out.println("현재 데이터를 출력합니다.");
		if ((index >= 0) && (index < count)) {
			cmdao.printCustomerData(custList, index);
		} else {
			System.out.println("출력할 데이터가 선택되지 않았습니다.");
		}
	}
	public void quitSystem(Scanner scan) {
		System.out.println("프로그램을 종료합니다.");
		scan.close(); // Scanner 객체를 닫아준다.
		System.exit(0); // 프로그램을 종료시킨다.
	}
}
