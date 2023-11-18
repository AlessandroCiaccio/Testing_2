import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private final Main testing=new Main();

    @Test
    void dataFull() {
        String dataFull=testing.dataFull(OffsetDateTime.parse("2002-03-01T13:00:00Z"));
        assert dataFull.equals("venerdì 1 marzo 2002"): "La data è sbagliata";
    }

    @Test
    void dataMedium() {
        String dataMedium=testing.dataMedium(OffsetDateTime.parse("2002-03-01T13:00:00Z"));
        assert dataMedium.equals("1 mar 2002"): "La data è sbagliata";
    }

    @Test
    void dataShort() {
        String dataShort=testing.dataShort(OffsetDateTime.parse("2002-03-01T13:00:00Z"));
        assert dataShort.equals("01/03/2002"): "La data è sbagliata";
    }
}