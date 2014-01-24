package com.factorymodel.cn;
/**
 * 第一个实现工厂方法的类
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
