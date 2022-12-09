# TDD를 통한 스마트한 리팩토링 해보기

## ⚙️ 실습환경

- 개발환경은 Windows 기준으로 설명이 진행될 예정입니다.
- IDE - `IntelliJ Community Edition` 설치를 권장합니다.
  - https://www.jetbrains.com/ko-kr/idea/download/#section=windows
  - 설치방법 추천 블로그 링크 : https://bada744.tistory.com/59
- 사용언어 : Java 1.8
- 프로젝트 구성하기
  1. git bash 를 설치합니다. (추천 링크 : https://xangmin.tistory.com/102)
  2. git bash 를 실행합니다.
  3. cd 명령어를 이용하여 원격 저장소를 복제할 디렉토리로 이동합니다.
  4. git clone을 통하여 원격 저장소를 복제합니다.
     - git clone https://github.com/ChangSubKwak/refactoring-practice
  5. IntelliJ를 실행합니다.
  6. `파일-열기`로 해당 디렉토리를 선택하여 프로젝트를 엽니다.
  7. 왼쪽의 프로젝트 창(ALT + 1)에서 `src - test` 디렉토리를 찾아, 오른쪽 클릭후 (테스트) 실행을 찾아 클릭합니다.
  8. 테스트 결과 성공(✔️)하면 실습세팅은 완료입니다.

## 🔍 진행 방식

- package 구성

  ```
  src ┬ main ─ java ┬ problem  : 리팩토링이 필요한 코드가 예시가 있는 패키지 (수정대상 아님) 
      │             └ solution : problem에 있는 코드를 그대로 복사했으며, 리팩토링 대상 (수정 대상)
      └ test ─ java ─ solution : 코드에 대하여 리팩토링후 동작의 변화를 확인할 수 있는 테스트 코드 
  ```
- 리팩토링할 코드는 `src/main/java/solution`에 있음
  <br>
- 리팩토링후 `src/test/java/solution` 패키지로 이동 테스트 코드 실행

  1. `src/main/java/solution/_1_extract_method` 의 ExtractMethod 를 리팩토링 했을 경우
  2. `src/test/java/solution/_1_extract_method` 의 ExtractMethodTest 의 printOwing 메소드 왼쪽에 위치한 초록색 삼각형 버튼 클릭
  3. ✔️ 초록색 체크 표시가 출력되면 테스트 통과, 노란색 X 표시가 출력되면 테스트 실패

---

## 🚀 리팩토링 실습

1. `Extract Method`
   1. 첫번째 문제
      - **테스트 코드 이미 작성된 것 사용**
      - **IDE의 `Extract Method` 기능을 사용하지 않고, 직접 리팩토링 하기**
      - printOwing() 를 3개의 의미있는 메소드로 구성되도록 리팩토링    
<br>
2. `Replace Temp With Query`
   1. 첫번째 문제
      - getPrice메소드에 대해 테스트 케이스 작성
      - Extract Method 를 이용하여 getPrice메소드를 2개의 의미 있는 메소드로 구성되도록 리팩토링
   2. 두번째 문제
      - getPrice메소드에 대해 테스트 케이스 작성
      - 재대입되는 변수 basePrice에 대하여 다른 임시변수(상수)로 선언
      - Extract Method 를 이용하여 getPrice메소드를 2개의 의미 있는 메소드로 구성되도록 리팩토링
   3. 세번째 문제
      - **테스트 코드 이미 작성된 것 사용**
      - outstanding1 ~ 4 까지 변수의 최종값에 대한 질의함수 만들기
      - 2에서 만든 질의함수를 사용하여 임시변수(지역변수)를 제거
      - 표준출력문만 남겨보기
      - (선택) stream을 이용하여 질의함수를 더 간단하게 변경가능
   4. 네번째 문제
      - **테스트 코드 작성 필요 없음** 
      - 이번 문제는 부수효과에 대한 문제를 확인하기 위한 것
      - 부수효과를 일으키는 부분을 별도의 함수로 분리해보기
      - 함수 분리만으로 문제 해결되었다고 볼 수 있음  
      <br>
3. `Replace Method With Method`
   1. 첫번재 문제
      - **테스트 코드 이미 작성된 것 사용** 
      - gamma 메소드에 대한 테스트 코드 작성
      - 메소드의 이름을 따서 새로운 클래스(Gamma) 생성
      - gamma 메소드에 내에 새롭게 작성한 클래스의 메소드를 호출하도록 변경
   2. 두번재 문제
      - **테스트 코드 이미 작성된 것 사용**
      - printOwing 메소드에 대한 테스트 코드 작성 (이미 작성된 것 활용)
      - 메소드의 이름을 따서 새로운 클래스 생성
      - printOwing 메소드내, 새로운 클래스의 메소드를 호출하도록 리팩터링
      <br>

---
