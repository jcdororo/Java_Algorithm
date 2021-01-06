import java.util.*;
public class SelectionSort5 {
	public static void main(String[] args) {
		//선택정렬
		//38,45,62,70,55,85,92,40,30,55를 왼쪽부터 오름차순으로 정렬하시오
				
		// 5.반복문을 사용하여 스왑 및 저장 후 정렬을 시작한다.
		int[] data = new int[] {38,45,62,70,55,85,92,40,30,55};
		
		for(int k = 0; k < data.length-1; k++) { //마지막은 정렬 안해도 됨으로 길이-1
			int index = k;//가장 작은 값의 위치라고 가정
			for(int i = k+1; i < data.length; i++) {//배열 데이터를 왼쪽부터 검사하여 가장 작은값을 찾아 데이터를 저장함.
				if(data[index] > data[i]) {					
					index = i;
				}
			}		
			
			//저장한 값을 바탕으로 스왑
			//스왑 코드
			if(data[k]!=data[index]) { //가장 작은 값이라고 가정했던값과 변경된 값을 비교하여 스왑
				int temp = data[k]; //temp라는 저장소를 생성하여 잠시 저장
				data[k] = data[index];
				data[index] = temp;
			}
		}
				
		
		//배열 출력
		//38,45,62,70,55,85,92,40,30,55 의 배열이
		//30,38,40,45,55,55,62,70,85,92 로 변경
		for(int i = 0; i < 10; i++) { //10개의 배열 데이터 이므로 10번 반복하여 출력
			System.out.print(data[i]);
			System.out.print("\t");
		}
		System.out.println();
		
	}
}
