package com.demo;

import com.demo.multipleton.Multipleton;

/**
 * �ͻ���Ӧ�ó���
 * 
 * @author
 * 
 */
public class MultipletonClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ���Multipleton����ʵ��
		Multipleton multipleton = Multipleton.getRandomInstance();
		System.out.println("multipleton:" + multipleton.getNo());
		// �ڴλ��Multipleton����ʵ��
		Multipleton multipleton2 = Multipleton.getRandomInstance();
		System.out.println("multipleton2:" + multipleton2.getNo());
		// �Ƚ����������Ƿ���ͬһ������ʵ��
		if (multipleton == multipleton2) {
			System.out.println("--����ͬһ������");
		} else {
			System.out.println("--���ǲ�ͬ�Ķ���");
		}
	}
}
