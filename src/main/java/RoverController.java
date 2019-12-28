/**
 * @author: zxy
 * @description:
 * @date: 2019/12/28
 */
public class RoverController {
    private Rover rover;

    public RoverController(Rover rover) {
        this.rover = rover;
    }

    public String excute(String mission) {
        String[] missions = mission.split(",");
        Area area = new Area(Integer.parseInt(missions[0]),Integer.parseInt(missions[1]));
        rover.land(area,Integer.parseInt(missions[2]),Integer.parseInt(missions[3]),missions[4]);
        for(int i=5;i<missions.length;i++){
            if("M".equals(missions[i])){
                rover.move();
            }else if("L".equals(missions[i])){
                rover.turnLeft();
            }else if("R".equals(missions[i])){
                rover.turnRight();
            }
        }

        return rover.getPosition();
    }
}
