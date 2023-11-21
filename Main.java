import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        System.out.println(dataFull(data));

        System.out.println(dataMedium(data));

        System.out.println(dataShort(data));

    }

    public static String dataFull(OffsetDateTime data) {
        if(data==null){
            return null;
        }
        return data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
    }

    public static String dataMedium(OffsetDateTime data) {
        if(data==null){
            return null;
        }
        return data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
    }

    public static String dataShort(OffsetDateTime data) {
        if(data==null){
            return null;
        }
        return data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
    }
}
