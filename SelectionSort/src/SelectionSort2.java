import java.util.*;
public class SelectionSort2 {
	public static void main(String[] args) {
		//선택정렬
		//38,45,62,70,55,85,92,40,30,55를 왼쪽부터 오름차순으로 정렬하시오
					
		// 2.가장 앞 위치가 제일 작은 수라고 가정후 더 작은 값이 있는지 검사한다.
		int[] data = new int[] {38,45,62,70,55,85,92,40,30,55};
		
		int min = data[0]; //가장 작은값이라고 가정
		int index = 0;     //가장 작은 값의 위치라고 가정
		
		for(int i = 0; i < data.length; i++) {//배열 데이터를 왼쪽부터 검사하여 가장 작은값을 찾아 데이터를 저장함.
			if (data[index] > data[i]) {
				min = data[i];
				index = i;
			}
			
		}
		System.out.println("배열 데이터 중 가장 작은값은 "+min+"입니다.");
		System.out.println("가장 작은 값의 위치는 "+"data["+index+"]입니다.");
	}
}
