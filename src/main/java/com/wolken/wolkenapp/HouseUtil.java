package com.wolken.wolkenapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolken.wolkenapp.bean.HouseBean;

public class HouseUtil {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("context.xml");
		HouseBean bean=applicationContext.getBean(HouseBean.class);
		System.out.println(bean.getName());
		System.out.println(bean.getAddress());
		System.out.println(bean.getDoorNo());
		System.out.println(bean.getStreetName());
		
	}

}
