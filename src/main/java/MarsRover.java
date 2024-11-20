//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Arrays;

public class MarsRover {
    int xPos;
    int yPos;
    Direction dir;
    final Command[] moveCommands = new Command[]{Command.M, Command.B};

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

    public void updatePos(Command command) {
        switch (command) {
            case M -> {
                switch (this.dir) {
                    case N -> ++this.yPos;
                    case S -> --this.yPos;
                    case E -> ++this.xPos;
                    case W -> --this.xPos;
                }
            }
            case B -> {
                switch (this.dir) {
                    case N -> --this.yPos;
                    case S -> ++this.yPos;
                    case E -> --this.xPos;
                    case W -> ++this.xPos;
                }
            }
        }
    }

    public void updateDir(Command command) {
        switch (command) {
            case L -> this.setDir(dir.turnLeft());
            case R -> this.setDir(dir.turnRight());
        }
    }

    public void updatePosDir(Command command) {
        if (Arrays.asList(moveCommands).contains(command)) {
            this.updatePos(command);
        } else {
            this.updateDir(command);
        }
    }

    public String controlMarsRover(String commandBatch) {

        Arrays.stream(commandBatch.split(""))
                .sequential()
                .forEach(command -> updatePosDir(Command.valueOf(command)));
        return this.retrieveCurrentPosDir();
    }

}
