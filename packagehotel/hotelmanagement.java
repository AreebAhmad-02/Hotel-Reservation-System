package packagehotel;
import java.time.*;
import java.util.Scanner;

public class hotelmanagement{
    static Scanner input = new Scanner(System.in);
    static LocalDate ChecIndateOfHoteling;
    static LocalDate checOutDate;
    static String ChoiceOfHotelling;
    
    static int numberOfAdults;
  
    static int numberOfChildren;
    static int totalBill;
    static String Feedback;
    static String ChoiceOfFood;
    static String finalMeal;
    static int mealBill;
    static String timeslot;
    static String ChoiceOfRoom;
    static int NumberOFBeds;
    static boolean RoomService;
    public static Stayin customer  ;
    static double fareOfRoomPerNight;
    public static void main(String[] args) {
 
        System.out.println("Welcome to Nile Hotel Respected Customer\nPlease fill the below formalities for booking");
        System.out.print(" Enter Your name for booking: ");
        String name = input.nextLine();
        System.out.print("Enter the number of adults: ");
        numberOfAdults = input.nextInt();
        System.out.print("Enter the number of Children: ");
        numberOfChildren = input.nextInt();
        SetChoiceOfHotelling();
        
        if(ChoiceOfHotelling=="Dine-in"){
            ShowAndSetcheckInDates();
            SelectFood();
            askTime();
            dinein customerId = new dinein(name, ChoiceOfHotelling, ChecIndateOfHoteling, numberOfAdults, 
            numberOfChildren, ChoiceOfFood,timeslot);
            
            System.out.println(customerId.displayinfo());
            System.out.println(customerId.getFinalMeal());
            askFeedback();
            customerId.feedback = Feedback;
            
        }
        
        else if (ChoiceOfHotelling== "Stay-in"){
            ShowAndSetcheckInDates();
            ShowAndSetcheckOutDates();
            showAndSetChoiceOfRooms();
            showAndSetRoomCapacity();
            
            askRoomService();
            customer = new Stayin(name, ChoiceOfHotelling, ChecIndateOfHoteling, checOutDate, numberOfAdults,
             numberOfChildren, ChoiceOfRoom, NumberOFBeds, RoomService,fareOfRoomPerNight);
            System.out.println(customer.getStayinFare());;
            System.out.println(customer.displayinfo());
            askFeedback();
            customer.feedback = Feedback;
            
        }

     
        
   
    }
  
    static void SetChoiceOfHotelling(){
        System.out.println("please Enter 1 for Dine-in and Enter 2 for stay-in ");
        int choice = input.nextInt();
        if(choice ==1 )
            ChoiceOfHotelling = "Dine-in";
        else if(choice==2)
            ChoiceOfHotelling = "Stay-in";
        else
        {System.out.println("Enter relevant number");
        SetChoiceOfHotelling();}
        
    }

    static String SelectFood(){
        
        System.out.println("Welcome to Nile hotel Dine-in Service\nPlease Select the Choice of meal you want to have.");
        System.out.println("Enter 1 for Breakfast\nEnter 2 for lunch\nEnter 3 for Dinner");
        int mealNumber = input.nextInt();
        switch(mealNumber){
            case 1 :
            ChoiceOfFood= "Breakfast";
            break;
            case 2:
            ChoiceOfFood = "Lunch";
            break;
            case 3:
            ChoiceOfFood = "Dinner";
            break;
            default:
            System.out.println(" please select the relevant number");
            break;
        }
        return ChoiceOfFood;

    }
    public static void askRoomService(){
        System.out.println(" Enter true for Room Service and fasle if you donot want it");
        System.out.println("please note that we charge 15 % for Room Service in which laundry is included and  Dine-in is free");
        RoomService = input.nextBoolean();
    }



