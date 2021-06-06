public class Dial extends AbstractDial{
    public Dial()
    {
        super();
    }

    public Dial(int lever)
    {
        super(lever);
    }

    @Override
    public int getPos()
    {
        return pos;
    }

    public int dialUp()
    {
        if(pos < maxDial)
            pos++;
        return pos;
    }

    public int dialDown()
    {
        if(pos > 1)
            pos --;
        return pos;
    }
}
