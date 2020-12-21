import java.util.*;



public class RockSissorsPaper{
    public static void main(String[] cmdLn){
        
        
        
        
        boolean correct = false;
        String input = "";
        Scanner s = new Scanner(System.in);
        while(!correct){
            System.out.print("Rock,Paper,Sissor? : ");
            input = s.nextLine();
            input = input.toLowerCase();
        if(input.equals("rock")||input.equals("paper")||input.equals("sissor")){
         correct=true;
        }else {
        System.out.println("Please enter valid input");
            
        }
            
        }

        
     
    Random r = new Random();
     String cpu1="";
    int number = 1 + r.nextInt(3 - 1);
    if(number == 1){
     cpu1 = "paper";
    }if(number == 2){
    cpu1= "rock";
    }if(number == 3){
    cpu1 = "sissor";
    }
        System.out.println(" ");

        System.out.println( "You choose: "+ input);
        System.out.println("Computer choose: "+ cpu1);
        System.out.println(" ");

        
        
        
        String  user = input;
      String cpu = cpu1;
       if(user.equals(cpu)){
           System.out.print("TIE: ");
       } else if (user.equals("paper") && cpu.equals("sissor") || user.equals("rock") && cpu.equals("paper") || user.equals("sissor") && cpu.equals("rock")) {
           System.out.print("You lose: ");
           
           }else{
               System.out.println("You won: ");
               
           }

        System.out.println(" ");



   
}
    }
