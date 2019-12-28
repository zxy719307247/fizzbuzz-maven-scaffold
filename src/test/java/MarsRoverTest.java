import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.fest.assertions.api.Assertions.assertThat;


/**
 * @Description:火星漫遊車測試
 * @Author: zxy
 * @Date: 2019/12/28 14:00
 * @param:
 * @return:
 **/

public class MarsRoverTest {
    @Test
    public void should_land_the_rover_on_area() {
        Area area = new Area(10, 10);
        Rover rover = new Rover();
        rover.land(area, 5, 5, "E");
        String position = rover.getPosition();
        assertThat(position).isEqualTo("55E");
    }

    @Test
    public void should_move_forwd(){
        Area area = new Area(10,10);
        Rover rover = new Rover();
        rover.land(area,5,5,"E");
        rover.move();
        String position = rover.getPosition();
        assertThat(position).isEqualTo("65E");
    }
}