package sec07.exam02_method;

import java.io.UnsupportedEncodingException;

public class StringGetByteExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "�ȳ��ϼ���";
		
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.lenght : " + bytes1.length);
		String str1 = new String (bytes1);
		System.out.println("bytes1->String : " + str1);
		System.out.println("bytes1->String : " + bytes1);
		System.out.println();

		try {
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.lenght : " + bytes2.length);
			String str2 = new String (bytes2, "EUC-KR");
			System.out.println("bytes2->String : " + str2);
			System.out.println();
			
			byte[] bytes3 = str.getBytes("UTF-8");   //���ڵ�
			System.out.println("bytes3.lenght : " + bytes3.length);
			String str3 = new String (bytes3, "UTF-8");   // ���ڵ�
		//	String str3 = new String (bytes3 );   // ���ڵ�
			System.out.println("bytes3->String : " + str3);
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
	}

}
