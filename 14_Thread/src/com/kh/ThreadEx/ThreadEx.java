package com.kh.ThreadEx;
/*
 process : program + success = 프로그램 실행 성공! 그말은 프로그램 실행중
 
 Thread(스레드) :실
 스레드는 컴퓨터에서 실제로 작업을 수행하는 것을 의미
 
 두 개 이상의 스레드를 가지는 프로세스를 멀티스레드라고 함
 
 스레드를 생성하는 방법
 1. Runnable 인터페이스 사용, 작성- 클래스명 옆에 implements Runnable
 
 2. Thread 클래스 상속받기, 작성- 클래스명 옆에 extends Thread
 	메서드와 관계없이 스레드를 시작할때는 start() 사용해야지 시작할 수 있음
 	스레드에서 순서는 스레드가 컴퓨터 안에서 생성되고 시작되는 지점에 따라 달라짐
 		
 스레드는 기본으로 우선순위가 5
 우선선위는 1~10 까지 존재
 setPriority(Thread.MIN_PRIORITY)
 
 Thread.MIN_PRIORITY  = 우선순위 1      = CPU 자원을 가장 적게 확보
 Thread.NORM_PRIORITY = 우선순위 5		 (기본)
 Thread.MAX_PRIORITY  = 우선순위 10     = CPU 자원을 더 많이 확보
 
 만약에 우선순위에서 1 5 10 이외의 우선순위를 사용하고 싶을때
 만약 우선순위 3으로 두고싶다
 setPriority(3);
 만약 우선순위 6으로 두고싶다
 setPriority(6);
 
 
 스레드에서 말하는 우선순위는 CPU 자원을 더 많이 확보하는 우선선위
 우선순위가 높은 스레드가 항상 먼저 실행되는 것은 아님
 
 sleep()   : ~~초 간 잠자는 상태 유지	
 			└ 알아서 ~초 실행
 //현재 사용이 권장되지는 않음 -suspend,resume			
 suspend() : 일시 중지
 			└ 알아서 일어나기 X, resume으로 일어나야지 시작 가능
 resume()  : 일시 중지한 스레드 다시시작

// 대체방안으로
 wait()   : 특정 조건이 충족될때까지 대기
 notify() : 대기중인 스레드를 깨워 특정 작업을 진행하도록 함
 
 
 await() : Condition 속한 스레드를 일시적으로 대기
 signal(): await에 의해 대기하고 있는 스레드를 깨움
 
 */

public class ThreadEx extends Thread{
	public void run() {
		System.out.println("스레드 실행 중");
		
		try {
			Thread.sleep(1000);  //1초동안 정지 try catch하라고 빨간줄 뜸
			System.out.println("1초끝!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
