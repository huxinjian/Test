package com.niit.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Test0 {
	
	
	public void result(int a, int b){
		
		System.out.println("result����� "+(a+b));
	}
	
	
	
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException{
    	
    	String str="This is just a tet String";
    	String[] aa=str.split(" ");
    	System.out.println(aa.length);
    	//����1
    	Class a=Class.forName("com.niit.test.Test0");
    	//����2
    	Test0 t=new Test0();
    	Class b=t.getClass();
    	//����3
    	Class c=Test0.class;
    	
    	
    	//ͨ�����䴴������
    	Test0 test0=(Test0) c.newInstance();
    	//ͨ�������ȡ����
    	Method[] ms=c.getDeclaredMethods();
    	for(Method s:ms){
    		
    		System.out.println("======"+s);
    	}
    	//��������,ͨ��������������
         Method m= c.getMethod("result", int.class,int.class);
         try {
        	 //Ҫ�����Ķ���
			m.invoke(test0, 10,10);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
         
          
          List<String> list=new ArrayList<String>();
          //list.add(1);
     	  Class lista=list.getClass();
     	  Method listMethod=lista.getMethod("add",Object.class);
     	  listMethod.invoke(list, 1);
     	  
     	  //System.out.println(list);
    	
    	 System.out.println(a);
    	 System.out.println(b);
    	 System.out.println(c);
    }
    
 
}
      