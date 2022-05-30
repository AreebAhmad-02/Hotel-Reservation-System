package packagehotel;
import java.time.*;
import java.util.Scanner;

class hoteling{
    String name;
    String ChoiceOfHotelling;
    
    int NumberOfAdults;
  
    int NumberOfChildren;
    double totalBill;
    String Feedback;
    LocalDate ChecIndateOfHoteling;
    Scanner input = new Scanner(System.in);
    hoteling(){System.out.println("Hello , there Welcome to the Nile Hotel.");}

    hoteling(String name,String ChoiceOfHotelling,LocalDate dateOfHoteling, int numberOfAdults,int numberOfChildren){
        this.setChoiceOfHotelling(ChoiceOfHotelling);
        this.setName(name);
        this.setDateOfHoteling(dateOfHoteling);
        this.setNumberOfAdults(numberOfAdults);
        this.setNumberOfChildren(numberOfChildren);

    }
    
    hoteling(String name,String ChoiceOfHotelling,LocalDate dateOfHoteling, int numberOfAdults,int numberOfChildren,String Feedback, int totalBill){
        this.setChoiceOfHotelling(ChoiceOfHotelling);
        this.setName(name);
        this.setDateOfHoteling(dateOfHoteling);
        this.setFeedback(Feedback);
        this.setNumberOfAdults(numberOfAdults);
        this.setNumberOfChildren(numberOfChildren);
   
        this.setTotalBill(totalBill);
        
        
    }
  
    public void setChoiceOfHotelling(String choiceOfHotelling) {
        ChoiceOfHotelling = choiceOfHotelling;
    }
   
    
    public void setDateOfHoteling(LocalDate dateOfHoteling) {
        this.ChecIndateOfHoteling = dateOfHoteling;
    }
    public void setFeedback(String feedback) {
        Feedback = feedback;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNumberOfAdults(int numberOfAdults) {
        NumberOfAdults = numberOfAdults;
    }
    public void setNumberOfChildren(int numberOfChildren) {
        NumberOfChildren = numberOfChildren;
    }
    
    public void setTotalBill(double d) {
        this.totalBill = d;
    }
    public String getChoiceOfHotelling() {
        return ChoiceOfHotelling;
    }
   
    public LocalDate getDateOfHoteling() {
        return ChecIndateOfHoteling;
    }
    public String getFeedback() {
        return Feedback;
    }public String getName() {
        return name;
    }
    public int getNumberOfAdults() {
        return NumberOfAdults;
    }
    public int getNumberOfChildren() {
        return NumberOfChildren;
    }
    
    public double getTotalBill() {
        return totalBill;
    }

    
    
}

class dinein extends hoteling{
    String ChoiceOfFood; // selects breakfast, lunch or dinner
    String finalMeal;
    int mealBill;
    String timeslot;
    public String feedback;
    public dinein(String name,String ChoiceOfHotelling,LocalDate dateOfHoteling, int numberOfAdults,int numberOfChildren,String ChoiceOfFood,String timeslot){
        super(name, ChoiceOfHotelling, dateOfHoteling, numberOfAdults, numberOfChildren);
        this.setChoiceOfFood(ChoiceOfFood);
        this.ShowMenu();

        
    }
    
    public dinein(String name,String ChoiceOfHotelling,LocalDate dateOfHoteling, int numberOfAdults,int numberOfChildren,
    String Feedback, int totalBill,String ChoiceOfFood,String finalMeal,int mealBill, String timeslot){
        super(name, ChoiceOfHotelling, dateOfHoteling, numberOfAdults,numberOfChildren,Feedback, totalBill);
        this.setChoiceOfFood(ChoiceOfFood);
        this.setFinalMeal(finalMeal);
        this.setMealBill(mealBill);
       
        this.setTimeslot(timeslot);
        
    }
    
