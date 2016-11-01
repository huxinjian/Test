package com.niit.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Test0 {
	
	
	public void result(int a, int b){
		
		System.out.println("result结果是 "+(a+b));
	}
	
	
	
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException{
    	
    	String str="This is just a tet String";
    	String[] aa=str.split(" ");
    	System.out.println(aa.length);
    	//反射1
    	Class a=Class.forName("com.niit.test.Test0");
    	//反射2
    	Test0 t=new Test0();
    	Class b=t.getClass();
    	//反射3
    	Class c=Test0.class;
    	
    	
    	//通过反射创建对象
    	Test0 test0=(Test0) c.newInstance();
    	//通过反射获取方法
    	Method[] ms=c.getDeclaredMethods();
    	for(Method s:ms){
    		
    		System.out.println("======"+s);
    	}
    	//方法反射,通过方法操作对象
         Method m= c.getMethod("result", int.class,int.class);
         try {
        	 //要操作的对象
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
      