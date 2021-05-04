package view;

import domain.RaceReport;

import java.util.List;

public class OutputView {

    public static void print(List<RaceReport> raceReports) {
        for (RaceReport raceReport : raceReports) {
            System.out.println(raceReport.render());
        }
        System.out.println();
    }
}
