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
## 문제번호 10951번
* 날짜 : 2020/01/02
* 문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
* 입력 : 정수 a , 정수 b
* 출력 : a+b
* 예제 입력 : 정수 a , 정수 b
* 예제 출력 : a+b
* 알고리즘 분류 : 수학, 구현, 사칙연산
* 정답 : 
```{.java}
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);			
		}
	}
}
```
* Solution : while문 입력
* Review : hasNextInt는 입력받는게 정수면 true를 반환하고 아니면 false를 반환한다.
