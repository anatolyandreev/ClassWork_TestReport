package by.htp.test;
import static org.testng.Assert.assertNotNull;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class TestClass {
	
	private static Logger logger = LogManager.getLogger();

	@Test
	public void test1(){
		List<String> list = null;
		assertNotNull(list);
		
	}
	
	
}
