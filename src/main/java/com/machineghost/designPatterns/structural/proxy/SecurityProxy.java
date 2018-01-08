package com.machineghost.designPatterns.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Proxy pattern. This class represents the Proxy class.
 * In this example, the proxy adds a layer of security when interacting with sensitive objects.
 * @author S. Stone-Loveall
 *
 */
public class SecurityProxy implements InvocationHandler {
	private Object obj;
	
	private SecurityProxy(Object obj) {
		this.obj = obj;
	}
	
	public static Object newInstance(Object obj) {
	    return java.lang.reflect.Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj
	            .getClass().getInterfaces(), new SecurityProxy(obj));
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
	    Object result;
	    try {
	    		printMethodName(method);
	    		if (!validateAuthenticatedCaller(method)) {
	    			throw new IllegalAccessException("Illegal request.");
	    		}
	    		else {
	    			result = method.invoke(obj, args);
	    		}
	    	} 
	    catch (InvocationTargetException e) {
	        throw e.getTargetException(); 
	    } 
	    catch (Exception e) {
	        throw new RuntimeException(e.getMessage());
	    }
	    return result;
	}
	
	private void printMethodName(Method method) {
		// for illustration of proxy pattern, print method name for each call
		System.out.println("SecurityProxy invocation: " + method.getName());
	}
	
	private boolean validateAuthenticatedCaller(Method method) {
		boolean isAllowed = true;
		
		if (method.getName().contains("makePayment") && !checkPaymentAllowed()) {
			isAllowed = false;
		}
		return isAllowed;
	}
	
	private boolean checkPaymentAllowed() {
		// stub 
		return true;
	}
}
