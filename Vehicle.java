// Jeff Blankenship
// CS-151
// Object reference examples

public class Vehicle {
  
  private String make;
  private String model;
  private int year;  //4 digit int
  
  // Constructor.  Creates a new Vehicle
  public Vehicle(String newMake, String newModel, int newYear){
    make = newMake;
    model = newModel;
    year = newYear;
  }

  // Compares two Vehicle objects
  // Vehicles are equal only if ALL of the instance data
  // matches including make, model, and year.
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

  //accessor
  public String getMake(){
    return make;
  }
  
  //accessor
  public String getModel(){
    return model;
  }
  
  //accessor
  public int getYear(){
    return year;
  }





}
