package com.demo.interfaces;

import com.demo.beans.A;

public interface MyInterface <T extends A> {
	
	void display(T ob);
	
}
