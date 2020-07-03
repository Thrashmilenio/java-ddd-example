package tv.codely.mooc.video.application.publish;

import org.junit.jupiter.api.Test;

import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertEquals;

final public class SeasonCurrentValidate {
    @Test
    public void validate_season_winter() {
        MonthCurrent monthCurrent = () -> Month.FEBRUARY;
        final var currentSeason = new CurrentSeason(monthCurrent);
        assertEquals("Winter", currentSeason.decideSeason());
    }

    @Test
    public void validate_season_spring() {
        MonthCurrent monthCurrent = () -> Month.APRIL;
        final var currentSeason = new CurrentSeason(monthCurrent);
        assertEquals("Spring", currentSeason.decideSeason());
    }

    @Test
    public void validate_season_fall() {
        MonthCurrent monthCurrent = () -> Month.NOVEMBER;
        final var currentSeason = new CurrentSeason(monthCurrent);
        assertEquals("Fall", currentSeason.decideSeason());
    }

    @Test
    public void validate_season_summer() {
        MonthCurrent monthCurrent = () -> Month.JULY;
        final var currentSeason = new CurrentSeason(monthCurrent);
        assertEquals("Summer", currentSeason.decideSeason());
    }
}
