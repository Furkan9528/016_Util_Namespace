package com.furkankara;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		Personel personel = context.getBean("BeanPersonel2",Personel.class);
		
		System.out.println(personel);
		
		Sehir sehir = context.getBean("BeanSehir",Sehir.class);
		System.out.println(sehir);
		
		
		
	}
}