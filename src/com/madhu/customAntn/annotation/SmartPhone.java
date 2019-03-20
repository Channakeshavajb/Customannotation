package com.madhu.customAntn.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Multi Value Annotation

@Inherited // its used to available in inherited classes also
@Documented // its use creates the documentation
@Target(ElementType.TYPE) // Its available in all type
@Retention(RetentionPolicy.RUNTIME) // Its available in runtime
public @interface SmartPhone {

	String os() default "Symbian";
	int version() default 1;
}



