package com.ermao.adapter.sample.extend;

/**
 * @author Ermao
 * Date: 2021/10/10 15:58
 */
public class PrintBanner extends Banner implements Print {

	public PrintBanner(String str) {
		super(str);
	}

	@Override
	public void printWeak() {
		showWithParen();
	}

	@Override
	public void printStrong() {
		showWithAster();
	}
}
