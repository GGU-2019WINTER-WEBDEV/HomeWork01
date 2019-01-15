
import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr1 = new ArrayList<String>();//<String>은 제네릭:한 클래스에는 한 객체의 종류만 저장
		arr1.add("유민우");
		arr1.add(1,"황어준");
		arr1.add("박순규");
		arr1.add("안종길");
		System.out.println(arr1);
		
		ArrayList<String> arr2 = new ArrayList<String>();
		arr2.add("박은빛");
		arr2.add("정세현");
		arr2.add("이태행");
		arr2.add("이영준");
		arr2.add("김용성");
		
		arr1.addAll(arr2);//arr1.addAll(arr2);
		System.out.println(arr1);
		
		arr2.remove(3);
		System.out.println(arr2);
		
		arr2.clear();
		System.out.println(arr2);
		
		arr1.removeAll(arr2);
		arr1.set(3, "장성훈");
		System.out.println(arr1);
		
		
		

	}

}
