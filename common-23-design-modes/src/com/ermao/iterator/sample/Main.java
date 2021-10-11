package com.ermao.iterator.sample;

/**
 * 测试类
 * 目标：客户端里面看不出存储结构是数组！
 * 后续无论如何修改数据存储的实现，客户端都不感知
 * @author Ermao
 * Date: 2021/10/10 14:47
 */
public class Main {
	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(10);
		bookShelf.appendBook(new Book("1"));
		bookShelf.appendBook(new Book("2"));
		bookShelf.appendBook(new Book("3"));
		bookShelf.appendBook(new Book("4"));

		Iterator iterator = bookShelf.iterator();
		while (iterator.hasNext()) {
			Book book = (Book) iterator.next();
			System.out.println(book.getName());
		}
	}
}
