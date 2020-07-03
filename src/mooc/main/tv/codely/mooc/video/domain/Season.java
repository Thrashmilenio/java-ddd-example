package tv.codely.mooc.video.domain;

import java.time.Month;
import java.util.Objects;

public final class Season {
    private final Month month;

    public Season(Month month) {
        this.month = month;
    }

    public String getSeason() {
        if(month.equals(Month.JUNE)||(month.equals(Month.JULY))||month.equals(Month.AUGUST))
            return "Summer";
        if(month.equals(Month.DECEMBER)||(month.equals(Month.JANUARY))||month.equals(Month.FEBRUARY))
            return "Winter";
        if(month.equals(Month.SEPTEMBER)||(month.equals(Month.OCTOBER))||month.equals(Month.NOVEMBER))
            return "Fall";
        if(month.equals(Month.MARCH)||(month.equals(Month.APRIL))||month.equals(Month.MAY))
            return "Spring";
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Season season = (Season) o;
        return month == season.month;
    }

    @Override
    public int hashCode() {
        return Objects.hash(month);
    }
}
