package com.gmail.yeatz0408.javaBasics;

import static java.lang.Math.min;
import static java.lang.Math.abs;
import static java.lang.Math.PI;
import static java.lang.System.*;
import static com.gmail.yeatz0408.javaBasics.StaticImportConfig.*;

public class StaticImport {
	
	public static void main(String[] args) {
		
		abs(-32233);
		min(30, 23);
		out.println(PI);
		
		System.out.println(name);
		sayHi();
		
	}

}
