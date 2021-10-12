package com.ermao.adapter.sample.extend;

/**
 * @author Ermao
 * Date: 2021/10/10 15:56
 */
public class Banner {
	private String str;

	public Banner(String str) {
		this.str = str;
	}

	public void showWithParen() {
		System.out.printf("(%s)\n", str);
	}

	public void showWithAster() {
		System.out.printf("*%s*\n", str);
	}
}
