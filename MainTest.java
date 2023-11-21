import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private final Main testing=new Main();

    @Test
    void dataFull() {
        String dataFull=testing.dataFull(OffsetDateTime.parse("2002-03-01T13:00:00Z"));
        assertEquals("venerdì 1 marzo 2002",dataFull);
    }

    @Test
    void dataMedium() {
        String dataMedium=testing.dataMedium(OffsetDateTime.parse("2002-03-01T13:00:00Z"));
        assertEquals("1 mar 2002",dataMedium);
    }

    @Test
    void dataShort() {
        String dataShort=testing.dataShort(OffsetDateTime.parse("2002-03-01T13:00:00Z"));
        assertEquals("01/03/02",dataShort);
    }
    @Test
    void nullCaseFull(){
        String nullFull=null;
        assertNull(nullFull,"The data is null");
    }
    @Test
    void nullCaseMedium(){
        String nullMedium=null;
        assertNull(nullMedium,"The data is null");
    }
    @Test
    void nullCaseShort(){
        String nullShort=null;
        assertNull(nullShort,"The data is null");
    }
}