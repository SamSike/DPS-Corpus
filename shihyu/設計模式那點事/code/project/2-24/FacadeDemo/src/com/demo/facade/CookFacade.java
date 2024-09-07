package com.demo.facade;

import com.demo.common.ISpareribs;
import com.demo.common.Spareribs;

/**
 * ���^ģʽ�����Ǵ��Ź�
 * 
 * @author
 * 
 */
public class CookFacade implements ICookFacade {
	// �Ǵ��Ź��Źǽӿ�
	private final ISpareribs spareribs = new Spareribs();

	// ���Ǵ��Ź�
	public void cookSpareribs() {
		// ׼������
		this.spareribs.prepair();
		// �����Ź�
		this.spareribs.preserve();
		// ը�Ź�
		this.spareribs.fry();
		// ��֭
		this.spareribs.juice();
	}
}
