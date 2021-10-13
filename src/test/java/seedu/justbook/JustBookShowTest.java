package seedu.justbook;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class JustBookShowTest {
    @Test
    public void sampleTest() {
        assertTrue(true);
    }

    LocalDateTime endDate = LocalDateTime.parse("2021-06-07T10:00:00");
    LocalDateTime startDate = LocalDateTime.parse("2021-06-07T09:00:00");
    LocalDate expected = LocalDate.of(2021, 6, 7);
    private final Bookings testModel = new Bookings("Meeting@Hall One", startDate, endDate);

    @Test
    @DisplayName("get LocalDate from end date LocalDateTime")
    public void getEndDateTest() {
        assertEquals(expected, testModel.getEndDate());
    }
}
