package model;

public enum Layout
{
    One(0,0), Two(0,0), Three(1,13), Four(0,0), Five(1,2), Six(0,0),
    Seven(0,0), Eight(0,0), Nine(0,0), Ten(0,0), Eleven(0,0), Twelve(2,10),
    Thirteen(0,0), Forteen(2,3), Fifteen(1,10), Sixteen(0,0), Seventeen(2,13), Eighteen(1, 2),
    Nineteen(0,0), Twenty(0,0), TwentyOne(1,11), TwentyTwo(0,0), TwentyThree(0,0), TwentyFour(0,0),
    TwentyFive(0,0), TwentySix(0,0), TwentySeven(0,0), TwentyEight(0,0), TwentyNine(0,0), Thirty(0,0),
    ThirtyOne(2, 12), ThirtyTwo(0,0), ThirtyThree(0,0), ThirtyFour(0,0), ThirtyFive(2, 13), ThirtySix(0,0);
    private int type; //0 for Square, 1 for Ladder 2 for Snake
    private int spaces;
    private Layout(int type, int spaces)
    {
        this.type = type;
        this.spaces = spaces;
    }
    public int getType()
    {
        return type;
    }
    public int getSpaces()
    {
        return spaces;
    }
}

