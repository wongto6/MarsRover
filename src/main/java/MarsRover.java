//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Arrays;

public class MarsRover {
    int xPos;
    int yPos;
    Direction dir;

    public MarsRover(int xPos, int yPos, Direction dir) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.dir = dir;
    }

    public String retrieveCurrentPosDir() {
        StringBuilder currentPosDir = new StringBuilder();
        return currentPosDir.append(this.xPos).append(":").append(this.yPos).append(":").append(this.dir).toString();
    }

    public void setDir(Direction dir) {
        this.dir = dir;
    }

    public void updatePos() {
        switch (this.dir) {
            case N -> ++this.yPos;
            case S -> --this.yPos;
            case E -> ++this.xPos;
            case W -> --this.xPos;
        }
    }

    public void updateDir(String command) {
        switch (command) {
            case "L" -> this.setDir(dir.turnLeft());
            case "R" -> this.setDir(dir.turnRight());
        }
    }

    public void updatePosDir(String command) {
        if (command.equals("M")) {
            this.updatePos();
        } else {
            this.updateDir(command);
        }
    }

    public String controlMarsRover(String command) {
        this.updatePosDir(command);
        return this.retrieveCurrentPosDir();
    }

}
