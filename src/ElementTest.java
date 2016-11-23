import static org.junit.Assert.*;

import org.junit.Test;

public class ElementTest {

	@Test
	public void testConstructor() {		
		Element elm = new Element('L');
		assertTrue(elm.getChar() == 'L');
	}
	
	@Test
	public void testNext() {		
		Element elm = new Element('A');
		Element elm2 = new Element('B');
		elm.addNext(elm2);
		assertTrue(elm.getNext().getChar() == 'B');
	}
	
	@Test
	public void testNotNext() {		
		Element elm = new Element('A');
		assertTrue(!elm.hasNext());
	}
	
	@Test
	public void testYesNext() {		
		Element elm = new Element('A');
		Element elm2 = new Element('B');
		elm.addNext(elm2);
		assertTrue(elm.hasNext());
	}
	
	@Test
	public void testEquals1() {		
		Element elm = new Element('A');
		Element elm2 = new Element('B');
		assertTrue(!elm.equals(elm2));
	}
	
	@Test
	public void testEquals2() {		
		Element elm = new Element('A');
		Element elm2 = new Element('A');
		assertTrue(elm.equals(elm2));
	}
	
	@Test
	public void testEquals3() {		
		Element elm = new Element('A');
		Element elm2 = new Element('A');
		Element elm3 = new Element('B');
		elm.addNext(elm3);
		assertTrue(elm.equals(elm2));
	}
	
	@Test
	public void testEquals4() {		
		Element elm = new Element('A');
		Element elm2 = new Element('A');
		Element elm3 = new Element('B');
		elm.addNext(elm3);
		elm2.addNext(elm3);
		assertTrue(elm.equals(elm2));
	}

}
