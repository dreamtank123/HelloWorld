import java.util.ArrayList;

class ToDos {
	
	public static void main(String[] args) {
		
		ArrayList<String> toDoList = new ArrayList<String>();
		String toDo1 = "Water plants";
		// Add more to-dos here;
		String toDo2 = "Do laundry";
		String toDo3 = "pet Ham and Ghotiuntil they purr";
		
		// Add to-dos to toDolist
		toDoList.add(toDo1);
		toDoList.add(toDo2);
		toDoList.add(toDo3);
		
		System.out.println(toDoList);
	}
}