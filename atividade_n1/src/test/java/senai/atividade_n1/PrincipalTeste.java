package senai.atividade_n1;

import java.text.SimpleDateFormat;
import java.util.Date;

import junit.framework.TestCase;

public class PrincipalTeste extends TestCase {

	Principal principal;

	protected void setUp() throws Exception {
		principal = new Principal();
		super.setUp();
	}

	public void testGetHorario() {
		SimpleDateFormat d = new SimpleDateFormat("HH:mm:ss.SSS");
		String time = d.format(new Date());

		assertEquals(time, principal.getHorario(), "00:00:00.100");
	}

}
