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
## 문제번호 2739번
* 날짜 : 2020/07/17
* 문제 : N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
* 입력 : 첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.
* 출력 : 출력형식과 같게 N*1부터 N*9까지 출력한다.
* 예제 입력 : 2
* 예제 출력 : <br>
2 * 1 = 2<br>
2 * 2 = 4<br>
2 * 3 = 6<br>
2 * 4 = 8<br>
2 * 5 = 10<br>
2 * 6 = 12<br>
2 * 7 = 14<br>
2 * 8 = 16<br>
2 * 9 = 18<br>
* 알고리즘 분류 : 출력
* 정답 : 
```{.java}
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, N;
		N = sc.nextInt();
		
		for(i = 1; i <=9; i++) {
			System.out.println(N + " * " + i + " = " + (N*i) );
		}
	}
}
```
* Solution : 
* Review :

- - -
## 문제번호 10950번
* 날짜 : 2020/07/17
* 문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
* 입력 : 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 
각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
* 출력 : 각 테스트 케이스마다 A+B를 출력한다.
* 예제 입력 : <br>
5 <br>
1 1<br>
2 3<br>
3 4<br>
9 8<br>
5 2<br>
* 예제 출력 : <br>
2<br>
5<br>
7<br>
17<br>
7<br>
* 알고리즘 분류 :
* 정답 : 
```{.java}
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 1; i <= T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println((A + B));
		}
		
		sc.close();
	}
}
```
* Solution : 
* Review :

- - -
## 문제번호 8393번
* 날짜 : 2020/07/17
* 문제 : n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
* 입력 : 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
* 출력 : 1부터 n까지 합을 출력한다.
* 예제 입력 : 3
* 예제 출력 : 6
* 알고리즘 분류 :
* 정답 : 
```{.java}
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int sum = 0;
		for (int i = 1; i <= n; i++){
			sum += i;
		}
		System.out.println(sum);
	}
}
```
* Solution : 
* Review :

- - -
## 문제번호 15552번
* 날짜 : 2020/07/17
* 문제 : 본격적으로 for문 문제를 풀기 전에 주의해야 할 점이 있다. 입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있다는 점이다.

C++을 사용하고 있고 cin/cout을 사용하고자 한다면, cin.tie(NULL)과 sync_with_stdio(false)를 둘 다 적용해 주고, endl 대신 개행문자(\n)를 쓰자. 단, 이렇게 하면 더 이상 scanf/printf/puts/getchar/putchar 등 C의 입출력 방식을 사용하면 안 된다.

Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다. BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.

Python을 사용하고 있다면, input 대신 sys.stdin.readline을 사용할 수 있다. 단, 이때는 맨 끝의 개행문자까지 같이 입력받기 때문에 문자열을 저장하고 싶을 경우 .rstrip()을 추가로 해 주는 것이 좋다.

또한 입력과 출력 스트림은 별개이므로, 테스트케이스를 전부 입력받아서 저장한 뒤 전부 출력할 필요는 없다. 테스트케이스를 하나 받은 뒤 하나 출력해도 된다.
* 입력 : 첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.
* 출력 : 각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.
* 예제 입력 : <br>
5<br>
1 1<br>
12 34<br>
5 500<br>
40 60<br>
1000 1000<br>
* 예제 출력 : <br>
2<br>
46<br>
505<br>
100<br>
2000<br>
* 알고리즘 분류 :
* 정답 : 
```{.java}
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
 
		int N = Integer.parseInt(br.readLine());
        
		StringTokenizer st;
 
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine()," ");
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");
		}
	}
}
```
* Solution : 
* Review :

- - -
## 문제번호 2741번
* 날짜 : 2020/07/17
* 문제 : 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
* 입력 : 첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
* 출력 : 첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
* 예제 입력 : 5
* 예제 출력 : <br>
1<br>
2<br>
3<br>
4<br>
5<br>
* 알고리즘 분류 :
* 정답 : 
```{.java}
import java.util.Scanner;

public class Main {

	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		for(int i = 1; i <= N; i++) {
			System.out.println(i);
		}
	}	
}
```
* Solution : 
* Review :

