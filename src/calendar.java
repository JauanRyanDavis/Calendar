import javax.swing.*;
public class calendar {
    public static void main(String[] args) {
        KeyboardInputClass keyboardInput= new KeyboardInputClass();
        String yeartxt = keyboardInput.getKeyboardInput("Enter the year of the calander:");
        int year = Integer.parseInt(yeartxt);

        String firstofthemonthtxt = keyboardInput.getKeyboardInput("What day does the first of the month begin? Enter 1(Sun),"
                + " 2(Mon), 3(Tue), 4(Wed), 5(Thur), 6(Fri), 7(Sat):");
        int firstofthemonth = Integer.parseInt(firstofthemonthtxt);
        
        int monthdays=0;
        
        for (int months = 1; months <= 12; months++) {
            int daysofweek=1;
            switch (months) {
                case 1:
                    System.out.println("\t\t Janurary " + year + "\n----------------------------------------------------------");
                    monthdays=31;
                    break;
                case 2:
                    System.out.println("\t\t February " + year + "\n----------------------------------------------------------");
                    boolean test= (year%4==0 && year%100!=0) || (year%400==0);
                    if (test) monthdays=29;
                    else monthdays=28;
                    break;
                case 3:
                    System.out.println("\t\t March " + year + "\n----------------------------------------------------------");
                    monthdays=31;
                    break;
                case 4:
                    System.out.println("\t\t April " + year + "\n----------------------------------------------------------");
                    monthdays=30;
                    break;
                case 5:
                    System.out.println("\t\t May " + year + "\n----------------------------------------------------------");
                    monthdays=31;
                    break;
                case 6:
                    System.out.println("\t\t June " + year + "\n----------------------------------------------------------");
                    monthdays=30;
                    break;
                case 7:
                    System.out.println("\t\t July " + year + "\n----------------------------------------------------------");
                    monthdays=31;
                    break;
                case 8:
                    System.out.println("\t\t August " + year + "\n----------------------------------------------------------");
                    monthdays=31;
                    break;
                case 9:
                    System.out.println("\t\t September " + year + "\n----------------------------------------------------------");
                    monthdays=30;
                    break;
                case 10:
                    System.out.println("\t\t October " + year + "\n----------------------------------------------------------");
                    monthdays=31;
                    break;
                case 11:
                    System.out.println("\t\t November " + year + "\n----------------------------------------------------------");
                    monthdays=30;
                    break;
                case 12:
                    System.out.println("\t\t December " + year + "\n----------------------------------------------------------");
                    monthdays=31;
            }//End switch
            
            for (daysofweek = 1; daysofweek <= 7; daysofweek++) {
                switch (daysofweek) {
                    case 1:
                        System.out.print("Sun \t");
                        break;
                    case 2:
                        System.out.print("Mon \t");
                        break;
                    case 3:
                        System.out.print("Tue \t");
                        break;
                    case 4:
                        System.out.print("Wed \t");
                        break;
                    case 5:
                        System.out.print("Thur \t");
                        break;
                    case 6:
                        System.out.print("Fri \t");
                        break;
                    case 7:
                        System.out.println("Sat");
                }//End switch
                
               
            }//End daysofweek
            int currentday=1;
            
          for (int numberofweeks=1; numberofweeks<=6; numberofweeks++){
            for (int daysinaweek=1;daysinaweek<=7;daysinaweek++){
                if (daysinaweek>=firstofthemonth && numberofweeks==1){   
                    if (currentday<=monthdays){
                        System.out.print(currentday+ "\t");
                        currentday++;
                    }//End nested if
                }//End if
                else if ( numberofweeks>1){   
                    if (currentday<=monthdays){
                        System.out.print(currentday+ "\t");
                        currentday++;
                        firstofthemonth=daysinaweek+1;
                        
                    }//End nested if
                }//End else if    
                else {
                    System.out.print("\t");
                }//End else
                
            }//End daysinaweek
              System.out.println("");
          }//End numberorweeks  
            
          System.out.println(""); 
   }//End months loop
        
  }//End main
 }//End class
