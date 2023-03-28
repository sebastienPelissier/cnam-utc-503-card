package CardPack;

import java.util.Arrays;
import java.util.Optional;

public enum Value {
  TWO(2,"two", 52),
  THREE(3, "tree", 52),
  FOUR(4, "four", 52),
  FIVE(5, "five", 52),
  SIX(6, "six", 52),
  SEVEN(7, "seven", 32),
  EIGHT(8,"eight", 32 ),
  NINE(9, "nine", 32),
  TEN(10, "ten", 32),
  JACK(11, "jack", 32),
  QUEEN(12, "queen", 32),
  KING(13, "king", 32),
  ACE(14, "ace", 32);


  private final int power;
  private final String label;
  private final int type;

  private Value(int power,String label, int type){
    this.power = power;
    this.label = label;
    this.type = type;
  }

  public int getPower(){
    return this.power;
  }

  public String getLabel(){
    return this.label;
  }

  public int getType(){
    return this.type;
  }
}