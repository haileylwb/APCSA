import java.util.*;
import java.lang.*;
import java.io.*;


public class TipCalculator
{
  //Attributes should be bill, tip percentage, number of people.
  private double bill;
  private double tip;
  private int people;

  //Constructor should have parameters for bill, tip and number of people
  public TipCalculator(double b, double t, int p){
    bill = b;
    tip = t;
    people = p;
  }

  //getters and setters for all three attributes
  public double getBill(){
    return bill;
  }
  public double getTip(){
    return tip;
  }
  public int getPeople(){
    return people;
  }

  //Write a method using the getters to calculate the tip
  public double calcTip(){
    double uTipVal = tip / 100 * bill;
    double tipVal = Math.round(uTipVal*100.0)/100.0;
    System.out.println("Tip is: $" + tipVal);
    return tipVal;
  }

  //Write a method using the getters to calculate the total bill
  public double calcTotalBill(){
    double tb = (tip / 100 * bill) + bill;
    double totalBill = Math.round(tb*100.0)/100.0;
    System.out.println("Total Amount: $" + totalBill);
    return totalBill;
  }

  //Write a method using the getters to calculate the total tip per person 
  public double shareTip(){
    double st = tip / 100 * bill / people;
    double shareTip = Math.round(st*100.0)/100.0;
    System.out.println("Tip per Person: $" + shareTip);
    return shareTip;
  }
  //Write a method using the getters to calculate the total per person.
  public double shareTotal(){
    double stt = ((tip / 100 * bill) + bill) / people;
    double shareTotal = Math.round(stt*100.0)/100.0;
    System.out.println("Total per Person: $" + shareTotal);
    return shareTotal;
  }

}
