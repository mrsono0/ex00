package pusanit.bigdata.consoleapp;

import java.util.ArrayList;
import java.util.Scanner;

public interface CMService {
	String initMenu(ArrayList<Customer> custList, Scanner scan, int count, int index);
	ArrayList<Customer> insertCustomerData(ArrayList<Customer> custList, Scanner scan);
	int printPCustomerData(ArrayList<Customer> custList, int index, Scanner scan);
	int printNCustomerData(ArrayList<Customer> custList, int index, Scanner scan, int count);
	void printCustomerData(ArrayList<Customer> custList, int index, Scanner scan, int count);
	ArrayList<Customer> updateCustomerData(ArrayList<Customer> custList, int index, Scanner scan, int count);
	ArrayList<Customer> deleteCustomerData(ArrayList<Customer> custList, int index, int count);
	void quitSystem(Scanner scan);
}
