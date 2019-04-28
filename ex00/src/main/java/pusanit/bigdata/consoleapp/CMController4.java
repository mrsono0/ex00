package pusanit.bigdata.consoleapp;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CMController4 {

	private static final Logger logger = LoggerFactory.getLogger(CMController4.class);
	private static CMServiceWeb cmservice = new CMServiceWeb();
	private static ArrayList<Customer> custList = new ArrayList<>();

	@RequestMapping(value = "/i", method = RequestMethod.GET)
	public String insertCustomer(Locale locale, Model model) {
		logger.info("registerForm");
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate);
		return "registerForm";
	}

	@RequestMapping(value = "/i", method = RequestMethod.POST)
	public String insertCustomer(String name, String gender, String email, int birthYear, Locale locale, Model model) {
		logger.info("Input DATA : name = " + name + ", gender = " + gender);
		Customer cust = new Customer();
		custList = cmservice.insertCustomerData(custList, cust);
		model.addAttribute("custList", custList);
		return "list";
	}
}
