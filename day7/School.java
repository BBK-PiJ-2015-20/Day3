public class School{
	private Student studentListStart = null;
	
	public School(){
	this.studentListStart = null;}
	
	public void enrolStudent(String name, int year){
		Student newStudent = new Student(name, year);
		
		if (this.studentListStart == null){
				this.studentListStart = newStudent;
				return;
		}
		else {
			Student current = studentListStart;
			while(current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(newStudent);
			newStudent.setPrev(current);
			return;
		}
		
	}
}