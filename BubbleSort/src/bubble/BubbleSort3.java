package bubble;

public class BubbleSort3 {
	public static void main(String[] args) {
		// ��������
		// 38,45,62,70,55,85,92,40,30,55�� ���ʺ��� ������������ �����Ͻÿ�

		// 3.�Ǿտ� ��ġ��Ű�� ��ġ��Ų ���� �ٲ� ���� ������ �� �� �˾ƾ��Ѵ�.
		int[] data = new int[] { 38, 45, 62, 70, 55, 85, 92, 40, 30, 55 };

		for (int i = 0; i < data.length; i++) {
			if (data[0] > data[i]) { // �迭�� ù �����ͺ��� �������� �ִ��� �˻�
				int temp = data[0]; // �ִٸ� ����
				data[0] = data[i];
				data[i] = temp;
			}
		}

		// ���
		// 38,45,62,70,55,85,92,40,30,55 �� �迭��
		// 30,45,62,70,55,85,92,40,38,55 ���� ����
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]);
			System.out.print("\t");
		}
		System.out.println();
	}
}
