package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {

	//5개가 들어갈 배열 만들어주는데 학생으로 만들어주세요
	private Student[] sArr = new Student[5];
	public static final int CUT_LINE = 60; //상수:대문자
	
	//기본생성자
	public StudentController() {
		//0~4번째 학생까지 값을 넣어주기
		sArr[0] = new Student("김길동", "자바", 100);
		sArr[1] = new Student("박길동", "디비", 50);
		sArr[2] = new Student("이길동", "화면", 85);
		sArr[3] = new Student("정길동", "서버", 60);
		sArr[4] = new Student("홍길동", "자바", 20);
	}
	
	//반환메서드
	public Student[] printStudent() {
		return sArr;
	}
	//학생들의 점수를 모두 더해서 총점 계산
	public int sumScore() {
		int sum=0;
		for(Student s : sArr) {
			sum+=s.getScore();
		}
		//마지막으로 총합을 sumScore을 부른다면 내가 가진 점수를 보여주겠다
		return sum;
	}
	
	//총점을 받아서 평균 구하기
	public double[] avgScore() {
		double[] avgArr = new double[2];
		avgArr[0] = sumScore(); //위에서 만든 모든 학생의 총점 더한값을 저장하는 공간1
		avgArr[1] = avgArr[0] / sArr.length; // 평균= 총점/총점학생수
		return avgArr;
	}
	/*배열 사용하지 않고 평균 구하기
	public double avgScore2() {
		double avgArr = sumScore();
		return avgArr;
	}
	*/
	
	//각 학생의 합격여부를 확인하고 출력하는 메서드
	public void printPass() {
		for(Student s : sArr) {
			s.setPassed(s.getScore() >= CUT_LINE);
			System.out.println(s.getName() + " 학생은 " + (s.isPassed() ? "통과" : "불합격") + "입니다.");
		}
		
	}

}
