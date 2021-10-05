import java.util.Scanner;

class Main { //the runner for the calcualtor class!

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      //Ask for the bill amount using Scanner 
      System.out.print("What's the amount: ");
      double bill = Double.parseDouble(sc.nextLine());

      //Ask for the tip amout (an integer 0 to 100)
      System.out.print("What's the tip amount: ");
      double tip = Double.parseDouble(sc.nextLine());
      if(tip < 0 && tip > 100){
        System.out.println("That's not a valid number! Please type a number between 0 and 100.");
        tip = Double.parseDouble(sc.nextLine());
      }

      //Ask for number of people (an integer > 0)
      System.out.println("How many people: ");
      int people = (int)Double.parseDouble(sc.nextLine());
      if(people < 0){
        System.out.println("That's not a valid number! Please type a whole number greater than 0.");
        people = (int)Double.parseDouble(sc.nextLine());
      }

      //Construct a new TipCalculator
      TipCalculator myBill = new TipCalculator(bill, tip, people);
      myBill.calcTip();
      myBill.calcTotalBill();
      myBill.shareTip();
      myBill.shareTotal();
      //I used DecimalFormat to format the output.
      //Below is an example of how it works
      //import java.text.DecimalFormat;
      //DecimalFormat df = new DecimalFormat("#.##");
      //double example = 12.3456;
      //Example: System.out.println(df.format(example));
      //will print: 12.35
      //Print the results so it looks like the screenshot in the explanation.
      //Use the methods in TipCalculator
        
    }
    
}
