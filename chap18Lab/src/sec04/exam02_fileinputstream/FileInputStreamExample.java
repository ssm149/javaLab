package sec04.exam02_fileinputstream;

import java.io.FileInputStream;

public class FileInputStreamExample {
	public static void main(String[] args) {
		try {
			//����Ʈ��� �Է½�Ʈ��
			FileInputStream fis = new FileInputStream("D:/02.download/java/chap18/src/sec04/exam02_fileinputstream/FileInputStreamExample.java");
			int data;
			while ( (data = fis.read() ) != -1 ) {
				System.out.write(data);
			}
			fis.close();	
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

