package com.ashokit.designpattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		SingletonDesignPattren s1= SingletonDesignPattren.getInstance();
		SingletonDesignPattren s2= SingletonDesignPattren.getInstance();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		
		//will breake the singtone pattern
		//serilizable
		//implement serilbale interfcae
		//writeobject --> writeObject , readObject
		
		//write object using writrObject
//		FileOutputStream f= new FileOutputStream("/Users/vilasjadhav/Desktop/MacBookAir/Java/newmicroservices/CollectionExample/src/com/ashokit/designpattern/test.txt");
//		ObjectOutputStream o = new ObjectOutputStream(f);
//		o.writeObject(o);
		
		//read file 
//		FileInputStream f1= new FileInputStream("/Users/vilasjadhav/Desktop/MacBookAir/Java/newmicroservices/CollectionExample/src/com/ashokit/designpattern/test.txt");
//		ObjectInputStream o1= new ObjectInputStream(f1);
//		SingletonDesignPattren s4=(SingletonDesignPattren)o1.readObject();
//		System.out.println(s4.name);
//		System.out.println(s4.hashCode());
		
		//Reflect ion have private classes
		
//		Constructor<SingletonDesignPattren> t=SingletonDesignPattren.class.getDeclaredConstructor();
//		t.setAccessible(true);
//		SingletonDesignPattren s4=(SingletonDesignPattren)t.newInstance();
//		System.out.println(s4.hashCode());
		
		//cloning the design pattern
		SingletonDesignPattren s5= (SingletonDesignPattren)s2.clone();
		System.out.println(s5.hashCode());
		
		
	}

}
