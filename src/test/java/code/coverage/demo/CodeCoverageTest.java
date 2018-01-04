package code.coverage.demo;
import code.coverage.demo.*;

import org.junit.Test;
import org.junit.Assert;

@SuppressWarnings("deprecation")
public class CodeCoverageTest {
	
	@Test
	public void test1(){
		Assert.assertEquals(CodeCoverage.start(),"start");
	}
	@Test
	public void test2(){
		Assert.assertEquals(CodeCoverage.stop(),"stop");
	}

}
