package com.javaex.ex11;//2021.11.26(금)10:47-16:30수업
/*
[문제]
Person 클래스를 만드세요.
	생성자, getter/setter, showInfo()

Person 클래스를 상속받아 Student 클래스를 만드세요.
	생성자, getter/setter, showInfo()

PersonApp 클래스를 통해서 인스턴스를 생성하고 showInfo()를 통해 확인하세요.
	Person p = new Person("정우성", 45);
	Student s1 = new Student("서울고등학교");
	Student s2 = new Student("이정재", 45, "한국고등학교" );

자식 클래스와 부모클래스의 생성자 순서를 확인하세요
*/
public class PersonApp {
	//필드
	
	//생성자
	
	//메소드:getter,setter
	
	//메소드 일반
	public static void main(String[] args) {
		
		Person p01 = new Person("정우성", 45);
		p01.showInfo();
		
		
		/*
		Person p01 = new Person("정우성", 45);
		p01.showInfo();
		
		
		Person p02 = new Person();//이 행이 디폴트 생성자.public Person() {}을 써주지 않아서 오류가 났었음
		p02.setName("이정재");
		p02.setAge(46);
		*/
		
		
		//System.out.println(p01.toString());//PersonApp 51행 출력
		//System.out.println(p02.toString());
		
		/*
		System.out.println(p02.toString());
		System.out.println(p02.toString());
		
		p01.showInfo();
		p02.showInfo();
		*/
		//System.out.println(p02.getAge());
		
		//Student Person상속받고 테스트
		Student s01 = new Student();
		s01.setName("강호동");
		s01.setAge(55);
		s01.setSchoolName("아형고등학교");
		
		System.out.println(s01.getName());
		System.out.println(s01.getAge());
		System.out.println(s01.getSchoolName());
		System.out.println("===============");
		
		Student s02 = new Student("서장훈", 50, "강남고등학교");
		System.out.println(s02.getName());
		s02.showInfo();
		s02.showInfo2();
		
		
		/*
		Student s02 = new Student("서장훈", 50, "강남고등학교");
		Student s03 = new Student("강남고등학교");
		*/
	}

}