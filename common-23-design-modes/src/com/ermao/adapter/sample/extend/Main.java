package com.ermao.adapter.sample.extend;

/**
 * @author Ermao
 * Date: 2021/10/10 16:00
 */
public class Main {
	public static void main(String[] args) {
		Print p = new PrintBanner("Hello");
		p.printWeak();
		p.printStrong();
	}
}
