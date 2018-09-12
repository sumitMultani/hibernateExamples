package com.example.singleton;

import java.io.Serializable;

public class DateUtil implements Serializable, Cloneable {

	// 3. static member of the same class type
	private static volatile DateUtil dateUtil = new DateUtil();

	// 1. constructor of the class as private
	private DateUtil() {

	}

	// 2. factory method
	public static DateUtil getObject() {
		if (dateUtil == null) {
			synchronized (DateUtil.class) {
				if (dateUtil == null)
					dateUtil = new DateUtil();
			}
		}
		return dateUtil;
	}

	protected Object readResolve() {
		return dateUtil;
	}

	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
