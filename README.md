# b-major-java-grammer
![image](https://github.com/user-attachments/assets/62b6d058-904b-4532-85ed-ce5cb29efece)

싸피 비전공 자바반 강의 기반 자바 문법을 학습.

## 진행 과정 + 제출 마감
- [x] 24.09.24 : (1)기본문법
- [x] 24.09.25 : (2)배열
- [x] 24.09.26 : (3)클래스와객체
- [x] 24.09.27 : (4)객체배열관리
- [x] 24.09.28 : (5)상속, (6)다형성_추상클래스, (7)인터페이스_제네릭
- [x] 24.09.29 : (8)컬렉션, (9)예외처리, (10)파일입출력 -> 성공적으로 완료 !!!

## 목표
java 기초 문법 학습 및 정리

## 기간
6일

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
    - 이번 주 내로 출제 예정 . . .
 
## 학습 자료
| 자료 종류 | 제목                                              | 링크                                |
|-----------|--------------------------------------------------|-----------------------------------|
| 강의      | SSAFY Java 비전공 다시보기                             | [링크](https://edu.ssafy.com/edu/lectureroom/lecturereplay/lectureReplayView.do?lctCd=0208&lctrRepId=RE20240715130111)        |
| 교재      | SSAFY Java 비전공 학습자료                      | - |

## 추가 자료
| 자료 종류 | 제목                                               | 가격   | 링크                                |
|-----------|--------------------------------------------------|-------|-----------------------------------|
| 교재      | 점프 투 자바                                    | 무료   | [링크](https://wikidocs.net/book/31)   |
| 강의      | 김영한의 자바 입문 - 코드로 시작하는 자바 첫걸음 | 무료   | [링크](https://inf.run/2zsZz)        |
| 강의      | 김영한의 실전 자바 - 기본편                      | 44,000원 | [링크](https://inf.run/YQbQJ)        |
| 블로그      | [JAVA] 자주 사용하는 코딩테스트 문법 정리      | 무료 | [링크](https://earthteacher.tistory.com/169#)        |
| 블로그      | [코딩 테스트 Java] 코딩 테스트 필수 문법        | 무료 | [링크](https://goldenrabbit.co.kr/2024/02/26/%EC%BD%94%EB%94%A9-%ED%85%8C%EC%8A%A4%ED%8A%B8-java-%EC%BD%94%EB%94%A9-%ED%85%8C%EC%8A%A4%ED%8A%B8-%ED%95%84%EC%88%98-%EB%AC%B8%EB%B2%95/)        |


## 깃허브 제출 방법
![image](https://github.com/user-attachments/assets/e9cfa1f7-e46b-4214-a2b1-5cdf62d9cabb)

**fork 작업 흐름: https://suucong.tistory.com/22**

이번에는 clone 대신 fork 방식을 사용하겠습니다. <br>
꼭 fork를 해야 하는 상황은 아니지만, 미리 연습해보는 차원입니다.

**위 블로그 글을 꼼꼼하게 읽고 진행해 주세요.** <br>
모르거나 헷갈리거나 빨간 에러를 만났다면 주저 말고 말해주세요.

### 요약
1. 시작
   1. 중앙 원격 레포 -> fork -> 개인 원격 레포
   2. 개인 원격 레포 -> git clone -> 개인 로컬
2. 작업
   1. 개인 로컬에서 개인 브랜치 생성
       - 매번 새로운 브랜치를 생성하는 것이 안전함. 그러나 아직은 자율적으로 기존 브랜치 재활용 가능.
   2. 개인 브랜치에서 작업
   3. add -> commit 
3. 업로드
   1. 개인 로컬 -> git push origin {$작업 중인 브랜치명} -> 개인 원격 레포
   2. 첫 번째 PR 생성 후 merge (개인 로컬 작업 중인 브랜치 -> 개인 원격 main(혹은 본인이 설정한 default) 브랜치)
   3. 두 번째 PR 생성 후 merge (개인 원격 main 브랜치 -> 중앙 원격 dev 브랜치)
4. 재시작
   1. 개인 로컬 브랜치에서 git pull upstream dev (중앙 원격 dev 브랜치 -> 개인 로컬 브랜치)
   2. 2. 작업으로 돌아가서 반복 


<br>
<br>
<hr>

### (참고용) 기존 git clone 작업 흐름
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
