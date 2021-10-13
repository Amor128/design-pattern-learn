package com.ermao.iterator.sample.salary_system.common;

/**
 * 已有的工资描述模型对象
 * @author Ermao
 * Date: 2021/10/13 20:14
 */
public class PayModel {

	private String employeeName;	// 受薪人姓名
	private double pay;	// 受薪金额

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	@Override
	public String toString() {
		return "PayModel{" +
				"employeeName='" + employeeName + '\'' +
				", pay=" + pay +
				'}';
	}
}
