package com.spring.entity;


public class ProductStatistic {
	private int month;
	private String type;
	private String style;
	private Long totalSell;
	
	public Long getTotalSell() {
		return totalSell;
	}

	public void setTotalSell(Long totalSell) {
		this.totalSell = totalSell;
	}

	public ProductStatistic() {
		
	}

	public ProductStatistic(int month, String type, String style, Long totalSell) {
		super();
		this.month = month;
		this.type = type;
		this.style = style;
		this.totalSell = totalSell;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}
	
}
