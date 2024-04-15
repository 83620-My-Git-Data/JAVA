package demostudent;
import java.util.Comparator;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class program1 {

	public static void main(String[] args) {
//		List<student>stdList= new ArrayList<>();
		List<student> stdList = new LinkedList<>();
//				 List<Employee> stdList = new Vector<>();

	stdList.add(new student(1,"ram",320));
	stdList.add(new student(2,"harshit",400));
	stdList.add(new student(3,"rahul",240));
	stdList.add(new student(4,"rohan",380));
	stdList.add(new student(5,"tushar",530));
	stdList.add(new student(6,"ujjwal",260));
	System.out.println("before sort- ");
	for(student stud:stdList)
	System.out.println(stud);
	
//	natural order sorting...
//	System.out.println("after sort- ");
//	Collections.sort(stdList);
//	for(student stud:stdList)
//		System.out.println(stud);
//	
	System.out.println("sorting on name-   ");
	class stdnameComparator implements Comparator<student> {
		@Override
		public int compare(student o1, student o2) {
			return o1.name.compareTo(o2.name);
		}
	}
		Comparator<student> stdnameComparator = new stdnameComparator();
		Collections.sort(stdList, stdnameComparator);

		for (student stud : stdList)
			System.out.println(stud);

		student std = new student();
		std.rollno = 3;
		if (stdList.contains(std.rollno))
			System.out.println("student exists");
		else
			System.out.println("student not found");
	
	}	
	
}
