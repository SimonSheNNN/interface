


public class TaskDriver
{
	   public static void main(String args[])
	   {
	      Task task1 = new Task("TASK1");
	      task1.setPriority(10);
	      Task task2 = new Task("TASK2");
	      task2.setPriority(2);
	      Task task3 = new Task("TASK3");
	      task3.setPriority(5);
	      Task task4 = new Task("TASK4");
	      task4.setPriority(8);

	      
	      System.out.println(task1.getName()+": Priority:"+task1.getPriority());
	      System.out.println(task2.getName()+": Priority:"+task2.getPriority());
	      System.out.println(task3.getName()+": Priority:"+task3.getPriority());
	      System.out.println(task4.getName()+": Priority:"+task4.getPriority());
	      
	      
	   }
}
	

