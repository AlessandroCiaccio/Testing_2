import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private final Main testing=new Main();
    @Test
    void main() {
        OffsetDateTime data=OffsetDateTime.parse("2012-04-01T13:00:00Z");
        System.out.println(data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        System.out.println(data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));

        System.out.println(data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        assertEquals("domenica 1 aprile 2012\n1 apr 2012\n01/04/12",
                "domenica 1 aprile 2012\n1 apr 2012\n01/04/12");
    }
}