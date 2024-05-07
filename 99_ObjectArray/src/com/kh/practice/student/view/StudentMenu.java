package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;
//사용자의 입장에서 바라보는 컴퓨터
public class StudentMenu {

	private StudentController ssm = new StudentController();
	
//메서드
	//기본생성자
	public StudentMenu() {
		
	}
	
	//void 학생정보와 성적결과 출력하는 메서드
	public void printStudentMenu() {
		System.out.println("학생이름    과목       점수");
		System.out.println("--------------------------");
		
		//for-each
		//String으로 했다면 학생의 이름 or 과목 or 점수 중 하나만
		//Student로 하면 이름과 과목과 점수를 모두 가지고 오겠다는 의미
		//Student는 배열로 되어있으니까
		for(Student student : ssm.printStudent()) {
			System.out.println(student.inform());
		}
		
		System.out.println("--------------------------");
		System.out.println("총점 : " + ssm.sumScore()); //ssm.avgScore()[0] = ssm.sumScore()
		System.out.printf("평균 : %.2f\n", ssm.avgScore()[1]);
		System.out.println("합격여부 : " + (ssm.avgScore()[1] >= StudentController.CUT_LINE));
		
		ssm.printPass();
		
		/*
		 boolean을 써서 true인지 false인지를 한적이 없는데
		 왜 true 와 false가 보여집니까 ?
		 		학생들의 평균 >= 합격커트라인
		 		부등호는 true인지 false인지 구분만 하기 위한 존재
		 		
		 
		 */
		
	}
	
}
