import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
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
    public void should_move_forwd_when_direction_to_east(){
        Area area = new Area(10,10);
        Rover rover = new Rover();
        rover.land(area,5,5,"E");
        rover.move();
        String position = rover.getPosition();
        assertThat(position).isEqualTo("65E");
    }

    @Test
    public void should_execute_batch_commands(){
        Rover rover = new Rover();
        RoverController roverController = new RoverController(rover);
        String mission = "10,10,5,5,E,M,L,M,R";
        String position = roverController.excute(mission);
        assertThat(position).isEqualTo("66E");
    }

    @Test
    public void should_turn_left(){
        Area area = new Area(10,10);
        Rover rover = new Rover();
        rover.land(area,5,5,Rover.SOUTH);
        rover.turnLeft();
        assertThat(rover.getPosition()).isEqualTo("55E");

        rover.turnLeft();
        assertThat(rover.getPosition()).isEqualTo("55N");

        rover.turnLeft();
        assertThat(rover.getPosition()).isEqualTo("55W");

        rover.turnLeft();
        assertThat(rover.getPosition()).isEqualTo("55S");
    }

    @Test
    public void should_turn_right(){
        Area area = new Area(10,10);
        Rover rover = new Rover();
        rover.land(area,5,5,Rover.SOUTH);
        rover.turnRight();
        assertThat(rover.getPosition()).isEqualTo("55W");

        rover.turnRight();
        assertThat(rover.getPosition()).isEqualTo("55N");

        rover.turnRight();
        assertThat(rover.getPosition()).isEqualTo("55E");

        rover.turnRight();
        assertThat(rover.getPosition()).isEqualTo("55S");
    }
    @Rule
    public ExpectedException exceptedException = ExpectedException.none();
    @Test
    public void should_warning_when_land_out_of_area(){
        exceptedException.expect(IllegalArgumentException.class);
        exceptedException.expectMessage("x=20 is out of area width 10");
        Area area = new Area(10,10);
        Rover rover = new Rover();
        rover.land(area,20,30,Rover.NORTH);
    }
}