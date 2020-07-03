package tv.codely.mooc.video.application.publish;

import tv.codely.mooc.video.domain.Season;

final public class CurrentSeason {
    private MonthCurrent month;

    public CurrentSeason(MonthCurrent month) {
        this.month = month;
    }

    public String decideSeason() {
        final var month = this.month.getCurrentSeason();
        Season seasonYear = new Season(month);
        return seasonYear.getSeason();
    }

}
