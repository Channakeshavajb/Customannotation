package com.madhu.customAntn.tester;

import java.lang.annotation.Annotation;

import com.madhu.customAntn.annotation.SmartPhone;
import com.madhu.customAntn.model.NokiaSeries;

public class AnnotationDemoTest {
	
	public static void main(String[] args) {
		
		NokiaSeries n=new NokiaSeries("nokiaEseries", 5);
		System.out.println(n.getClass().getSimpleName());
		System.out.println(n.model);
		
		
		
		  Class c=n.getClass(); System.out.println(c);
		  
		  Annotation an=c.getAnnotation(SmartPhone.class); System.out.println(an);
		  
		  SmartPhone s=(SmartPhone)an; System.out.println(s);
		 
		  System.out.println(s.os());
	}

}

