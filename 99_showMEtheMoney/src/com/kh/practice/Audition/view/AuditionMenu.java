package com.kh.practice.Audition.view;

import com.kh.practice.Audition.controller.AuditionController;
import com.kh.practice.Audition.model.vo.Audition;

public class AuditionMenu {
	AuditionController ac = new AuditionController();
	
	public void printAuditionMenu() {
		System.out.println("학생이름   " + "장르   " +"점수");
		System.out.println("------------------------------");
		
		for(Audition a : ac.printAudition()) {
			a.inform();
		}
		
		System.out.println("--------------------------");
		System.out.println("총점 : " + ac.sumScore()); //ssm.avgScore()[0] = ssm.sumScore()
		System.out.printf("평균 : %.2f\n" , ac.avgScore()[1]);
		System.out.println("합격여부 : " + (ac.avgScore()[1] >= AuditionController.CUT_LINE));
		
		ac.printPass();
		
	}
	
}
