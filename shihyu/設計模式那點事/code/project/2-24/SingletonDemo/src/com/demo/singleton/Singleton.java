package com.demo.singleton;

/**
 * �������ģʽ
 * 
 * @author
 * 
 */
public class Singleton {

	// �๲��ʵ������ ʵ����
	private static Singleton singleton = new Singleton();

	// ˽�й��췽��
	private Singleton() {
		System.out.println("-- this is Singleton!!!");
	}

	// ��õ�������
	public static Singleton getInstance() {
		// ֱ�ӷ��ع������
		return singleton;
	}

}