    public void setChoiceOfFood(String choiceOfFood) {
        ChoiceOfFood = choiceOfFood;
    }
    public void setFinalMeal(String finalMeal) {
        this.finalMeal = finalMeal;
    }
    public void setMealBill(int mealBill) {
        this.mealBill = mealBill;
        ApplyGST(mealBill);
        super.totalBill+=mealBill;
    }
    public void setTimeslot(String timeslot) {
        this.timeslot = timeslot;
    }
    public String getChoiceOfFood() {
        return ChoiceOfFood;
    }
    public String getFinalMeal() {
        return finalMeal;
    }
    public int getMealBill() {
        return mealBill;
    }
    public String getTimeslot() {
        return timeslot;
    }
public void ShowMenu(){
        if(ChoiceOfFood == "Breakfast"){
            System.out.println("1. Choice of fresh Fruit Juice and Cut Fruits Stewed Fruits-----Rs.300\n2. Choice of Cereals (Rice flakes, wheat flakes etc)"+
            "Served with hot/cold milk--------Rs.500\n3. Eggs (Fried, boiled, poached, omelette) with Pratha--------Rs.300");
            System.out.println("Enter the relevant number from the above breakfast which you want to have");
            setfinalbreakfast();
            
        }
   else if (ChoiceOfFood == "Lunch"){
                System.out.println("1.Chinese\n2.Asian Foods\n3.Fast Food");
                System.out.print("Enter the relevant number from the types of lunch that you want to have: ");
                int lunchTypeNumber = input.nextInt();
                switch(lunchTypeNumber){
                    case 1:
                    System.out.println("Available Chinese Foods are: ");
                    System.out.println("1. Chicken Chilli Dry with Rice-----------------Rs.660\n2. Chicken Manchurian with Rice--------Rs.650\n"+
                    "3.Chicken Shashlik with Rice---------Rs.590\n4.Chicken Fried Rice-------RS.500");
                    System.out.println("Enter the relevant number from the above Chinese Lunch menu which you want to have");
                    setChineseLunch();
                    break;
                    
                    case 2:
                    System.out.println("Available Asian Foods are: ");
                    System.out.println("1. Chicken Biryani------Rs.350 \n2. Chicken Pulao----------Rs.300 \n3. Chicken Karahi------- Rs.1000"+
                    "\n4. Vegetable-------Rs.450");
                    System.out.println("**********We offer Free chapaties with lunch*********");
                    System.out.println("Enter the relevant number from the above Asian Lunch menu which you want to have");
                    setAsianLunch();
                    break;
                    
                    case 3:
                    System.out.println("Available Fast Foods are: ");
                    System.out.println("1. Chicken Burger-----Rs.400\n2. Pizza(Large)--------Rs.1500\n3. Beef Burger------Rs.500 \n4. Pasta-----Rs.450");
                    System.out.println("Enter the relevant number from the above fastfood Lunch menu which you want to have");
                   setFastfoodLunch();
                   break;
                    
                }

        }
        else if (ChoiceOfFood == "Dinner"){
            System.out.println("1.Chinese\n2.Asian Foods\n3.Fast Food");
            System.out.print("Enter the relevant number from the types of Dinner that you want to have: ");
            int DinnerTypeNumber = input.nextInt();

            switch(DinnerTypeNumber){
                case 1:
                System.out.println("Available Chinese Foods are: ");
                System.out.println("1. Chicken Black Pepper with Fried Rice-----------------Rs.530"+
                "\n2. Sweet and Sour Chicken with Fried Rice--------Rs.660\n3.Garlic Chicken with Fried Rice---------Rs.630\n4.Chicken Manchurian-------RS.550");
                System.out.println("Enter the relevant number from the above Chinese Dinner menu which you want to have");
                setchineseDinner();
                break;

                
                case 2:
                System.out.println("Available Asian Foods are: ");
                System.out.println("1. Chicken Biryani(1 serving)------Rs.350\n2. Chicken Makhni Handi (500 g)----------Rs.780\n"+
                "3. Chicken Karahi(500 g)------- Rs.950\n4. Vegetable-------Rs.450");
                System.out.println("**********We offer Free chapaties with Dinner*********");
                System.out.println("Enter the relevant number from the above Asian Lunch menu which you want to have");
                setAsianDInner();
                break;
                case 3:
                System.out.println("Available Fast Foods are: ");
                System.out.println("1. Chicken Burger-----Rs.400\n2. Pizza(Large)--------Rs.1800\n3. Beef Burger------Rs.500 \n4. Pasta-----Rs.450");
                System.out.println("Enter the relevant number from the above Asian Lunch menu which you want to have");
                setFastfoodDinner();
                break;
            }
        }

    }
public  void ApplyGST(int Bill){
    Bill+=.16*Bill;
}
public String displayinfo(){
    System.out.println("The details of your booking is as follows");
    return "Name: "+ name + "\n Choice of hotelling: "+ChoiceOfHotelling + "\n Date of Dine-in: "+ ChecIndateOfHoteling + "\n Number Of Adults: "+NumberOfAdults+
    "\n Number Of Children: "+NumberOfChildren+ "\n Choice of meal: "+ChoiceOfFood+"\n your meal: "+finalMeal+"\n your Bill after GST: "+mealBill;
}
    


