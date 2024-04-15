package demostudent;

public class student implements Comparable <student> {
   int rollno;
   String name;
   double markes;
   
   public student()
   {
	   
   }
   public student(int rollno,String name,double markes) {
	   this.name=name;
	   this.rollno=rollno;
	   this.markes=markes;
   }
@Override
public String toString() {
	return "student [rollno=" + rollno + ", name=" + name + ", markes=" + markes + "]";
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	student other = (student) obj;
	return rollno == other.rollno;
	
	
}
@Override
public int compareTo(student o) {
	return this.rollno - o.rollno;
	
}
}
