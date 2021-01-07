package bubble;

public class BubbleSort4 {
	public static void main(String[] args) {
		// 버블정렬
		// 38,45,62,70,55,85,92,40,30,55를 왼쪽부터 오름차순으로 정렬하시오

		// 4.스왑 및 저장 후 정렬을 시작한다.
		int[] data = new int[] { 38, 45, 62, 70, 55, 85, 92, 40, 30, 55 };

		for (int k = 0;k < data.length-1; k++) { //아래의 반복문을 9번 반복한다 
			for (int i = k; i < data.length; i++) {
				if (data[k] > data[i]) { // 배열의 첫 데이터보다 작은값이 있는지 검사
					int temp = data[k]; // 있다면 스왑
					data[k] = data[i];
					data[i] = temp;
				}
			}
		}

		// 출력
		// 38,45,62,70,55,85,92,40,30,55 의 배열이
		// 30,38,40,45,55,55,62,70,85,92 으로 변경
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]);
			System.out.print("\t");
		}
		System.out.println();
	}
}
