import java.util.*;
public class RandomAgent {
    public static void main(String[] args) throws Exception {

        //get the input
        Scanner in = new Scanner(System.in);


        //loop to set up the scanner
        while(true){
            System.out.println("Want a Random Agent?? Say YES then" );
            System.out.println("Otherwise Say NO");
            String myResponse = in.nextLine();
            

            // check if they said no
            if(myResponse.equals("NO")){
                break;
            }
            //verify that the move is valid
            if(!myResponse.equals("YES")){
                System.out.println("this isn't a valid response");

            }else{

         // randomly generate a random weapon choice from the valorant lineup 
         int rand = (int)(Math.random() * 15);
         String agent;

         if(rand == 0){
             agent = " Brimstone";

         }else if(rand == 1){
             agent = " Viper";

         }else if(rand == 2){
             agent = " Omen";

         }else if(rand == 3){
             agent = " Killjoy";

         }else if(rand == 4){
             agent = " Cypher";

         }else if(rand == 5){
             agent = " Sova";

         }else if(rand == 6){
             agent = " Sage";

         }else if(rand == 7){
             agent = " Phoenix";

        }else if(rand == 8){
            agent = " Jett";

        }else if(rand == 9){
            agent = " Reyna";

        }else if(rand == 10){
            agent = " Raze";

        }else if(rand == 11){
            agent = " Breach";

        }else if(rand == 12){
            agent = " Skye";

        }else if(rand == 13){
            agent = " Yoru";

        }else{
            agent = " Astra";
        }
        System.out.println("You Must Play" + agent);

        

       
        
    }
}
    }
}