package com.ermao.adapter.practice;

import java.io.IOException;

/**
 * 这个接口标识了要适配的目标
 * @author Ermao
 * Date: 2021/10/12 15:05
 */
public interface FileIO {
	void readFromFile(String fileName) throws IOException;
	void writeToFile(String fileName) throws IOException;
	void setValue(String key, String value);
	String getValue(String key);
}
