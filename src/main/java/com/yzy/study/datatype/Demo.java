package com.yzy.study.datatype;

import java.util.Arrays;

public class Demo {
	public static void main(String[] args) {
		Long sellerAddressId[] = { 393L };
		if (Arrays.asList(sellerAddressId).contains(393L)) {
			System.out.println("contains true");
		}

	}
}
