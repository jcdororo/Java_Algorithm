# 백준 JAVA Algorithm

<!-- 양식
- - -
## 문제번호 N번
* 날짜 : 2020/00/00
* 문제 : 
* 입력 : 
* 출력 : 
* 예제 입력 : 
* 예제 출력 : 
* 알고리즘 분류 :
* 정답 : 
```{.java}

```
* Solution : 
* Review :
-->


- - -
## 문제번호 2557번
* 날짜 : 2020/07/12
* 문제 : Hello World!를 출력하시오.
* 입력 : 없음
* 출력 : Hello World!
* 예제 입력 :
* 예제 출력 : Hello World!
* 알고리즘 분류 : 출력 
* 정답 : 

```{.java}
public class Main {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
```

* Solution : 기초 출력문
* Review : 첫 단추를 꿰보자!


- - -
## 문제번호 10718번
* 날짜 : 2020/07/12
* 문제 : ACM-ICPC 인터넷 예선, Regional, 그리고 World Finals까지 이미 2회씩 진출해버린 kriii는 미련을 버리지 못하고 왠지 모르게 올 해에도 파주 World Finals 준비 캠프에 참여했다.

대회를 뜰 줄 모르는 지박령 kriii를 위해서 격려의 문구를 출력해주자.
* 입력 : 본 문제는 입력이 없다.
* 출력 : 두 줄에 걸쳐 "강한친구 대한육군"을 한 줄에 한 번씩 출력한다.
* 예제 입력 : 없음
* 예제 출력 : ![10718](https://user-images.githubusercontent.com/66819791/87239852-c3d17a00-c44e-11ea-9bd8-d046c16e2d28.jpg)
* 알고리즘 분류 : 출력
* 정답 : 
```{.java}
public class Main {

	public static void main(String[] args) {
		System.out.println("강한친구 대한육군");
		System.out.println("강한친구 대한육군");
		

	}

}
```
* solution : println 사용하여 줄바꿈 
* Review : Syntax error는 무섭다. 꼼꼼히 살펴보자


- - -
## 문제번호 10171번
* 날짜 : 2020/07/12
* 문제 : 아래 예제와 같이 고양이를 출력하시오.
* 입력 : 없음.
* 출력 : 고양이를 출력한다.
* 예제 입력 : 없음.
* 예제 출력 : ![캡처_2020_07_12_15_00_04_598](https://user-images.githubusercontent.com/66819791/87240007-63dbd300-c450-11ea-9881-2189438b78c3.jpg)

* 알고리즘 분류 : 출력
* 정답 : 
```{.java}
public class Main {

	public static void main(String[] args) {
		System.out.println("\\    /\\");
		System.out.println(" )  ( ')");
		System.out.println("(  /  )");
		System.out.println(" \\(__)|");
	}
}
```
* Solution : \를 출력하기 위한 문제
* Review : Java는 \를 출력하기위해선 \를 두번 사용한다.


- - -
## 문제번호 1000번
* 날짜 : 2020/07/12
* 문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
* 입력 : 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
* 출력 : 첫째 줄에 A+B를 출력한다.
* 예제 입력 : 1 2
* 예제 출력 : 3
* 알고리즘 분류 : 사칙연산 , 수학
* 정답 : 
```{.java}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a + b);
	}

}
```
* Solution : Scanner의 사용 방법
* Review : 10번째줄의 a + b 의 양옆엔 ""가 없어도 된다.
