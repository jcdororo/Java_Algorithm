import java.util.*;
public class SelectionSort3 {
	public static void main(String[] args) {
		//��������
		//38,45,62,70,55,85,92,40,30,55�� ���ʺ��� ������������ �����Ͻÿ�
				
		// 3.�迭�� ���� ���� ���� �� �տ� ��ġ��ų �� �˾ƾ��Ѵ�.
		int[] data = new int[] {38,45,62,70,55,85,92,40,30,55};
				
		int index = 0;     //���� ���� ���� ��ġ��� ����
		
		for(int i = 0; i < data.length; i++) {//�迭 �����͸� ���ʺ��� �˻��Ͽ� ���� �������� ã�� �����͸� ������.
			if(data[index] > data[i]) {
				index = i;
			}
		}
		
		//���� �� �տ� ��ġ��Ų��.
		//��ġ �ڵ�
		if(data[0]!=data[index]) { //����� ���� ���� �� �տ� ��ġ
			data[0] = data[index];
		}
		
		//�迭 ���
		//38,45,62,70,55,85,92,40,30,55 �� �迭��
		//30,45,62,70,55,85,92,40,30,55 �� ����
		for(int i = 0; i < 10; i++) { //10���� �迭 ������ �̹Ƿ� 10�� �ݺ��Ͽ� ���
			System.out.print(data[i]);
			System.out.print("\t");
		}
		System.out.println();
	}
}
