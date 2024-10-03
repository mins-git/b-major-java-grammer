package org.example.JVM.Static.Score;


// 점수 관리 객체
// 점수 1개만 있음.
// 객체도 1개만 만들어 관리 해보려고함
public class ScoreManager {
    private int score ;

    // 인스턴스는 한개만 만들어서 가지고 있기.
    private static ScoreManager manager = new ScoreManager();

    //싱글턴으로 진행
    // 1. 오로지 1개만 생성되도록 -> 외부 생성자를 호출할 수 없도록 막아얗마.
    // 생성자를 private로 만들기.

    private ScoreManager() {
    }

    //3 인스턴스를 외부에서 가져다 쓸 수 있또록 public getter을 추가하기
    //4 객체생성 없이 클래스 이름으로 바로 접근하도록 static을 추가함.
    public static ScoreManager getInstance(){
        return manager;
    }

}
