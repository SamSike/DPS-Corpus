package com.demo;

import com.demo.singleton.Singleton;

/**
 * �ͻ���Ӧ�ó���
 * 
 * @author
 * 
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ���� �����Ƿ�����new����������Singleton����ʵ��
		Singleton singleton = Singleton.getInstance();
		// �ڴ˻��Singleton����ʵ��
		Singleton singleton2 = Singleton.getInstance();
		// �Ƚ����������Ƿ���ͬһ������ʵ��
		if (singleton == singleton2) {
			System.out.println("--����ͬһ������");
		} else {
			System.out.println("--���ǲ�ͬ�Ķ���");
		}
	}
}
