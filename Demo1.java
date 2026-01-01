class Bird {}
class Eagle extends Bird {}
public class Demo1{

	public static void main(String[] args){

		Eagle eagle = new Eagle();
		Bird bird = new Eagle();
		System.out.println(eagle instanceof Bird);
		System.out.println(bird instanceof Bird);
		System.out.println(bird instanceof Eagle);
		System.out.println(bird instanceof Object);

		Object obj = new String();

		System.out.println(obj instanceof String);

		String myName = "Arham";
		double myDouble = 2.45;

		System.out.println(myName.getClass());
		//System.out.println(myDouble.getClass().getSimpleName());

		String num = "56";
		int num1 = Integer.parseInt(num);

		System.out.println(((Object)num1).getClass().getSimpleName());

		

	}

}

