import java.util.*;
public class SelectionSort5 {
	public static void main(String[] args) {
		//��������
		//38,45,62,70,55,85,92,40,30,55�� ���ʺ��� ������������ �����Ͻÿ�
				
		// 5.�ݺ����� ����Ͽ� ���� �� ���� �� ������ �����Ѵ�.
		int[] data = new int[] {38,45,62,70,55,85,92,40,30,55};
		
		for(int k = 0; k < data.length-1; k++) { //�������� ���� ���ص� ������ ����-1
			int index = k;//���� ���� ���� ��ġ��� ����
			for(int i = k+1; i < data.length; i++) {//�迭 �����͸� ���ʺ��� �˻��Ͽ� ���� �������� ã�� �����͸� ������.
				if(data[index] > data[i]) {					
					index = i;
				}
			}		
			
			//������ ���� �������� ����
			//���� �ڵ�
			if(data[k]!=data[index]) { //���� ���� ���̶�� �����ߴ����� ����� ���� ���Ͽ� ����
				int temp = data[k]; //temp��� ����Ҹ� �����Ͽ� ��� ����
				data[k] = data[index];
				data[index] = temp;
			}
		}
				
		
		//�迭 ���
		//38,45,62,70,55,85,92,40,30,55 �� �迭��
		//30,38,40,45,55,55,62,70,85,92 �� ����
		for(int i = 0; i < 10; i++) { //10���� �迭 ������ �̹Ƿ� 10�� �ݺ��Ͽ� ���
			System.out.print(data[i]);
			System.out.print("\t");
		}
		System.out.println();
		
	}
}
