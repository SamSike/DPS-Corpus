package com.demo;

import com.demo.facade.CookFacade;
import com.demo.facade.ICookFacade;

/**
 * �ͻ���Ӧ�ó���
 * 
 * @author
 * 
 */
public class Client {
	public static void main(String[] args) {
		// ��ʼ���Ǵ��Ź��ˣ�
		System.out.println("==== ��ʼ���Ǵ��Ź�...");
		// // �����Ǵ��ŹǶ���ʵ��
		// ISpareribs spareribs = new Spareribs();
		// // ׼������
		// spareribs.prepair();
		// // �����Ź�
		// spareribs.preserve();
		// // ը�Ź�
		// spareribs.fry();
		// // ��֭
		// spareribs.juice();

		ICookFacade cookFacade = new CookFacade();
		cookFacade.cookSpareribs();
		System.out.println("==== �Ǵ��Ź�������ɣ�");
	}
}
