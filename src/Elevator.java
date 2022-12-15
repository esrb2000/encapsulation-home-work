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
    public int moveUp() {
        currentFloor = currentFloor + 1;
        return currentFloor;
    }
    public void moveDown() {
        currentFloor = currentFloor - 1;
    }
    public void move(int floor) {
        if (currentFloor < floor) {
            for (; currentFloor < floor;) {
                moveUp();
                System.out.println(getCurrentFloor());
            }
        } else if (currentFloor > floor) {
            for (; currentFloor > floor ;) {
                moveDown();
                System.out.println(getCurrentFloor());
            }
        } else {
            System.out.println(currentFloor);
        }
    }
}

