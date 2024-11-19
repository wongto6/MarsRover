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

}
