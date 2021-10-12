package com.ermao.adapter.sample.entrust;

/**
 * @author Ermao
 * Date: 2021/10/10 16:25
 */
public class PrintBanner extends Print {

	private Banner banner;

	public PrintBanner(String str) {
		this.banner = new Banner(str);
	}

	@Override
	public void printWeak() {
		banner.showWithParen();
	}

	@Override
	public void printStrong() {
		banner.showWithAster();
	}
}
