package com.factorymodel.cn;
/**
 * ��һ��ʵ�ֹ�����������
 * @author richardzhou
 *
 */
public class FactoryModelGetServerClass1 implements  FactoryModelGetServer{

	@Override
	public FactoryModelServer getFactoryModelServer1() {
		// TODO Auto-generated method stub
		return new FactoryModelServerClass1();
	}
}
