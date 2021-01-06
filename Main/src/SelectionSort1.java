
public class SelectionSort1 {
	public static void main(String[] args) {
		// 선택정렬
		// 38,45,62,70,55,85,92,40,30,55를 왼쪽부터 오름차순으로 정렬하시오

		// 선택정렬을 위한 필수 개념
		// 1.배열을 출력할줄 알아야한다.
		// 2.가장 앞 위치가 제일 작은 수라고 가정후 더 작은 값이 있는지 검사한다.
		// 3.배열의 가장 작은 수를 맨 앞에 배치시킬 줄 알아야한다.
		// 4.맨앞에 배치시키고 배치시킨 수와 바뀐 수를 스왑을 할 줄 알아야한다.
		// 5.스왑 및 저장 후 정렬을 시작한다.
//		int[] data = new int[] {38,45,62,70,55,85,92,40,30,55}; //10개의 배열 데이터
//		
//		for(int i = 0; i < 10; i++) { //10개의 배열 데이터 이므로 10번 반복하여 출력
//			System.out.print(data[i]);
//			System.out.print("\t");
//		}
//		System.out.println();

//		--------------확장
		int[] data = new int[] { 38, 45, 62, 70, 55, 85, 92, 40, 30, 55 }; // 10개의 배열 데이터

		for (int i = 0; i < data.length; i++) { // 배열데이터의 수가 변경될 경우 코드의 확장성을 위해 배열의 길이를 사용하였다.
			System.out.print(data[i]);
			System.out.print("\t");
		}
		System.out.println();

	}
}
