package com.raj.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.raj.spring.basics.springin5steps.xml.XmlPersonDAO;
import com.raj.spring.basics.springin5steps.xml.practice.EmployeeDAO;
import com.raj.spring.basics.springin5steps.xml.practice.PracticeXmlPersonDAO;

public class SpringIn5StepsXMLApplicationContextApplication {
  
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsXMLApplicationContextApplication.class);
	
	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml")) {
			LOGGER.info("Beans Name: ==> {}",(Object)applicationContext.getBeanDefinitionNames());
			
			XmlPersonDAO xmlPersonDAO = applicationContext.getBean(XmlPersonDAO.class);
			LOGGER.info("{}",xmlPersonDAO);
			LOGGER.info("{}",xmlPersonDAO.getXmlJdbcConnection());
			
			PracticeXmlPersonDAO practiceXmlPersonDAO = applicationContext.getBean(PracticeXmlPersonDAO.class);
			LOGGER.info("{}",practiceXmlPersonDAO);
			LOGGER.info("{}",practiceXmlPersonDAO.getPracticeXmlJdbcConnection());
			
			EmployeeDAO employeeDAO = applicationContext.getBean(EmployeeDAO.class);
			LOGGER.info("{}",employeeDAO);
			LOGGER.info("{}",employeeDAO.getEmployeeId());
		}
		
		

	}
}