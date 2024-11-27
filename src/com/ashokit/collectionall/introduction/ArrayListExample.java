package com.ashokit.collectionall.introduction;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;


public class ArrayListExample {
	
	public static void main(String[] args) throws Exception {		
		
		int i=10;
		//ClassName ref variable=new className();
		ArrayList l= new ArrayList(5);//elementData
		//List l1= new ArrayList();//index=0
		l.add(10);//elementData[0]=10;//index=1
		l.add(40);//elementData[1]=40;//index=2
		l.add(50);//elementData[2]=50;//index=3
		l.add(60);//elementData[3]=60;//index=4
		l.add(70);//elementData[4]=70;//index=5
		l.add(80);//elementData[5]=70;//index=6
		l.add(80);//elementData[6]=70;//index=7
		l.add(80);
		l.remove(new Integer(80));
		System.out.println(l.remove(3));//60
		System.out.println(l);//[10,40,50,60]
		System.out.println(l.size());
		//System.out.println(l.get(-1));//50
		//java.util.ArrayList@8988UI0
		
		CustomArrayList cl= new CustomArrayList(3);
		cl.add(10);//a[0]=10->index=1
		cl.add(20);//a[1]=20->index=2
		cl.add(30);//a[2]=30->index=3
		cl.add(40);//a[3]=40->index=4
		cl.add(20);//a[4]=50->index=5
		cl.add(60);
		/*
		 * cl.add(60);//2 cl.add(70);//2 cl.add(80);//2
		 */		//cl.add(90);//2
		//cl.add(100);//2
		System.out.println(cl);
		//System.out.println(cl.remove(4));
		cl.add(60);
		System.out.println(cl);
		System.out.println(cl.get(2));;
		Employee e= new Employee();
		System.out.println(e);
		System.out.println(cl.size());


		List<Integer>  a= new ArrayList<>();

		for (int j = 0; j <10;  j++) {
			a.add(j);
		}

		System.out.println(a);
		a.remove(2);
		System.out.println(a);

		System.out.println(a.get(3));
		a.add(a.get(2),34);
		System.out.println(a);
		a.remove(4);
		System.out.println(a);
		a.add(null);
		System.out.println(a);


		 //in java 8 add 1 to 10 in list
//		List<Integer> a = new ArrayList<>();
//		IntStream.range(0, 10).forEach(a::add); // Add elements 0 to 9
//		System.out.println(a);







	}

}
