package dice;

public class Dice {
int Min=1;
int Max=7;

public int diceRoll(){
    double d=(Math.random()*(Max))+Min;
    return (int)d;
}
}