    public void setfinalbreakfast(){
        
        int breakfastNumber = input.nextInt();
        switch(breakfastNumber){
            case 1:
            setFinalMeal("Choice of fresh Fruit Juice and Cut Fruits Stewed Fruits");
            setMealBill(300);
            break;
            case 2:
            finalMeal = "Cereals (Rice flakes, wheat flakes etc)Served with hot/cold milk";
            setMealBill(500);
            break;
            case 3:
            finalMeal = "Eggs (Fried, boiled, poached, omelette)";
            setMealBill(300);
            break;
            default:
            System.out.println("Please enter the relevant number");
            this.ShowMenu();
            break;       
        }
    }
   




    

    
     
 
    public void setAsianLunch(){
        
        final int AsianDinnerNumber = input.nextInt();
        switch(AsianDinnerNumber){
            case 1:
            finalMeal = "Chicken Biryani";
            this.setMealBill(350);
            break;
            case 2:
            finalMeal = "Chicken Pulao";
            this.setMealBill(300);
            break;
            case 3:
            finalMeal = "Chicken Karahi";
            this.setMealBill(1000);
            case 4:
            finalMeal = "Vegetable";
            this.setMealBill(450);
            break;
            default:
            System.out.println("Please enter the relevant number");
            this.ShowMenu();
            break;       
        }
     
    }
  
 
    public void setChineseLunch(){
        int ChineseLunchNumber = input.nextInt();
        switch(ChineseLunchNumber){
            case 1:
            finalMeal = "Chicken Chilli Dry with Rice";
            this.setMealBill(660);
            break;
            case 2:
            finalMeal = "Chicken Manchurian with Rice";
            this.setMealBill(650);
            break;
            case 3:
            finalMeal = "Chicken Shashlik with Rice";
            this.setMealBill(590);
            case 4:
            finalMeal = "Chicken Fried Rice";
            this.setMealBill(500);
            break;
            default:
            System.out.println("Please enter the relevant number");
            this.ShowMenu();
            break;       
        }
    


    }
    public void setFastfoodLunch(){
        final int FastFoodLunchNumber = input.nextInt();
        switch(FastFoodLunchNumber){
            case 1:
            finalMeal = "Chicken Burger";
            this.setMealBill(400);
            break;
            case 2:
            finalMeal = "pizza";
            this.setMealBill(1500);
            break;
            case 3:
            finalMeal = "Beef Burger";
            this.setMealBill(500);
            case 4:
            finalMeal = "Pasta";
            this.setMealBill(450);
            break;
            default:
            System.out.println("Please enter the relevant number");
            this.ShowMenu();
            break;       
        }

    }
    public void setAsianDInner(){
        
        final int AsianDinnerNumber = input.nextInt();
        switch(AsianDinnerNumber){
            case 1:
            finalMeal = "Chicken Biryani";
            this.setMealBill(350);
            break;
            case 2:
            finalMeal = "Chicken Makhni Handi";
            this.setMealBill(780);
            break;
            case 3:
            finalMeal = "Chicken Karahi";
            this.setMealBill(950);
            case 4:
            finalMeal = "Vegetable";
            this.setMealBill(450);
            break;
            default:
            System.out.println("Please enter the relevant number");
            this.ShowMenu();
            break;       
        }
            
    }

