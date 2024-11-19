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

}
