import java.util.*;
public class SelectionSort2 {
	public static void main(String[] args) {
		//��������
		//38,45,62,70,55,85,92,40,30,55�� ���ʺ��� ������������ �����Ͻÿ�
					
		// 2.���� �� ��ġ�� ���� ���� ����� ������ �� ���� ���� �ִ��� �˻��Ѵ�.
		int[] data = new int[] {38,45,62,70,55,85,92,40,30,55};
		
		int min = data[0]; //���� �������̶�� ����
		int index = 0;     //���� ���� ���� ��ġ��� ����
		
		for(int i = 0; i < data.length; i++) {//�迭 �����͸� ���ʺ��� �˻��Ͽ� ���� �������� ã�� �����͸� ������.
			if (data[index] > data[i]) {
				min = data[i];
				index = i;
			}
			
		}
		System.out.println("�迭 ������ �� ���� �������� "+min+"�Դϴ�.");
		System.out.println("���� ���� ���� ��ġ�� "+"data["+index+"]�Դϴ�.");
	}
}