    public void setchineseDinner(){
        final int ChineseDinnerNumber = input.nextInt();
        switch(ChineseDinnerNumber){
            case 1:
            finalMeal = "Chicken Black Pepper with Fried Rice";
            this.setMealBill(530);
            break;
            case 2:
            finalMeal = "Sweet and Sour Chicken with Fried Rice";
            this.setMealBill(660);
            break;
            case 3:
            finalMeal = "Garlic Chicken with Fried Rice";
            this.setMealBill(630);
            case 4:
            finalMeal = "Chicken Manchrian";
            this.setMealBill(550);
            break;
            default:
            System.out.println("Please enter the relevant number");
            this.ShowMenu();
            break;       
        }
    


    }
    public void setFastfoodDinner(){
        final int FastFoodDinnerNumber = input.nextInt();
        switch(FastFoodDinnerNumber){
            case 1:
            finalMeal = "Chicken Burger";
            this.setMealBill(400);
            break;
            case 2:
            finalMeal = "pizza(Large)";
            this.setMealBill(1800);
            break;
            case 3:
            finalMeal = "Beef Burger";
            this.setMealBill(500);
            case 4:
            finalMeal = "Pasta";
            this.setMealBill(450);
            break;
            default:
            System.out.println("Please enter the relevant number");
            this.ShowMenu();
            break;       
        }

    }
}
class Stayin extends hoteling{

int NumberOfNights;
double StayinFare;
String ChoiceOfRoom;
int NumberOFBeds;
boolean RoomService;
LocalDate checOutDate;
String feedback;

public Stayin(String name,String ChoiceOfHotelling,LocalDate dateOfHoteling, int numberOfAdults,int numberOfChildren){
    super(name, ChoiceOfHotelling, dateOfHoteling, numberOfAdults, numberOfChildren);
    
     
}
 public Stayin(String name,String ChoiceOfHotelling,LocalDate CheckIndateOfHoteling,LocalDate checOutDate, int numberOfAdults,
 int numberOfChildren, String  ChoiceOfRoom,int NumberOFBeds, boolean RoomService,double fareofSingleRoomPerNight){

    this(name, ChoiceOfHotelling, CheckIndateOfHoteling, numberOfAdults, numberOfChildren);
    setChoiceOfRoom(ChoiceOfRoom);
    setNumberOFBeds(NumberOFBeds);
    setRoomService(RoomService);
    this.ChecIndateOfHoteling = CheckIndateOfHoteling;
    this.checOutDate = checOutDate;
    
    calculateNumberOfnights();
    this.calculatestayInBill(fareofSingleRoomPerNight, NumberOfNights, NumberOFBeds);
    

    
}

public void setChecOutDate(LocalDate checOutDate) {
    this.checOutDate = checOutDate;
}
public LocalDate getChecOutDate() {
    return checOutDate;
}
public void setNumberOfNights(int numberOfNights) {
    NumberOfNights = numberOfNights;
}
public void setStayinFare(double stayinFare) {
    StayinFare = stayinFare;
    
}
public double getStayinFare() {
    return StayinFare;
}
public int getNumberOfNights() {
    return NumberOfNights;
}
public void setChoiceOfRoom(String choiceOfRoom) {
    ChoiceOfRoom = choiceOfRoom;
}
public void setNumberOFBeds(int numberOFBeds) {
    NumberOFBeds = numberOFBeds;
}
public String getChoiceOfRoom() {
    return ChoiceOfRoom;
}
public int getNumberOFBeds() {
    return NumberOFBeds;
}
public void setRoomService(boolean roomService) {
    RoomService = roomService;
}
public boolean getRoomService() {return RoomService;
}



   public void calculatestayInBill(double fareOfRoomPerNight,int NumberOfNights,int NumberOFBeds){
    
            setStayinFare(fareOfRoomPerNight*NumberOfNights * NumberOFBeds);
            if(RoomService==true){
                setStayinFare(StayinFare+(.15*StayinFare));
            }
            
            ApplyGST(StayinFare);
            super.setTotalBill(totalBill+StayinFare);
        }

 public int calculateNumberOfnights(){
     int lastdateOfMonth= ChecIndateOfHoteling.getMonth().maxLength();
     int checkNumberOfNights = checOutDate.getDayOfMonth()-ChecIndateOfHoteling.getDayOfMonth();
     if (checkNumberOfNights<0){
        setNumberOfNights((lastdateOfMonth-ChecIndateOfHoteling.getDayOfMonth())+checOutDate.getDayOfMonth()); 
     }
     else{
         setNumberOfNights(checkNumberOfNights);;
     }
     return NumberOfNights;
    }

    public double ApplyGST(double StayinFare){
        return StayinFare + 0.16*StayinFare;
    }
    public String displayinfo(){
        System.out.println("The details of your booking is as follows");
        return "name: "+ name + "\nChoice of hotelling: "+ChoiceOfHotelling + "\nDate of Check-in: "+ ChecIndateOfHoteling +
        "\nCheck-out date: "+checOutDate+"\nNumber Of Adults: "+NumberOfAdults+"\nNumber Of Children: "+NumberOfChildren+
         "\nRoom Choice: "+ChoiceOfRoom +"\nNumber of beds: "+getNumberOFBeds()+"\nNumber of Nights Staying: "+getNumberOfNights() +
          "\nyour Bill after Applying GST: "+super.getTotalBill();
       
} 
}

