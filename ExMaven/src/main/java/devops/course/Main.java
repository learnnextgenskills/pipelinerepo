package devops.course;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

	private static final Logger log = LogManager.getLogger(Main.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Customer c = new Customer(11, "Bob Hope");
		String s = ToStringBuilder.reflectionToString(c);
		
		log.info(s);
	}

}
