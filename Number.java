//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Shahmir A

//header for Number class
public class Number 
{
//private instance variable (must be an Integer)
  private int val; //new private int val
//constructor
  public Number(int tmpValue) //create object with a int parameter
  { 
    val=tmpValue; //set private val to tmpValue
  }

//getter method
  public int getValue() //return the value 
  { 
    return val;
  }

//setter method
  public void setValue(int input){ //set val to whatever int has been pased
    val = input; //set val to input
  }
//isOdd method
  public boolean isOdd(){
    if(val % 2 != 0) //if val / 2 remainder is not equal
    { 
      return true; //return true bool
    } 
    else //if not 
    { 
      return false; //return false bool
    }
  }

//isPerfect method
  public boolean isPerfect(){ //new method isPerfect

    int result=0; //new int result

    for(int y=1;y<val;y++) //loops until y isnt less than val
    { 
      if(val % y == 0){ //if val / y == 0 do this
        result+= y; //if yes add to result 
      }
    }

    if(result==val) //if result == val its perfect!
    { 
      return true; // return true bool
    } 
    else //do this if its false
    {
      return false; //return false bool
    }
  }

//toString
  public String toString()
  {
    return ""+val; //return val as a string
  }
}