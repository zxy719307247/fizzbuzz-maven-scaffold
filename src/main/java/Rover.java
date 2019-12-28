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
    private String e;

    public void land(Area area, int x, int y, String e) {
        this.area = area;
        this.x = x;
        this.y = y;
        this.e = e;
    }

    public String getPosition() {
        return format("%d%d%s", x, y, e);
    }

    public void move() {
        x += 1;
    }
}
