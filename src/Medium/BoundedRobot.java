package Medium;

public class BoundedRobot {
    public static void main(String[] args) {
        System.out.println(isrobotBounded("GLRLGLLGLGRGLGL"));
    }
    public static boolean isrobotBounded(String instructions) {
        int direction = 0;
        int xcord = 0, ycord = 0;
        for (int n = 0; n < 4; n++) {
            for (int i = 0; i < instructions.length(); i++) {
                char step = instructions.charAt(i);
                if (step == 'L'){
                    direction += 90;
                    if(direction >= 360)
                        direction = direction-360;
                }
                else if (step == 'R'){
                    direction -= 90;
                    if(direction < 0)
                        direction = 360+direction;
                }
                else if (direction == 0)
                    ycord++;
                else if (direction == 180)
                    ycord--;
                else if (direction == 270)
                    xcord++;
                else
                    xcord--;
            }
            if (xcord == 0 && ycord == 0)
                return true;
        }
        return false;
    }
}
