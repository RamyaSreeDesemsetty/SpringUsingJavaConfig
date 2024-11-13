package com.capgemini.in.SpringUsingJavaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac = new AnnotationConfigApplicationContext(MyAppConfig.class);
    	MyColor color = ac.getBean("myColorBean", RedColor.class);
    	color.printColor();
    	MyColor colortwo = ac.getBean("myColorBeanBlue", BlueColor.class);
    	colortwo.printColor();
    }
}
