package sec02.exam01_createthread;

import java.awt.Toolkit;

<<<<<<< HEAD
=======
// Runnable �������̽��� ���� Ŭ����
>>>>>>> refs/remotes/origin/master
public class BeepTask implements Runnable {	
	public void run() {		
		Toolkit toolkit = Toolkit.getDefaultToolkit();	
		for(int i=0; i<5; i++) {		
			toolkit.beep();
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}

