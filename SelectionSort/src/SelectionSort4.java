import java.util.*;
public class SelectionSort4 {
	public static void main(String[] args) {
		//��������
		//38,45,62,70,55,85,92,40,30,55�� ���ʺ��� ������������ �����Ͻÿ�
		
		// 4.�Ǿտ� ��ġ��Ű�� ��ġ��Ų ���� �ٲ� ���� ������ �� �� �˾ƾ��Ѵ�.
		int[] data = new int[] {38,45,62,70,55,85,92,40,30,55};
				
		int index = 0;     //���� ���� ���� ��ġ��� ����
		
		for(int i = 0; i < data.length; i++) {//�迭 �����͸� ���ʺ��� �˻��Ͽ� ���� �������� ã�� �����͸� ������.
			if(data[index] > data[i]) {				
				index = i;
			}
		}
				
		//������ ���� �������� ����
		//���� �ڵ�
		if(data[0]!=data[index]) { //���� ���� ���̶�� �����ߴ����� ����� ���� ���Ͽ� ����
			int temp = data[0]; //temp��� ����Ҹ� �����Ͽ� ��� ����
			data[0] = data[index];
			data[index] = temp;
		}
		
		//�迭 ���
		//38,45,62,70,55,85,92,40,30,55 �� �迭��
		//30,45,62,70,55,85,92,40,38,55 �� ����
		for(int i = 0; i < 10; i++) { //10���� �迭 ������ �̹Ƿ� 10�� �ݺ��Ͽ� ���
			System.out.print(data[i]);
			System.out.print("\t");
		}
		System.out.println();
	}
}
