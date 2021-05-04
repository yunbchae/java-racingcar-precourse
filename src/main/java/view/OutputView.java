package view;

import domain.RaceReport;
import domain.RaceResult;

import java.util.List;

public class OutputView {

    public static void print(List<RaceReport> raceReports) {
        for (RaceReport raceReport : raceReports) {
            System.out.println(raceReport.render());
        }
        System.out.println();
    }

    public static void print(RaceResult raceResult) {
        System.out.println(raceResult.render());
    }
}