- - -
## 문제번호 2742번
* 날짜 : 2020/07/17
* 문제 : 자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
* 입력 : 첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
* 출력 : 첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
* 예제 입력 : 5
* 예제 출력 : <br>
5<br>
4<br>
3<br>
2<br>
1<br>
* 알고리즘 분류 :
* 정답 : 
```{.java}
import java.util.Scanner;

public class Main {

	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		for(int i = N; i >= 1; i--) {
			System.out.println(i);
			
		}
	}
}	
```
* Solution : 
* Review :

- - -
## 문제번호 11021번
* 날짜 : 2020/07/17
* 문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
* 입력 : 첫째 줄에 테스트 케이스의 개수 T가 주어진다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
* 출력 : 각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.
* 예제 입력 : <br>
5<br>
1 1<br>
2 3<br>
3 4<br>
9 8<br>
5 2<br>
* 예제 출력 : <br>
Case #1: 2<br>
Case #2: 5<br>
Case #3: 7<br>
Case #4: 17<br>
Case #5: 7<br>
* 알고리즘 분류 :
* 정답 : 
```{.java}
import java.util.Scanner;

public class Main {

	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i = 1; i <=T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println("Case #" + i + ": " + (A + B));
		
		}
	}
}
```
* Solution : 
* Review :

- - -
## 문제번호 11022번
* 날짜 : 2020/07/17
* 문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
* 입력 : 첫째 줄에 테스트 케이스의 개수 T가 주어진다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
* 출력 : 각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
* 예제 입력 : <br>
5<br>
1 1<br>
2 3<br>
3 4<br>
9 8<br>
5 2<br>
* 예제 출력 : <br>
Case #1: 1 + 1 = 2<br>
Case #2: 2 + 3 = 5<br>
Case #3: 3 + 4 = 7<br>
Case #4: 9 + 8 = 17<br>
Case #5: 5 + 2 = 7<br>
* 알고리즘 분류 :
* 정답 : 
```{.java}
import java.util.Scanner;

public class Main {

	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i = 1; i <=T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println("Case #" + i + ": " + A + " + " + B + " = " + (A+B));
		
		}
	}
}
```
* Solution : 
* Review :

- - -
## 문제번호 2438번
* 날짜 : 2020/07/17
* 문제 : 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
* 입력 : 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
* 출력 : 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
* 예제 입력 : 5
* 예제 출력 : <br>
*<br>
**<br>
***<br>
****<br>
*****<br>
* 알고리즘 분류 :
* 정답 : 
```{.java}
import java.util.Scanner;

public class Main {

	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
}
```
* Solution : 
* Review :

- - -
## 문제번호 2493번
* 날짜 : 2020/07/17
* 문제 : 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
* 입력 : 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
* 출력 : 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
* 예제 입력 : 5
* 예제 출력 : <br>
    *<br>
   **<br>
  ***<br>
 ****<br>
*****<br>
* 알고리즘 분류 :
* 정답 : 
```{.java}
import java.util.Scanner;

public class Main {

	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N-i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
```
* Solution : 
* Review :

- - -
## 문제번호 10871번
* 날짜 : 2020/07/17
* 문제 : 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
* 입력 : 첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)

둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
* 출력 : X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.
* 예제 입력 : <br>
10 5<br>
1 10 4 9 2 3 8 5 7 6<br>
* 예제 출력 : 1 4 2 3
* 알고리즘 분류 :
* 정답 : 
```{.java}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
		int N = in.nextInt();
		int X = in.nextInt();
		int arr[] = new int[N];
        
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
 
		in.close();
        
		for (int i = 0; i < N; i++) {
			if (arr[i] < X) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
```
* Solution : 
* Review :

