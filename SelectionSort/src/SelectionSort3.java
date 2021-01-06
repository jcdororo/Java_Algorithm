import java.util.*;
public class SelectionSort3 {
	public static void main(String[] args) {
		//선택정렬
		//38,45,62,70,55,85,92,40,30,55를 왼쪽부터 오름차순으로 정렬하시오
				
		// 3.배열의 가장 작은 수를 맨 앞에 배치시킬 줄 알아야한다.
		int[] data = new int[] {38,45,62,70,55,85,92,40,30,55};
				
		int index = 0;     //가장 작은 값의 위치라고 가정
		
		for(int i = 0; i < data.length; i++) {//배열 데이터를 왼쪽부터 검사하여 가장 작은값을 찾아 데이터를 저장함.
			if(data[index] > data[i]) {
				index = i;
			}
		}
		
		//가장 맨 앞에 배치시킨다.
		//배치 코드
		if(data[0]!=data[index]) { //변경된 값을 가장 맨 앞에 배치
			data[0] = data[index];
		}
		
		//배열 출력
		//38,45,62,70,55,85,92,40,30,55 의 배열이
		//30,45,62,70,55,85,92,40,30,55 로 변경
		for(int i = 0; i < 10; i++) { //10개의 배열 데이터 이므로 10번 반복하여 출력
			System.out.print(data[i]);
			System.out.print("\t");
		}
		System.out.println();
	}
}
