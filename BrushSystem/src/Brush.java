public class Brush extends AbstractBrush{
    public Brush()
    {
        super();
    }

    public Brush(int speed)
    {
        super(speed);
    }

    @Override
    public int getSpeed()
    {
        return speed;
    }
    @Override
    public void setSpeed(int speed)
    {
        this.speed = speed;
    }
}
