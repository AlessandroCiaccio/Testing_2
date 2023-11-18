import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private final Main testing = new Main();

    @Test
    void main() {
        OffsetDateTime data = OffsetDateTime.parse("2012-04-01T13:00:00Z");
        String fullData = (data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        String mediumData = (data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));

        String shortData = (data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        assert fullData.equals("domenica 1 aprile 2012") : "Test fallito: la data full non è corretta";
        assert mediumData.equals("1 apr 2012") : "Test fallito: la data medium non è corretta";
        assert shortData.equals("01/04/12") : "Test fallito: la data short non è corretta";
    }
}