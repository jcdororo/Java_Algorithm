
public class SelectionSort1 {
	public static void main(String[] args) {
		// ��������
		// 38,45,62,70,55,85,92,40,30,55�� ���ʺ��� ������������ �����Ͻÿ�

		// 1.�迭�� ������� �˾ƾ��Ѵ�.
		int[] data = new int[] { 38, 45, 62, 70, 55, 85, 92, 40, 30, 55 }; // 10���� �迭 ������

		for (int i = 0; i < data.length; i++) { // �迭�������� ���� ����� ��� �ڵ��� Ȯ�强�� ���� �迭�� ���̸� ����Ͽ���.
			System.out.print(data[i]);
			System.out.print("\t");
		}
		System.out.println();

	}
}
