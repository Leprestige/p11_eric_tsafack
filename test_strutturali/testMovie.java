import static org.junit.Assert.*;

import org.junit.Test;
 // test classe Movie

public class testMovie {
	Movie nv = new Movie(1,"Snowden"," ","06/17","12:03",2.5);
	@Test
	public void testSetUpdateDetails() {
		nv.setUpdateDetails("un giovane ingegnerie met le CIA in dificoltà!");
		assertEquals(nv.getUpdateDetails(),"un giovane ingegnerie met le CIA in dificoltà!");
	}
	@Test
	public void testGetOra(){
		assertEquals(nv.getOra(),"12:03");
	}
	@Test
	public void testSetOra(){
		nv.setOra("11:00");
		assertEquals(nv.getOra(),"11:00");
	}
	@Test
	public void testGetGiorno(){
		assertEquals(nv.getGiorno(),"06/17");
	}
	@Test
	public void testSetGiorno(){
		nv.setGiorno("10/17");
		assertEquals(nv.getGiorno(),"10/17");
	}
	@Test
	public void testGetNameMovie(){
		assertEquals(nv.getNameMovie(),"Snowden");
	}
	@Test
	public void testSetMovie(){
		nv.setNameMovie("Batman");
		assertEquals(nv.getNameMovie(),"Batman");
	}
	
	@Test
	public void testSetPrezzo(){
		nv.setPrezzo(4.5);
		assertTrue(nv.getPrezzo() == 4.5);
	}
	@Test
	public void testGetIdMovie(){
		assertTrue(nv.getIdMovie() == 1);
	}
	@Test
	public void testSetIdMovie(){
		nv.setIdMovie(2);
		assertTrue(nv.getIdMovie()==2);
	}

}