    public static void ShowAndSetcheckInDates(){
        LocalDate today = LocalDate.now(); 
        System.out.println("\nCurrent Date: "+today);
        System.out.println("Available Dates for hotelling are");
        for(int x=1;x<11;x++){
           
           System.out.println(x+"."+today.plusDays(x)+"\n");
        }
        System.out.print("Please Enter the Releavant Serial number from Available dates for Booking: ");
        int DateNumber = input.nextInt();
   
            switch(DateNumber){
                case 1 :
                ChecIndateOfHoteling = today.plusDays(1);
                break;
                case 2 :
                hotelmanagement.ChecIndateOfHoteling = today.plusDays(2);
                break;
                case 3 :
                hotelmanagement.ChecIndateOfHoteling = today.plusDays(3);
                break;
                case 4 :
                hotelmanagement.ChecIndateOfHoteling = today.plusDays(4);
                break;
                case 5 :
                hotelmanagement.ChecIndateOfHoteling = today.plusDays(5);
                break;
                case 6 :
                hotelmanagement.ChecIndateOfHoteling = today.plusDays(6);
                break;
                case 7 :
                hotelmanagement.ChecIndateOfHoteling = today.plusDays(7);
                break;
                case 8 :
                hotelmanagement.ChecIndateOfHoteling = today.plusDays(8);
                break;
                case 9 :
                hotelmanagement.ChecIndateOfHoteling = today.plusDays(9);
                break;
                case 10 :
                hotelmanagement.ChecIndateOfHoteling = today.plusDays(10);
                break;
                default:
                System.out.println("please Enter the relevant Serial Number of date");
                ShowAndSetcheckInDates();
                break;
                
            }
            
       }
       public static void ShowAndSetcheckOutDates(){
           
           
           System.out.println("Please Select the Check-out Date");
           for(int x=1;x<11;x++){
              
              System.out.println(x+"."+ChecIndateOfHoteling.plusDays(x)+"\n");
           }
           System.out.print("Please Enter the Releavant Serial number from Available dates for Booking: ");
           int DateNumber = input.nextInt();
      
               switch(DateNumber){
                   case 1 :
                   hotelmanagement.checOutDate= ChecIndateOfHoteling.plusDays(1);
                   break;
                   case 2 :
                   hotelmanagement.checOutDate= ChecIndateOfHoteling.plusDays(2);
                   break;
                   case 3 :
                   hotelmanagement.checOutDate= ChecIndateOfHoteling.plusDays(3);
                   break;
                   case 4 :
                   hotelmanagement.checOutDate= ChecIndateOfHoteling.plusDays(4);
                   break;
                   case 5 :
                   hotelmanagement.checOutDate= ChecIndateOfHoteling.plusDays(5);
                   break;
                   case 6 :
                   hotelmanagement.checOutDate= ChecIndateOfHoteling.plusDays(6);
                   break;
                   case 7 :
                   hotelmanagement.checOutDate= ChecIndateOfHoteling.plusDays(7);
                   break;
                   case 8 :
                   hotelmanagement.checOutDate= ChecIndateOfHoteling.plusDays(8);
                   break;
                   case 9 :
                   hotelmanagement.checOutDate= ChecIndateOfHoteling.plusDays(9);
                   break;
                   case 10 :
                   hotelmanagement.checOutDate= ChecIndateOfHoteling.plusDays(10);
                   ShowAndSetcheckOutDates();
                   break;
                   
               }
           }
           public static void showAndSetChoiceOfRooms(){
            System.out.println("The available rooms are");
            System.out.println("1. King.....Rs.10000(Per Night)\n2. Queen.....Rs.12000(Per Night)\n3. Luxury.....Rs.14000(Per Night)");
            System.out.println("Enter the relevant number for choice of rooms from above");
            int ChoiceOfRoomNumber = input.nextInt();
        
            switch(ChoiceOfRoomNumber){
                case 1:
                ChoiceOfRoom="King";
                fareOfRoomPerNight=10000;
                break;
                case 2:
                ChoiceOfRoom="Queen";
                fareOfRoomPerNight=12000;
                break;
                case 3:
                ChoiceOfRoom="Luxury";
                fareOfRoomPerNight=14000;
                break;
        
            }
        
        }
        public static void showAndSetRoomCapacity(){
         System.out.println("PLease Select the room according to number beds");
         System.out.println("1. Single \n2. Double\n3. Triple\n4. Quadruple");
         System.out.println("Enter the relevant number for beds in rooms from above");
         int RoomCapacityNumber = input.nextInt();
         switch(RoomCapacityNumber){
            case 1:
            NumberOFBeds=1;
            break;
            case 2:
            NumberOFBeds=2;
            break;
            case 3:
            NumberOFBeds=3;
            break;
            case 4:
            NumberOFBeds=4;
            break;
            default:
            System.out.println("please enter the relevant number");
            break;
        
                }
            }
           


public static void askTime(){
    System.out.print("PLease Enter the Time at which you want to dine-in: ");
     timeslot = input.next();
       
    
    }
public static void askFeedback(){
    System.out.print("Please tell us about your reviews about Nile Hotel: ");
    String reviews = input.nextLine();
    System.out.print("PLease rate Our Hotel out of 10: ");
    String rate = input.nextLine();
    System.out.println("PLease tell us if you have any suggestion: ");
    String suggestion = input.nextLine();
    System.out.println("We really admire your feedback and we hope you will again use Nile hotel Services ");
    Feedback = " reviews: " + reviews + "\nrating: " + rate + "\nsuggestion: " + suggestion;
            
                }
        
}


