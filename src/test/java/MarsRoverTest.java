import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MarsRoverTest {
    public MarsRoverTest() {
    }

    @Test
    void should_initialize_mars_rover() {
        MarsRover marsRover = new MarsRover(0, 0, "N");
        Assertions.assertNotNull(marsRover);
    }

    @Test
    void should_return_current_position_and_direction() {
        String expected_output = "0:0:N";
        MarsRover marsRover = new MarsRover(0, 0, "N");
        Assertions.assertEquals(expected_output, marsRover.retrieveCurrentPosDir());
    }

    @Test
    void should_return_after_left_turn_status_when_left_turn() {
        String expected_output = "0:0:W";
        MarsRover marsRover = new MarsRover(0, 0, "N");
        String finalPosDir = marsRover.controlMarsRover("L");
        Assertions.assertEquals(expected_output, finalPosDir);
    }

    @Test
    void should_return_after_right_turn_status_when_right_turn() {
        String expected_output = "0:0:E";
        MarsRover marsRover = new MarsRover(0, 0, "N");
        String finalPosDir = marsRover.controlMarsRover("R");
        Assertions.assertEquals(expected_output, finalPosDir);
    }

    @Test
    void should_return_after_move_forward_status_when_move_forward_dir_N() {
        String expected_output = "0:1:N";
        MarsRover marsRover = new MarsRover(0, 0, "N");
        String finalPosDir = marsRover.controlMarsRover("M");
        Assertions.assertEquals(expected_output, finalPosDir);
    }

    @Test
    void should_return_after_move_forward_status_when_move_forward_dir_S() {
        String expected_output = "0:-1:S";
        MarsRover marsRover = new MarsRover(0, 0, "S");
        String finalPosDir = marsRover.controlMarsRover("M");
        Assertions.assertEquals(expected_output, finalPosDir);
    }

    @Test
    void should_return_after_move_forward_status_when_move_forward_dir_E() {
        String expected_output = "1:0:E";
        MarsRover marsRover = new MarsRover(0, 0, "E");
        String finalPosDir = marsRover.controlMarsRover("M");
        Assertions.assertEquals(expected_output, finalPosDir);
    }

    @Test
    void should_return_after_move_forward_status_when_move_forward_dir_W() {
        String expected_output = "-1:0:W";
        MarsRover marsRover = new MarsRover(0, 0, "W");
        String finalPosDir = marsRover.controlMarsRover("M");
        Assertions.assertEquals(expected_output, finalPosDir);
    }

    @Test
    void should_return_after_left_turn_status_when_left_turn_E() {
        String expected_output = "0:0:N";
        MarsRover marsRover = new MarsRover(0, 0, "E");
        String finalPosDir = marsRover.controlMarsRover("L");
        Assertions.assertEquals(expected_output, finalPosDir);
    }

    @Test
    void should_return_after_left_turn_status_when_left_turn_S() {
        String expected_output = "0:0:E";
        MarsRover marsRover = new MarsRover(0, 0, "S");
        String finalPosDir = marsRover.controlMarsRover("L");
        Assertions.assertEquals(expected_output, finalPosDir);
    }

    @Test
    void should_return_after_left_turn_status_when_left_turn_W() {
        String expected_output = "0:0:S";
        MarsRover marsRover = new MarsRover(0, 0, "W");
        String finalPosDir = marsRover.controlMarsRover("L");
        Assertions.assertEquals(expected_output, finalPosDir);
    }

    @Test
    void should_return_after_right_turn_status_when_right_turn_E() {
        String expected_output = "0:0:S";
        MarsRover marsRover = new MarsRover(0, 0, "E");
        String finalPosDir = marsRover.controlMarsRover("R");
        Assertions.assertEquals(expected_output, finalPosDir);
    }

    @Test
    void should_return_after_right_turn_status_when_right_turn_S() {
        String expected_output = "0:0:W";
        MarsRover marsRover = new MarsRover(0, 0, "S");
        String finalPosDir = marsRover.controlMarsRover("R");
        Assertions.assertEquals(expected_output, finalPosDir);
    }

    @Test
    void should_return_after_right_turn_status_when_right_turn_W() {
        String expected_output = "0:0:N";
        MarsRover marsRover = new MarsRover(0, 0, "W");
        String finalPosDir = marsRover.controlMarsRover("R");
        Assertions.assertEquals(expected_output, finalPosDir);
    }

    @Test
    void should_return_after_move_forward_status_when_move_forward_dir_W_pos_9_4() {
        String expected_output = "8:4:W";
        MarsRover marsRover = new MarsRover(9, 4, "W");
        String finalPosDir = marsRover.controlMarsRover("M");
        Assertions.assertEquals(expected_output, finalPosDir);
    }









}
