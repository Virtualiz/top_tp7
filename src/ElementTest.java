import static org.junit.Assert.*;

import org.junit.Test;

public class ElementTest {

	@Test
	public void testConstructor() {		
		Element elm = new Element('L');
		assertTrue(elm.getChar() == 'L');
	}

}
