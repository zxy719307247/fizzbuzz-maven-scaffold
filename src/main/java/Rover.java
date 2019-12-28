import static java.lang.String.format;

/**
 * @author: zxy
 * @description:
 * @date: 2019/12/28
 */
public class Rover {
    public static final String EASTH = "E";
    public static final String SOUTH = "S";
    public static final String WESTH = "W";
    public static final String NORTH = "N";

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
        if (EASTH.equals(this.direction)) {
            x += 1;
        } else {
            if (SOUTH.equals(this.direction)) {
                this.y -= 1;
            } else if (WESTH.equals(this.direction)) {
                this.x -= 1;
            } else if (NORTH.equals(this.direction)) {
                this.y += 1;
            }
        }
    }
}
