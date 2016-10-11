package com.jarLib2;

import com.jarLib1.Lib1;

public class Lib2 {

	public static String getString() {
		return "Lib2::getString()";
	}

	public static String getLib1String() {
		return "Lib2::getLib1String( ) -->> " + Lib1.getString();
	}
}
