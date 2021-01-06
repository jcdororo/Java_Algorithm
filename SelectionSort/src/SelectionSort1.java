
public class SelectionSort1 {
	public static void main(String[] args) {
		// 선택정렬
		// 38,45,62,70,55,85,92,40,30,55를 왼쪽부터 오름차순으로 정렬하시오

		// 1.배열을 출력할줄 알아야한다.
		int[] data = new int[] { 38, 45, 62, 70, 55, 85, 92, 40, 30, 55 }; // 10개의 배열 데이터

		for (int i = 0; i < data.length; i++) { // 배열데이터의 수가 변경될 경우 코드의 확장성을 위해 배열의 길이를 사용하였다.
			System.out.print(data[i]);
			System.out.print("\t");
		}
		System.out.println();

	}
}
