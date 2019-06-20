package com.test.junit;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
public class FineTest {

	Fine fine;
	@Before
	void setUp() throws Exception {
		fine=new Fine();
	}
	@Test
	public void testTotalFine()
	{
		Library lib1 = new Library("Kohli",55);
		fine.setFine(lib1);
		LibraryInterface l = mock(LibraryInterface.class);
		fine.setLib(l);
		
		when(l.delayDays(lib1)).thenReturn(15);
		assertEquals(180, fine.totalFine(lib1));
	}
}