
public class MainClass {
	public static void main(String[] arg) {
		
		ParentClass[] pArr = new ParentClass[2];
		
		ParentClass fch = new FirstChildClass();
		ParentClass sch = new SecondChildClass();
		
		pArr[0] = fch;
		pArr[1] = sch;
		
		for(int i= 0; i<pArr.length; i++) {
			System.out.println(pArr[i]);
		}
	}
}
