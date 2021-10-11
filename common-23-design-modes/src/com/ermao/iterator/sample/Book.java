package com.ermao.iterator.sample;

/**
 * 表示书的类
 * @author Ermao
 * Date: 2021/10/10 14:35
 */
public class Book {
	private String name;

	public Book(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Book{" +
				"name='" + name + '\'' +
				'}';
	}
}
