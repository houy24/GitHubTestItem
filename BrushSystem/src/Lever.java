public class Lever extends AbstractLever{
    public Lever()
    {
        super();
    }

    public Lever(int maxlever)
    {
        super(maxlever);
    }

    @Override
    public int getPos()
    {
        return pos;
    }

    @Override
    public int leverUp()
    {
        if(pos < maxlever)
            pos++;
        return pos;
    }

    @Override
    public int leverDown()
    {
        if(pos > 1)
            pos --;
        return pos;
    }
}
