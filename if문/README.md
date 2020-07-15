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
## 문제번호 1330번
* 날짜 : 2020/07/15
* 문제 : 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
* 입력 : 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
* 출력 : 첫째 줄에 다음 세 가지 중 하나를 출력한다.<br>
A가 B보다 큰 경우에는 '>'를 출력한다.<br>
A가 B보다 작은 경우에는 '<'를 출력한다.<br>
A와 B가 같은 경우에는 '=='를 출력한다.<br>
* 예제 입력 : 1 2
* 예제 출력 : <
* 예제 입력2 : 10 2
* 예제 출력2 : >
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
		if(a > b) {
			System.out.println(">");
		} else if(a < b) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
	}
}
```
* Solution : if문의 기초
* Review : 예외를 잘 생각해보자

- - -
## 문제번호 9498번
* 날짜 : 2020/07/15
* 문제 : 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
* 입력 : 첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
* 출력 : 시험 성적을 출력한다.
* 예제 입력 : 100
* 예제 출력 : A
* 알고리즘 분류 : 구현
* 정답 : 
```{.java}
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		if (a >= 90) {
			System.out.println("A");
		} 
		else if (a >= 80) {
			System.out.println("B");
		}
		else if (a >= 70) {
			System.out.println("C");
		}
		else if (a >= 60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
	}
}
```
* Solution : 경계값을 표현
* Review : >와 >=는 엄연히 다르다 주의하자.

- - -
## 문제번호 2753번
* 날짜 : 2020/07/15
* 문제 : 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.

윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.

예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다. 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다. 하지만, 2000년은 400의 배수이기 때문에 윤년이다.
* 입력 : 첫째 줄에 연도가 주어진다. 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.
* 출력 : 첫째 줄에 윤년이면 1, 아니면 0을 출력한다.
* 예제 입력 : 2000
* 예제 출력 : 1
* 예제 입력2 : 1999
* 예제 출력2 : 0
* 알고리즘 분류 :
* 정답 : 
```{.java}
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		if(a % 4 == 0 && (a % 100 != 0 || a % 400 == 0)) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
		sc.close();
	}
}
```
* Solution : if문 값의 and, or 표현
* Review : if문 안을 어떻게 표현할지 몰라서 검색하였다. 기본적인 문법이니 알아두도록 하자.

- - -
## 문제번호 14681번
* 날짜 : 2020/07/15
* 문제 : ![캡처_2020_07_15_18_14_44_928](https://user-images.githubusercontent.com/66819791/87527453-1c12b100-c6c7-11ea-9da8-ba663bc1a6bb.jpg)
* 입력 : 첫 줄에는 정수 x가 주어진다. (−1000 ≤ x ≤ 1000; x ≠ 0) 다음 줄에는 정수 y가 주어진다. (−1000 ≤ y ≤ 1000; y ≠ 0)
* 출력 : 점 (x, y)의 사분면 번호(1, 2, 3, 4 중 하나)를 출력한다.
* 예제 입력 : 12 5
* 예제 출력 : 1
* 예제 입력2 : 9 -13
* 예제 출력2 : 4
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
		if(a >= 0 && b >= 0) {
			System.out.println("1");
		}
		if(a <= 0 && b >= 0) {
			System.out.println("2");
		}
		if(a <= 0 && b <= 0) {
			System.out.println("3");
		}
		if(a >= 0 && b <= 0) {
			System.out.println("4");
		}
		sc.close();
	}
}
```
* Solution : &&의 사용법
* Review : 위 2753번과 유사하다 정확히 알아두자

- - -
## 문제번호 2884번
* 날짜 : 2020/00/00
* 문제 : 상근이는 매일 아침 알람을 듣고 일어난다. 알람을 듣고 바로 일어나면 다행이겠지만, 항상 조금만 더 자려는 마음 때문에 매일 학교를 지각하고 있다.

상근이는 모든 방법을 동원해보았지만, 조금만 더 자려는 마음은 그 어떤 것도 없앨 수가 없었다.

이런 상근이를 불쌍하게 보던, 창영이는 자신이 사용하는 방법을 추천해 주었다.

바로 "45분 일찍 알람 설정하기"이다.

이 방법은 단순하다. 원래 설정되어 있는 알람을 45분 앞서는 시간으로 바꾸는 것이다. 어차피 알람 소리를 들으면, 알람을 끄고 조금 더 잘 것이기 때문이다. 이 방법을 사용하면, 매일 아침 더 잤다는 기분을 느낄 수 있고, 학교도 지각하지 않게 된다.

현재 상근이가 설정한 알람 시각이 주어졌을 때, 창영이의 방법을 사용한다면, 이를 언제로 고쳐야 하는지 구하는 프로그램을 작성하시오.
* 입력 : 첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 현재 상근이가 설정한 놓은 알람 시간 H시 M분을 의미한다.

입력 시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다. 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
* 출력 : 첫째 줄에 상근이가 창영이의 방법을 사용할 때, 설정해야 하는 알람 시간을 출력한다. (입력과 같은 형태로 출력하면 된다.)
* 예제 입력 : 10 10
* 예제 출력 : 9 25
* 예제 입력2 : 0 30
* 예제 출력2 : 23 45
* 예제 입력3 : 23 40
* 예제 출력3 : 22 55
* 알고리즘 분류 : 구현
* 정답 : 
```{.java}
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H, M;
		H = sc.nextInt();
		M = sc.nextInt();
		sc.close();
		if (M < 45) {
			H--;
			M = 60 - (45 - M);
			if (H < 0) {
				H += 24;
			}
			System.out.println(H + " " + M);
		} else {
			System.out.println(H + " " + (M - 45));
		}
	}
}
```
* Solution : 예외 상황 구현
* Review : 생각보다 시간이 많이 걸렸다. 문제가 원하는 것이 무엇인지 제대로 파악해야겠다. 코드는 되도록 간단하고 편하게 짜도록 하자 어렵게 생각할 필요 없다.

