package bubble;

public class BubbleSort3 {
	public static void main(String[] args) {
		// 버블정렬
		// 38,45,62,70,55,85,92,40,30,55를 왼쪽부터 오름차순으로 정렬하시오

		// 3.맨앞에 배치시키고 배치시킨 수와 바뀐 수를 스왑을 할 줄 알아야한다.
		int[] data = new int[] { 38, 45, 62, 70, 55, 85, 92, 40, 30, 55 };

		for (int i = 0; i < data.length; i++) {
			if (data[0] > data[i]) { // 배열의 첫 데이터보다 작은값이 있는지 검사
				int temp = data[0]; // 있다면 스왑
				data[0] = data[i];
				data[i] = temp;
			}
		}

		// 출력
		// 38,45,62,70,55,85,92,40,30,55 의 배열이
		// 30,45,62,70,55,85,92,40,38,55 으로 변경
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]);
			System.out.print("\t");
		}
		System.out.println();
	}
}
