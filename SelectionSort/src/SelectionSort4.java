import java.util.*;
public class SelectionSort4 {
	public static void main(String[] args) {
		//선택정렬
		//38,45,62,70,55,85,92,40,30,55를 왼쪽부터 오름차순으로 정렬하시오
		
		// 4.맨앞에 배치시키고 배치시킨 수와 바뀐 수를 스왑을 할 줄 알아야한다.
		int[] data = new int[] {38,45,62,70,55,85,92,40,30,55};
				
		int index = 0;     //가장 작은 값의 위치라고 가정
		
		for(int i = 0; i < data.length; i++) {//배열 데이터를 왼쪽부터 검사하여 가장 작은값을 찾아 데이터를 저장함.
			if(data[index] > data[i]) {				
				index = i;
			}
		}
				
		//저장한 값을 바탕으로 스왑
		//스왑 코드
		if(data[0]!=data[index]) { //가장 작은 값이라고 가정했던값과 변경된 값을 비교하여 스왑
			int temp = data[0]; //temp라는 저장소를 생성하여 잠시 저장
			data[0] = data[index];
			data[index] = temp;
		}
		
		//배열 출력
		//38,45,62,70,55,85,92,40,30,55 의 배열이
		//30,45,62,70,55,85,92,40,38,55 로 변경
		for(int i = 0; i < 10; i++) { //10개의 배열 데이터 이므로 10번 반복하여 출력
			System.out.print(data[i]);
			System.out.print("\t");
		}
		System.out.println();
	}
}
