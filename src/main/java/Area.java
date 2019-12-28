/**
 * @author: zxy
 * @description: 坐標實體類
 * @date: 2019/12/28
 */
public class Area {
    private int x;//x坐标值
    private int y;//y坐标值
//    private String fx;//方向
//    static int Max_x;//最大x值
//    static int Max_y;//最大y值

    public Area(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
