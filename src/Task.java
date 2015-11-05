public class Task implements Priority
{
   private int priority;
   String name;

   public Task(String taskName)
   {
      name = taskName;
   }

   String getName()
   {
      return name;
   }
   
   
   @Override
   public void setPriority(int prio)
   {
      priority = prio;
   }
   @Override
   public int getPriority()
   {
      return priority;
   }
}
