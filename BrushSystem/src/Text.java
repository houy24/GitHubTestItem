import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Text {

    public static void main(String[] args) {
        Agent agent = new Agent();
        AbstractLever lever = new Lever(4);
        AbstractDial dial = new Dial(5);
        AbstractBrush brush = new Brush(0);

        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        String str = input.nextLine();
        String[] string = str.split(" ");
        for (String s:string){
            list.add(Integer.valueOf(s));
        }
        int choice = 0;
        for (int i=0;i<list.size();i++){
            choice = list.get(i);
//            System.out.print(choice+" ");
            if(choice <=0||choice>4)
                break;
            switch(choice)
            {
                case 1:
                    lever.leverUp();
                    break;
                case 2:
                    lever.leverDown();
                    break;
                case 3:
                    dial.dialUp();
                    break;
                case 4:
                    dial.dialDown();
                    break;
            }
            agent.dealSpeed(lever,dial,brush);
        }
    }
}
