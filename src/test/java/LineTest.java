import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LineTest {
    @Test
    @DisplayName("init line with two points")
    public void initiateLineWithTwoPoints() {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(3, 4);
        Line line = new Line(point1, point2);

        assertEquals(point1, line.getPoint1());
        assertEquals(point2, line.getPoint2());
    }
}