package src.c4h;


/**
 * Main Methode zum Starten von C4H.
 * @author  Helmi Bani, Arafet Benn Amor
 * @version 1.0
 * 
 * */
public class C4H_TEST {

	/** Startfunktion
	 * @param args Keine Argumente n&ouml;tig 
	 * @throws Throwable Gui-Start
	 */
	public static void main(String[] args) {	
		C4H_TEST_MODUL test = new C4H_TEST_MODUL();
		test.initialize();
		/*
		C4H_GUI_TRAY_ICON start=new C4H_GUI_TRAY_ICON();
		
		try {
			start.createshowGui();
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
	}

}
