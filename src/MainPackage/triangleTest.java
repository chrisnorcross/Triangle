package MainPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class triangleTest {
	Triangle t;

	@Before
	public void setUp() throws Exception {
		t = new Triangle(3,4,5);
	}

	@After
	public void tearDown() throws Exception {
		t = null;
	}

	@Test
	public void areaTest() {
		assertTrue("Area doesn't work",t.getArea() == 6.0);
	}
	@Test
	public void perimeterTest(){
		assertTrue("Perimeter doesn't work",t.getPerimeter() == 12);
	}

}
