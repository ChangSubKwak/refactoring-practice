# TDD를 통한 스마트한 리팩토링 해보기

## ⚙️ 실습환경

- 개발환경은 Windows 기준으로 설명이 진행될 예정입니다.
- IDE - `IntelliJ Community Edition` 설치를 권장합니다.
  - https://www.jetbrains.com/ko-kr/idea/download/#section=windows
  - 설치방법 추천 블로그 링크 : 
- 사용언어 : Java 1.8
- 프로젝트 github clone을 하여 로컬에 저장된 프로젝트 디렉토리를 IntelliJ에서 `파일-열기`로 해당 디렉토리를 선택하여 프로젝트를 엽니다.

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
  1. `src/main/java/solution/_1_extract_method` 의 ExtractMethod 를 리팩토링 가정
  2. `src/test/java/solution/_1_extract_method` 의 ExtractMethodTest 의 printOwing 메소드 왼쪽에 위치한 초록색 삼각형 버튼 클릭 
  3. 초록색 체크 표시가 출력되면 테스트 통과, 노란색 X 표시가 출력되면 테스트 실패

---

## 🚀 리팩토링 실습

1. `Extract Method`
   - IDE의 `Extract Method` 기능을 사용하지 않고, 직접 리팩토링 하기
   - 메소드에 대한 의미있는 이름 생각해보기
   - 새롭게 만든 메소드내 지역변수를 의미에 맞게 네이밍 하기
   - 새롭게 만든 메소드를 이용하여 printOwing메소드내 코드를 대체해보기
   - 지역변수를 새롭게 만든 메소드로 대체하기
   - 미사용 지역변수 삭제 
2. `Replace Temp With Query`
   1. 첫번째 문제
      - getPrice메소드에 대해 테스트 케이스 작성
      - Extract Method 를 이용하여 getPrice메소드를 2개의 메소드로 구성되도록 리팩토링
   2. 두번째 문제
      - getPrice메소드에 대해 테스트 케이스 작성
      - 재대입되는 변수 basePrice에 대하여 다른 임시변수로 선언
      - Extract Method 를 이용하여 getPrice메소드를 2개의 메소드로 구성되도록 리팩토링
   3. 세번째 문제
   4. 네번째 문제
3. `Replace Method With Method`
   1. 첫번재 문제
      - gamma 메소드에 대한 테스트 코드 작성
      - 메소드의 이름을 따서 새로운 클래스(Gamma) 생성
      - gamma 메소드에 내에 새롭게 작성한 클래스의 메소드를 호출하도록 변경
   2. 두번재 문제
4. `Move Method`
   - 444
5. `Pull Up Field`
   - 555
6. `Pull Up Method`
   - 666
7. `Form Template Method`
   - 777
8. `Extract Class`
   - 888

---
