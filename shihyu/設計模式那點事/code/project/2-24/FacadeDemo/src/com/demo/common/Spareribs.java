package com.demo.common;

/**
 * 
 * �Ǵ��Ź�ʵ����
 * 
 * @author
 * 
 */
public class Spareribs implements ISpareribs {
	// ׼������
	@Override
	public void prepair() {
		System.out.println("1.׼�����Ź�500�ˣ���ĩ����ĩ�����͡������͡����ǡ��ס��Ͼơ��θ�����...");
	}

	// �����Ź�
	@Override
	public void preserve() {
		System.out.println("2.���Ź�ϴ�����3���׳��Σ��ÿ�ˮ��һ�£��̳������ڣ������Ρ���������ζ...");
	}

	// ը�Ź�
	@Override
	public void fry() {
		System.out.println("3.����ע�����������ȣ����Ź�ը������ɫ�̳������¼������˳ɣ����¹�ը�����ɫ�̳�...");
	}

	// ��֭
	@Override
	public void juice() {
		System.out
				.println("4.���������������ȣ�����л�����ĩ���㣬����������ˮ�����͡��ס����ǡ��Ͼơ������Źǣ��տ���������������֭Ũ���Ź��죬�������ͣ���������!");

	}

}
