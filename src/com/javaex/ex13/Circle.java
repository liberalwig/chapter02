//Done_2021.11.29(월)13:53수업, Done_2021.12.16(목)07:58

package com.javaex.ex13;

public class Circle {
	// 필드
	private String lineColor;
	private String fillColor;
	private int radius;

	// 생성자
	public Circle() {
	}

	public Circle(String lineColor, String fillColor, int radius) {
		this.lineColor = lineColor;
		this.fillColor = fillColor;
		this.radius = radius;
	}

	// 메소드gs
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

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	// 메소드 일반
	@Override
	public String toString() {
		return "Circle [lineColor=" + lineColor + ", fillColor=" + fillColor + ", radius=" + radius + "]";
	}

	public void draw() {
		System.out.println("선색:" + lineColor + " 면색:" + fillColor + " 반지름:" + radius + "인 원을 그렸습니다.");
	}

}
