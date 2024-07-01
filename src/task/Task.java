/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task;

/**
 *
 * @author RC_Student_lab
 */
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task {
    String enteredUserName; 
    String enteredPassword; 
     String firstName ; 
     String surname ; 
   String password ; 
     String userName ; 
    public boolean checkUsername(){
        
    
   boolean check=false;
    for(int i=0; i<userName.length(); i++){
   if(userName.length() <=5){
       
   if((int)userName.charAt(i) ==95)
       check=true;
   }
    }
    return check;
   } 
    
     public boolean checkPasswordComplexity(){

         boolean CapitalLetter=false;  
  boolean Number =false;
  boolean Special=false;
 for(int i=0; i<password.length(); i++){
   if(password.length() >= 8){ 
   if((int)password.charAt(i) >65 &&(int)password.charAt(i) <=90) {
       CapitalLetter=true;
   }  
  if((int)password.charAt(i) >=48 &&(int)password.charAt(i) <=57){
       Number=true;
               }          
   if((int)password.charAt(i) >=33 &&(int)password.charAt(i) <=47 || 
           (int)password.charAt(i) >=58 &&(int)password.charAt(i) <=64 || 
           (int)password.charAt(i) >=91 &&(int)password.charAt(i) <=96 || 
           (int)password.charAt(i) >=123 &&(int)password.charAt(i) <=126)   
          Special=true;
   }

       
   }
return CapitalLetter && Number && Special;
}

                
    
  public String registerUser(){
 
  if(checkUsername()==true){
           System.out.println("Username succefully captured.");
       }else{
           System.out.println("Username is not correctly formatted,please ensure that your Username contains an underscore and is no more than 5 characters in length.");
       }   
       if(checkPasswordComplexity()==true){
           System.out.println("Password succefully captured.");
       }else{
           System.out.println("Password is not correctly formatted please ensure that the password contains atleast 8characters, a capital letter , a number and a special character.");
       }
           if(checkUsername()==true && (checkPasswordComplexity()==true)){
         System.out.println("The two above conditions have been met and the user has been registered succefully.");  
         
           }
         if(checkPasswordComplexity()==false){
               System.out.println("The Password does not meet the complexity requirements.");      
         }
     if(checkUsername()==false){
         System.out.println("The username is incorrectly formatted.");
         
     }
      

       return("") ;
}
 
  public boolean loginUser(){
      
 boolean Compare=false;
   
 if(userName.equals(enteredUserName) && (password.equals(enteredPassword))){
     
     Compare=true;
 }
    return Compare;
}
 
 public String returnLoginStatus(){
         
     
if(loginUser()==true) {
    
    
    System.out.println("succeful login");
    
        System.out.println("welcome " +" "+ firstName+" " +" "+ " "+surname+" " + " it is great to see you again " );

}
else{

     System.out.println("A failed login"); 
     System.out.println("Username or Password incorrect please try again");
            
}  
     

    return"";
} 
    private static int taskCount = 0;
    private String taskName;
    private int taskNumber;
    private String taskDescription;
    private String developerDetails;
    private double taskDuration;
    private String taskID;
    private String taskStatus;

    public Task() {
        taskNumber = taskCount;
        taskCount++;
    }

    public boolean checkTaskDescription() {
        return taskDescription.length() <= 50;
    }

   
    public String createTaskID() {
         taskID = taskName.substring(0, 2).toUpperCase() + ":" + taskNumber + ":" +
                developerDetails.substring(developerDetails.length() - 3).toUpperCase();
        return taskID;
    }


    public String printTaskDetails() {
        return   "\nTask Number: " + taskNumber +
                 "\nTask Status: " + taskStatus +
                "\nDeveloper Details: " + developerDetails +
                "\nTask Name: " + taskName +
                "\nTask Description: " + taskDescription +
                "\nTask ID: " + taskID +
                "\nTask Duration: " + taskDuration + " hours";
    }

    public static int returnTotalHours(List<Task> tasks) {
        int totalHours = 0;
        for (Task task : tasks) {
            totalHours += task.taskDuration;
        }
        return totalHours;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
Task login = new Task();
                 System.out.println("Register..........");
         System.out.println("Enter FirstName :");// prompt the user to enter to enter first name
           login.firstName=input.next();// holds the input from the user
System.out.println("Enter LastName :");// prompt the user to enter lastname
           login.surname=input.next();// holds the input from the user 
            System.out.println("Enter UserName :");// prompt the create || add a user name
                    login.userName=input.next();// holds the input from the user
           System.out.println("Enter Password :");// prompt the create || add a password
                    login.password=input.next();// holds the input from the user
                    
System.out.println(login.registerUser());  // return the message wheather the user registered sucefully or not 
while(login.checkUsername()==false || (login.checkPasswordComplexity()==false)){
    System.out.println("Try to register again!!!!!");
      System.out.println("Enter UserName :");// prompt the create || add a user name
                    login.userName=input.next();// holds the input from the user
           System.out.println("Enter Password :");// prompt the create || add a password
                    login.password=input.next();// holds the input from the user
                    System.out.println(login.registerUser());  // return the message wheather the user registered sucefully or not 

}
              System.out.println("Login..........");
              System.out.println("Enter Username :");// prompt the user to enter the username they used login 
     login.enteredUserName=input.next();// holds the input from the user
    System.out.println("Enter Password :");// prompt the user to enter the password they used login 
       login.enteredPassword=input.next();// holds the input from the user
       System.out.println(login.returnLoginStatus());// return the message wheather the user logged sucefully or not  
       
while(login.loginUser()==false){
    System.out.println(" Try to Login again ..........");
              System.out.println("Enter Username :");// prompt the user to enter the username they used login 
     login.enteredUserName=input.next();// holds the input from the user
    System.out.println("Enter Password :");// prompt the user to enter the password they used login 
       login.enteredPassword=input.next();// holds the input from the user
       
      System.out.println(login.returnLoginStatus());// return the message wheather the user logged sucefully or not  
          }
        if (login.loginUser()==true) { // if the user loggged in sucefully the code will the user to add tasks
        JOptionPane.showMessageDialog(null, "Welcome to Mhlambi's branch");

        List<Task> tasks = new ArrayList<>();
        List<String> developers = new ArrayList<>();
        List<String> taskNames = new ArrayList<>();
        List<String> taskIDs = new ArrayList<>();
        List<Double> taskDurations = new ArrayList<>();
        List<String> taskStatuses = new ArrayList<>();

        int option;
        do {
            option = Integer.parseInt(JOptionPane.showInputDialog(
                    "Please choose an option:\n" +
                            "1) Add tasks\n" +
                            "2) Show report\n" +
                            "3) Quit"
            ));

            switch (option) {
                case 1:
                    int numTasks = Integer.parseInt(JOptionPane.showInputDialog(
                            "Enter the number of tasks you wish to enter:"
                    ));

                    for (int i = 0; i < numTasks; i++) {
                        Task task = new Task();

                        task.taskName = JOptionPane.showInputDialog("Enter task name:");
                        task.taskDescription = JOptionPane.showInputDialog("Enter task description:");

                        while (!task.checkTaskDescription()) {
                            JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters");
                            task.taskDescription = JOptionPane.showInputDialog("Enter task description:");
                        }

                        task.developerDetails = JOptionPane.showInputDialog("Enter developer details:");
                        task.taskDuration = Double.parseDouble(JOptionPane.showInputDialog("Enter task duration:"));

                        task.createTaskID();

                        Object[] taskOptions = {"To Do", "Done", "Doing"};
                        int statusOption = JOptionPane.showOptionDialog(null, "Select task status:", "Task Status",
                                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, taskOptions, taskOptions[0]);

                        task.taskStatus = (String) taskOptions[statusOption];

                        tasks.add(task);
                        developers.add(task.developerDetails);
                        taskNames.add(task.taskName);
                        taskIDs.add(task.taskID);
                        taskDurations.add(task.taskDuration);
                        taskStatuses.add(task.taskStatus);

                        JOptionPane.showMessageDialog(null, task.printTaskDetails());
                    }
                    break;
 case 2:
                    int reportOption;
                    do {
                        reportOption = Integer.parseInt(JOptionPane.showInputDialog(
                                "Select a report option:\n" +
                                        "1) Display tasks with status 'Done'\n" +
                                        "2) Display developer and duration of the longest task\n" +
                                        "3) Search task by name\n" +
                                        "4) Delete task by name\n" +
                                        "5) Display full task report\n" +
                                        "6) Exit"
                        ));

                        switch (reportOption) {
                            case 1:
                                StringBuilder doneTasks = new StringBuilder();
                                for (Task task : tasks) {
                                    if (task.taskStatus.equalsIgnoreCase("Done")) {
                                        doneTasks.append(task.printTaskDetails()).append("\n");
                                    }
                                }
                                JOptionPane.showMessageDialog(null, doneTasks.toString());
                                break;

                            case 2:
                                double longestDuration = 0;
                                String longestDeveloper = "";
                                for (Task task : tasks) {
                                    if (task.taskDuration > longestDuration) {
                                        longestDuration = task.taskDuration;
                                        longestDeveloper = task.developerDetails;
                                    }
                                }
                                JOptionPane.showMessageDialog(null,
                                        "Developer with longest task duration: " + longestDeveloper +
                                                "\nDuration: " + longestDuration + " hours");
                                break;

                            case 3:
                                String searchTaskName = JOptionPane.showInputDialog("Enter task name to search:");
                                StringBuilder taskResult = new StringBuilder();
                                for (Task task : tasks) {
                                    if (task.taskName.equalsIgnoreCase(searchTaskName)) {
                                        taskResult.append(task.printTaskDetails()).append("\n");
                                    }
                                }
                                JOptionPane.showMessageDialog(null, taskResult.toString());
                                break;

                            case 4:
                                String deleteTaskName = JOptionPane.showInputDialog("Enter task name to delete:");
                                boolean taskDeleted = false;
                                for (int i = 0; i < tasks.size(); i++) {
                                    Task task = tasks.get(i);
                                    if (task.taskName.equalsIgnoreCase(deleteTaskName)) {
                                        tasks.remove(task);
                                        taskDeleted = true;
                                        break;
                                    }
                                }
                                if (taskDeleted) {
                                    JOptionPane.showMessageDialog(null, "Task deleted successfully");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Task not found");
                                }
                                break;

                            case 5:
                                StringBuilder taskReport = new StringBuilder();
                                for (Task task : tasks) {
                                    taskReport.append(task.printTaskDetails()).append("\n");
                                }
                                JOptionPane.showMessageDialog(null, taskReport.toString());
                                break;

                            case 6:
                                JOptionPane.showMessageDialog(null, "Exiting the report");
                                break;

                            default:
                                JOptionPane.showMessageDialog(null, "Invalid report option");
                                break;
                        }
                    } while (reportOption != 6);
                    break;
                
                case 3:
                    JOptionPane.showMessageDialog(null, "Exiting the application");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Invalid option");
                    break;
            }
        } while (option != 3);
    }
    }
}
