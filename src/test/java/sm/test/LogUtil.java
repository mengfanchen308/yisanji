package sm.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class LogUtil {
	public static Logger logger = LoggerFactory.getLogger(LogUtil.class.getName());
	 
	 public static void debug(String msg) {
	  logger.debug(msg);
	 }
	 public static void info(String msg) {
	  logger.info(msg);
	 }
	 public static void warn(String msg) {
	  logger.warn(msg);
	 }
	 public static void error(String msg) {
	  logger.error(msg);
	 }
	 /**
	  * @param args
	  */
	 public static void main(String[] args) {
	  System.out.println("syso");
	  LogUtil.debug("log4j is start .");
	  LogUtil.info("log4j is start .");
	  LogUtil.warn("log4j is start .");
	  LogUtil.error("log4j is start .");
	  System.out.println("syso");
	 }

}
