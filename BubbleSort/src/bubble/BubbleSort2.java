package bubble;

public class BubbleSort2 {
	public static void main(String[] args) {
		// 버블정렬
		// 38,45,62,70,55,85,92,40,30,55를 왼쪽부터 오름차순으로 정렬하시오

		// 2.가장 앞 위치가 제일 작은 수라고 가정후 더 작은 값이 있으면 저장한다.
		int[] data = new int[] { 38, 45, 62, 70, 55, 85, 92, 40, 30, 55 };
		
		for(int i = 0; i < data.length;i++) { 
			if(data[0] > data[i]) { //배열의 첫 데이터보다 작은값이 있는지 검사
				data[0] = data[i]; //있다면 첫데이터에 작은 값을 저장
			}
		}
		
		//출력
		// 38,45,62,70,55,85,92,40,30,55 의 배열이
		// 30,45,62,70,55,85,92,40,30,55 으로 변경		
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]);
			System.out.print("\t");
		}
		System.out.println();
	}
}
