public abstract class AbstractLever {
    protected int pos = 1;
    protected int maxlever = 0;

    public AbstractLever()
    {
        pos = 1;
    }

    public int getMaxLever()
    {
        return maxlever;
    }

    public void setMaxLever(int maxlever)
    {
        this.maxlever = maxlever;
    }

    public AbstractLever(int maxlever)
    {
        this.setMaxLever(maxlever);
    }

    public abstract int getPos();
    public abstract int leverUp();
    public abstract int leverDown();
}
