package com.githab.eefimova.part3;

import java.util.ArrayList;
import java.util.List;

public class HyperintelligentCreature extends Human {

    private int meaningsOfLife;
    private List<Issue> issues = new ArrayList<>();
    private Game playingNow;

    public HyperintelligentCreature(int meaningsOfLife) {
        System.out.println("раса гиперразумных всемерных существ");
        this.meaningsOfLife = meaningsOfLife;
    }

    public void disputeAboutMeaningOfLife() {
        meaningsOfLife++;
    }

    public void sitDownAndSolveIssue(Issue issue) {
        System.out.println("сесть и решить " + issue.getDescription());
        issue.setSolved(true);
        issues.add(issue);
    }

    public void playTheGame(Game game) {
        System.out.println("поиграть в " + game);
        playingNow = game;
    }

    public int getMeaningsOfLife() {
        return meaningsOfLife;
    }

    public List<Issue> getIssues() {
        return issues;
    }

    public Game getPlayingNow() {
        return playingNow;
    }

    public boolean tiredOfArguing() {
        if (meaningsOfLife > 100) {
            System.out.println("устала от постоянных споров о смысле жизни");
            return true;
        } else
            return false;
    }

    public boolean haveAllIssuesBeenResolved() {
        return issues.stream().allMatch(Issue::isSolved);
    }
}
