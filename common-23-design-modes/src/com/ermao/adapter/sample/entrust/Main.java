package com.ermao.adapter.sample.entrust;

import com.ermao.adapter.sample.extend.Print;
import com.ermao.adapter.sample.extend.PrintBanner;

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
