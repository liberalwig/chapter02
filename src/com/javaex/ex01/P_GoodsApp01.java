package com.javaex.ex01;//2021.11.25(목)18:55
/*
[문제]
쇼핑몰에서 상품을 관리하기 위해 상품관리 프로그램을 만들려고 합니다. 프로그램을 만들기 전에 업무(비즈니스) 분석을 통해 상품 객체를 분석하고 다음과 같은 Goods클래스를 정의 하였습니다. 

Goods 클래스를 정의하고 GoodsApp 클래스에서  Goods 클래스를 테스트 하세요.
  1) Goods 객체를 하나 생성하고 이 객체에 대한 레퍼런스 변수를 camera 로 합니다.
  2) 이 객체의 데이터인 각 각의 인스턴스 변수는 다음과 같은 값을 가지도록 합니다.
     상품이름 : “nikon”,   가격: 400000
  3) 값을 세팅 한 후,  객체의 데이터를 출력해 보세요.
 */
public class P_GoodsApp01 {

	public static void main(String[] args) {
		
		Goods camera = new Goods();
		camera.name = "니콘";
		camera.price = 400000;
		
		System.out.println(camera.name);
		System.out.println(camera.price);

	}

}