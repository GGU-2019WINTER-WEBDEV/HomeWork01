
import java.util.ArrayList;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr1 = new ArrayList<String>();//<String>�� ���׸�:�� Ŭ�������� �� ��ü�� ������ ����
		arr1.add("���ο�");
		arr1.add(1,"Ȳ����");
		arr1.add("�ڼ���");
		arr1.add("������");
		System.out.println(arr1);
		
		ArrayList<String> arr2 = new ArrayList<String>();
		arr2.add("������");
		arr2.add("������");
		arr2.add("������");
		arr2.add("�̿���");
		arr2.add("��뼺");
		
		arr1.addAll(arr2);//arr1.addAll(arr2);
		System.out.println(arr1);
		
		arr2.remove(3);
		System.out.println(arr2);
		
		arr2.clear();
		System.out.println(arr2);
		
		arr1.removeAll(arr2);
		arr1.set(3, "�强��");
		System.out.println(arr1);
		
		
		

	}

}
