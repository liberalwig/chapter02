//2021.11.30(화)14:50 오버라이딩, 2021.12.20(월)20:19 

package com.javaex.ex15;

public class Triangle extends Shape {

	// 필드
	private String lineColor;
	private String fillColor;
	private int width;
	private int height;

	// 생성자
	public Triangle() {
	}

	public Triangle(String lineColor, String fillColor, int width, int height) {
		super(lineColor, fillColor);
		this.width = width;
		this.height = height;
	}

	// 메소드 gs
	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	// 메소드 일반
	@Override
	public String toString() {
		return "Triangle [lineColor=" + lineColor + ", fillColor=" + fillColor + ", width=" + width + ", height="
				+ height + "]";
	}

	public void draw() {
		System.out.println("선색:" + lineColor + " 면색:" + fillColor + " 가로:" + width + " 세로:" + height + "인 삼각형입니다.");
	}

}
