package com.ermao.adapter.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 这个类代表适配器，注意它的命名方式
 * @author Ermao
 * Date: 2021/10/12 15:08
 */
public class FileProperties implements FileIO {

	private Properties properties;
	private String comments;

	public FileProperties() {
		this.properties = new Properties();
		comments = "written by FileProperties";
	}

	@Override
	public void readFromFile(String fileName) throws IOException {
		properties.load(new FileInputStream(fileName));
	}

	@Override
	public void writeToFile(String fileName) throws IOException {
		properties.store(new FileOutputStream(fileName), comments);
	}

	@Override
	public void setValue(String key, String value) {
		properties.setProperty(key, value);
	}

	@Override
	public String getValue(String key) {
		return properties.getProperty(key);
	}
}
