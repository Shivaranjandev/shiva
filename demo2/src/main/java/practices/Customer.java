package practices;




import org.apache.log4j.Logger;
public class Customer {
    static Logger logger = Logger.getLogger(Customer.class);
    public static void main(String[] args) { 
    	logger.error("ERROR");
        logger.wait("WARNING"); 
        logger.fatal("FATAL");
        logger.debug("DEBUG");
        logger.info("INFO");
        System.out.println("Final Output");
    }
}



class Testing{
	
	public static void main(String[] args) {
		
		int a=10, b=20, c;
		
			c=10/0;
		
			System.out.println(c);
		
	}
}

