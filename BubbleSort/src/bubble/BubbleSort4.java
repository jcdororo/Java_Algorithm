package bubble;

public class BubbleSort4 {
	public static void main(String[] args) {
		// ��������
		// 38,45,62,70,55,85,92,40,30,55�� ���ʺ��� ������������ �����Ͻÿ�

		// 4.���� �� ���� �� ������ �����Ѵ�.
		int[] data = new int[] { 38, 45, 62, 70, 55, 85, 92, 40, 30, 55 };

		for (int k = 0;k < data.length-1; k++) { //�Ʒ��� �ݺ����� 9�� �ݺ��Ѵ� 
			for (int i = k; i < data.length; i++) {
				if (data[k] > data[i]) { // �迭�� ù �����ͺ��� �������� �ִ��� �˻�
					int temp = data[k]; // �ִٸ� ����
					data[k] = data[i];
					data[i] = temp;
				}
			}
		}

		// ���
		// 38,45,62,70,55,85,92,40,30,55 �� �迭��
		// 30,38,40,45,55,55,62,70,85,92 ���� ����
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]);
			System.out.print("\t");
		}
		System.out.println();
	}
}
