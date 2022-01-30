package com.springbook.ioc.injection;

import java.util.Map;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");
		
		Map<String, String> addressList = bean.getAddressList();		
		
		for( String key : addressList.keySet() ){
            System.out.println( String.format("Å° : %s, °ª : %s", key, addressList.get(key)) );
        }
		
		factory.close();
	}
}
