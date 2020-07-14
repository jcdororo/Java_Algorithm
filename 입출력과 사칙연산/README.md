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

## 문제번호 1001번
* 날짜 : 2020/07/13
* 문제 : 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
* 입력 : 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
* 출력 : 첫째 줄에 A-B를 출력한다.
* 예제 입력 : 3 2
* 예제 출력 : 1
* 알고리즘 분류 :사칙연산 수학
* 정답 : 
```{.java}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a - b);
	}

}
```
* Solution : Scanner의 사용 방법
* Review : 신택스 에러 조심!

- - -
## 문제번호 10998번
* 날짜 : 2020/07/14
* 문제 : 두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.
* 입력 : 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
* 출력 : 첫째 줄에 A×B를 출력한다.
* 예제 입력 : 1 2
* 예제 출력 : 2
* 알고리즘 분류 : 사칙연산
* 정답 : 
```{.java}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a * b);
	}

}
```
* Solution : 간단한 곱셈
* Review : x가아니라 *가 곱하기다

- - -
## 문제번호 1008번
* 날짜 : 2020/07/14
* 문제 : 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
* 입력 : 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
* 출력 : 첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10^-9 이하이면 정답이다.
* 예제 입력 : 1 3
* 예제 출력 : 0.3333333333333333333333
* 예제 입력2 : 4 5
* 예제 출력 : 0.8
* 알고리즘 분류 : 사칙연산 수학
* 정답 : 
```{.java}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b;
		a = sc.nextDouble();
		b = sc.nextDouble();
		System.out.println(a / b);
	}

}
```
* Solution : 사칙연산 중 / 를 묻는 문제
* Review : 사칙연산 / 는 소수점까지 출력한다.

- - -
## 문제번호 10430번
* 날짜 : 2020/07/14
* 문제 : (A+B)%C는 ((A%C) + (B%C))%C 와 같을까? (A×B)%C는 ((A%C) × (B%C))%C 와 같을까? 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
* 입력 : 첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)
* 출력 : 첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
* 예제 입력 : 5 8 4
* 예제 출력 : 1 1 0 0
* 알고리즘 분류 : 사칙연산 나머지 연산
* 정답 : 
```{.java}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		
		System.out.println(((a + b) % c));
		System.out.println((a % c) + (b % c) % c);
		System.out.println((a * b) % c);
		System.out.println((a % c) * (b % c) % c);
	}
}
```
* Solution : 사칙연산의 활용 예
* Review : % 와 / 를 잘 구분해서 사용하자.

- - -
## 문제번호 2588번
* 날짜 : 2020/07/14
* 문제 : ![캡처_2020_07_14_19_46_03_818](https://user-images.githubusercontent.com/66819791/87417127-b2cd6800-c60a-11ea-82da-fe31f262ee6c.jpg)
* 입력 : 첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
* 출력 : 첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
* 예제 입력 : 472 385
* 예제 출력 : 2360 3776 1416 181720
* 알고리즘 분류 :
* 정답 : 
```{.java}
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println(a*(b%10));
		System.out.println(a*((b%100)/10));
		System.out.println(a*((b%1000)/100));
		System.out.println(a*b);
	}
}
```
* Solution : 사칙연산 종합 활용
* Review : %는 나머지가 출력되는 점을 이용하여 마음대로 숫자를 골라서 쓸수 있도록 하였다. 잠깐 생각하게 해주는 문제였다.
