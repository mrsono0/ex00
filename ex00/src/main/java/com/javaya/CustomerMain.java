package com.javaya;
import com.javaya.controller.CustomerController;
import com.javaya.service.CustomerService;
import com.javaya.service.ICustomerService;

/************************************************************
 * 시스템 명 : 
 * 업무명 :
 * 프로그램명(ID) :
 * 프로그램 설명 :
 * 
 * 작성일 : 2018. 7. 5.
 * 작성자 : "Baniota"
 *
 * 수정자     수정일자     수정내역
 * ------    ----------    ---------------------------------
 * "Baniota"    2018. 7. 5.    최초 생성
 *
 ************************************************************/

/**
 * CustomerMain.java
 * @author "Baniota"
 */
public class CustomerMain {
	public static void main(String[] args) {
		ICustomerService custService = new CustomerService();
		CustomerController custController = new CustomerController();
		
		custController.setCustomerService(custService);
		custController.run("javaya");
	}
}
