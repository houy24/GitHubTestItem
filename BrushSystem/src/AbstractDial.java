public abstract class AbstractDial {
    protected int pos = 1;
    protected int maxDial = 1;

    public AbstractDial()
    {
        pos = 1;
    }

    public AbstractDial(int maxDial)
    {
        setMaxDial(maxDial);
    }

    public int getMaxDial()
    {
        return maxDial;
    }

    public void setMaxDial(int maxDial)
    {
        this.maxDial = maxDial;
    }

    public abstract int getPos();
    public abstract int dialUp();
    public abstract int dialDown();

}
