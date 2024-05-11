package model;

public class Board extends Updater
{
    private final int NUMBER = 36;
    private Square squares[] = new Square[NUMBER];
    private int counter = 0;
    /**
     * Constructor for objects of class Board
     */
    public Board()
    {
        setBoard();
    }

    private void setBoard()
    {
        for(Layout layout: Layout.values())//for all 36 squares
        {
            squares[counter] = createSquare(++counter, layout);
        }
    }

    private Square createSquare(int number, Layout layout)
    {
        if(layout.getType() == 0)
            return new Square(number, getColour(number));
        else if(layout.getType() == 1)
            return new LadderSquare(number, getColour(number), layout.getSpaces());
        else//type is 2
            return new SnakeSquare(number, getColour(number), layout.getSpaces());
    }

    private String getColour(int counter)
    {
        if(counter % 2 == 0)// if counter is even
            return "Aqua";
        return "Yellow";
    }

    public void move(Player player)
    {
        int score = player.getScore();
        if (score < NUMBER)
        {
            Square square = squares[score -1];//find the square the player is on
            square.move(player);//move player (if snake or ladder)
        }
    }
}
