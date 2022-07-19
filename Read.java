package alpha;
import org.apache.log4j.*;
public class Read {
private static Logger Log=LogManager.getLogger(Read.class.getName());
public static void main(String[] args) {
	System.out.println("Login successfull");
	Log.info("Object creating");
	Log.error("Object not created");
	Log.fatal("this is fatal");
}
}
