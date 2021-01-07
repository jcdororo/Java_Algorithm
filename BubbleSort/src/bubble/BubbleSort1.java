package bubble;

public class BubbleSort1 {
	public static void main(String[] args) {
		// 버블정렬
		// 38,45,62,70,55,85,92,40,30,55를 왼쪽부터 오름차순으로 정렬하시오
		
		// 1.배열을 출력할줄 알아야한다.
		int[] data = new int[] {38,45,62,70,55,85,92,40,30,55};
		
		for(int i = 0; i < data.length; i++) {
			System.out.print(data[i]);
			System.out.print("\t");
		}
		System.out.println();
		
	}
}
