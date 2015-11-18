public class Student{
	private String name;
	private int year;
	private Student next;
	private Student prev;

		public String getName(){
			return name;
		}
		
		public void setName(String name){
			this.name = name;
		}
		
		public int getYear(){
			return year;
		}
		
		public void setYear(int year){
			this.year = year;
		}
		
		public Student getNext(){
			return next;
		}
		public void setNext(Student nextStudent){
			this.next = nextStudent;
		}
		
		public Student getPrev(){
			return prev;
		}
		
		public void setPrev(Student prevStudent){
			this.prev = prevStudent;
		}
		
		
}
