// Jeff Blankenship
// CS-151
// Object reference examples

public class Vehicle {
  
  private String make;
  private String model;
  private int year;
  
  // Constructor.  Creates a new Vehicle
  public Vehicle(String newMake, String newModel, int newYear){
    make = newMake;
    model = newModel;
    year = newYear;
  }

  // Compares two Vehicle objects
  public boolean equals(Vehicle that){  //  that = yourCar
    boolean result = false;
    
    if   (this.make.equals(that.getMake()) 
       && this.getModel().equals(that.getModel()) 
       && this.getYear() == that.getYear() )      {
      result = true;
    } else {
      result = false;
    }
    
    return result;
  }

  public String getMake(){
    return make;
  }
  
  public String getModel(){
    return model;
  }
  
  public int getYear(){
    return year;
  }





}