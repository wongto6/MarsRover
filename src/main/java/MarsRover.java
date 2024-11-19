//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Arrays;

public class MarsRover {
    final String[] DIRECTIONS = new String[]{"N", "E", "S", "W"};
    int xPos = 0;
    int yPos = 0;
    String dir = "N";

    public MarsRover(int xPos, int yPos, String dir) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.dir = dir;
    }

    public String retrieveCurrentPosDir() {
        StringBuilder currentPosDir = new StringBuilder();
        return currentPosDir.append(this.xPos).append(":").append(this.yPos).append(":").append(this.dir).toString();
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public void updatePos(String command) {


    }

    public void updateDir(String command) {


    }

    public void updatePosDir(String command) {
        if (command.equals("M")) {
            this.updatePos(command);
        } else {
            this.updateDir(command);
        }

    }

    public String controlMarsRover(String command) {
        this.updatePosDir(command);
        return this.retrieveCurrentPosDir();
    }

}
