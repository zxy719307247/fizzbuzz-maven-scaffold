import static java.lang.String.format;

/**
 * @author: zxy
 * @description:
 * @date: 2019/12/28
 */
public class Rover {
    private Area area;
    private int x;
    private int y;
    private String direction;

    public void land(Area area, int x, int y, String direction) {
        this.area = area;
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public String getPosition() {
        return format("%d%d%s", x, y, direction);
    }

    public void move() {
        if ("E".equals(direction)) {
            x += 1;
        }


    }
}
