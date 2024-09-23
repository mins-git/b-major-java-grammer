# b-major-java-grammer
싸피 비전공 자바반 강의 기반 자바 문법을 학습.

## 진행 과정
- [ ] 24.09.24 : (1)기본문법, (2)배열
- [ ] 24.09.25 : (3)클래스와객체
- [ ] 24.09.26 : (4)객체배열관리
- [ ] 24.09.27 : (5)상속 
- [ ] 24.09.28 : (6)다형성_추상클래스, (7)인터페이스_제네릭, (8)컬렉션
- [ ] 24.09.29 : (9)예외처리, (10)파일입출력

## 목표
java 기초 문법 학습 및 정리

## 기간
7일

## 교재
ssafy 비전공 자바반 강의 및 수업 자료

## 진행 방식
- 일일 과제
    - **ssafy 비전공 자바반 강의 수강**
    - **학습 내용 정리(노션, 마크다운, 기술 블로그, ...)**
    - **정리한 내용 github 제출하기**
        - 하단 <깃허브 제출 방법> 참고
- 최종 과제
    - java 언어로 알고리즘 3문제 풀이 후 제출
    - 24.09.30 출제 예정


## 깃허브 제출 방법
![image](./wdwd.png)

1. 시작
    1. if 처음 프로젝트를 생성한다면, `git clone {github repo 주소}`
    2. else if 이미 작업 중이던 프로젝트라면, `git pull origin dev`

2. `git branch {나의 브랜치명}` # 브랜치 생성

3. `git checkout {나의 브랜치명}` # 생성한 브랜치로 이동

4. 작업 후 저장

5. `git add .`

6. `git commit -m "feat : {문제 제목 혹은 번호}"` 

7. `git push origin {나의 브랜치명 == 현재 작업 중인 브랜치명}`
    - 문제 생기면 팀원들에게 바로 공유!

8. Pull Request

    1. github 돌아가서 해당 레포 상단에 Pull Request 생성 (초록색 `Compare & pull request` 버튼): 
        1. 타겟 브랜치 설정: `{dev}` <- `{나의 브랜치명 == 방금 작업 완료한 브랜치명}`
        2. 상세 커밋 내용 작성 (자동 완성 사용해도 무방)
        3. 초록색 `Create pull request` 버튼 클릭

    2. github에서 Merge
        1. if 문제 없으면, `Merge pull request` -> `Confirm merge`
        2. else if 문제 있으면, Conflict 해결 -> `Merge pull request` -> `Confirm merge`

    3. Pull Request가 자동으로 생기지 않으면?
        - [git clone으로 협업하기](https://velog.io/@rkio/git-clone%EC%9C%BC%EB%A1%9C-%ED%98%91%EC%97%85%EC%9D%84-%ED%95%B4%EB%B3%B4%EC%9E%90)

9. 새로운 작업 시작

    1. `{나의 브랜치명}`에서 `git pull origin dev` (1-2번을 수행한 것과 동일)

    2. 새로운 주차 디렉토리 하위에 본인 디렉토리 생성

    3. 다시 2번으로 돌아가서 반복...
