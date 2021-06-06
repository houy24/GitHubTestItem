public class Agent {
    public Agent() {
    }

    public void dealSpeed(AbstractLever lever,AbstractDial dial,AbstractBrush brush) {
        int speed = 0;
        switch(lever.getPos())
        {
            case 1:speed = 0;break;
            case 2:
                switch(dial.getPos())
                {
                    case 1: speed = 4;break;
                    case 2: speed = 6;break;
                    case 3: speed = 12;break;
                    case 4: speed = 18;break;
                    case 5: speed = 24;break;
                }
                break;
            case 3: speed = 30;break;
            case 4: speed = 60;break;
        }
        brush.setSpeed(speed);
        System.out.print(speed+" ");
    }

}
