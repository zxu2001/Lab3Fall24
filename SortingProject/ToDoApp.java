public class ToDoApp {
    public static void main(String[] args) {
        ToDoModel model = new ToDoModel();
        ToDoView view = new ToDoView();
        ToDoController controller = new ToDoController(model, view);

        controller.addTask("Buy groceries");
        controller.addTask("Finish work project");
        controller.addTask("Go to the gym");

               // Display the initial To-Do list
               controller.displayToDoList();

               // Add a new task
               controller.addTask("Read a book");
       
               // Display the updated To-Do list
               controller.displayToDoList();
           }
       }