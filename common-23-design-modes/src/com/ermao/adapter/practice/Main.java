package com.ermao.adapter.practice;

import java.io.IOException;

/**
 * @author Ermao
 * Date: 2021/10/12 15:14
 */
public class Main {
	public static void main(String[] args) {
		FileIO f = new FileProperties();
		try {
			f.readFromFile("common-23-design-modes/src/com/ermao/adapter/practice/file.txt");
			f.setValue("year", "2021");
			f.setValue("month", "10");
			f.setValue("day", "12");
			f.writeToFile("common-23-design-modes/src/com/ermao/adapter/practice/new-file.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
