package 异常;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

import javax.security.auth.login.LoginException;

public class LoggingExecption  extends Exception{
	private static Logger logger =
            Logger.getLogger("LoggingException");
	public LoggingExecption() {
		// TODO Auto-generated constructor stub
		StringWriter stringWriter = new StringWriter();
		printStackTrace(new PrintWriter(stringWriter));
		logger.severe(stringWriter.toString());
		
	}
	
	public static void main(String[] args) {
		try {
			throw new LoginException();
		} catch (LoginException e) {
			// TODO: handle exception
			System.err.print(e);
		}
		try {
			throw new LoginException();
		} catch (LoginException e) {
			// TODO: handle exception
			System.err.println("Caught " + e);
		}
	}
}
