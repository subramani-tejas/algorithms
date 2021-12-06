package com.codewithtejas.easy;

import com.sun.source.tree.LiteralTree;

import java.util.*;

public class TournamentWinner {

    // competitions -> [[HTML, C#], [C#, Python], [Python, HTML]]
    //                      0             0             1
    public String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        Map<String, Integer> scoreboard = new HashMap<>();
        for (var competition : competitions)
            for (var team : competition)
                scoreboard.putIfAbsent(team, 0);

        for (int i = 0; i < competitions.size(); i++)
            allocatePoints(competitions.get(i), results.get(i), scoreboard);

        System.out.println(scoreboard);
        var max = Collections.max(scoreboard.values());

        String winningTeam = "";
        for(var item : scoreboard.entrySet())
            if (item.getValue().equals(max))
                winningTeam = item.getKey();
        return winningTeam;
    }

    void allocatePoints(List<String> teams, int result, Map<String, Integer> scoreboard) {
        if (result == 0) {
            var winningTeam = teams.get(1);
            scoreboard.put(winningTeam, scoreboard.get(winningTeam) + 3);
        }

        if (result == 1) {
            var winningTeam = teams.get(0);
            scoreboard.put(winningTeam, scoreboard.get(winningTeam) + 3);
        }
    }


    public static void main(String[] args) {
        ArrayList<ArrayList<String>> competitions = new ArrayList<ArrayList<String>>();
        ArrayList<String> competition1 = new ArrayList<String>(Arrays.asList("HTML", "C#"));
        ArrayList<String> competition2 = new ArrayList<String>(Arrays.asList("C#", "Python"));
        ArrayList<String> competition3 = new ArrayList<String>(Arrays.asList("Python", "HTML"));
        competitions.add(competition1);
        competitions.add(competition2);
        competitions.add(competition3);
        ArrayList<Integer> results = new ArrayList<Integer>(Arrays.asList(0, 0, 1));

        TournamentWinner tw = new TournamentWinner();
        System.out.println(tw.tournamentWinner(competitions, results));
    }
}
