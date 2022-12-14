public class Elevator {
    private int currentFloor = 1;
    private int minFloor;
    private int maxFloor;

    public Elevator (int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }
    public int getCurrentFloor() {
        return currentFloor;
    }
    public void moveUp() {
        currentFloor = currentFloor + 1;
    }
    public void moveDown() {
        currentFloor = currentFloor - 1;
    }
    public void move(int floor) {
        if (floor > currentFloor) {
         for (currentFloor; currentFloor < floor; moveUp()) {
             System.out.println(getCurrentFloor());
         }
        }
    }

}
