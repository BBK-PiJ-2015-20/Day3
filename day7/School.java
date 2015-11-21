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
	
	public void deleteStudent(String name){
		if(name.equals(studentListStart.getName())){
			studentListStart = studentListStart.getNext();
			studentListStart.setPrev(null);
		}
		else {
			Student current = studentListStart;
			while((current.getNext() != null) && (!name.equals(current.getName())))
				current = current.getNext();
			if (current == null)
				return;
			else{
				current.getPrev().setNext(current.getNext());
				current.getNext().setPrev(current.getPrev());
				return;
			}
			}
		}
	
}