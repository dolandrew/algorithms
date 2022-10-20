package algorithms.maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class LargestUniqueNumber {

    public static List<List<Integer>> findWinners(int[][] matches) {
        Set<Integer> winners = new HashSet<>();
        Map<Integer, Integer> losers = new HashMap<>();

        for (int i = 0; i < matches.length; i++) {
            Integer winner = matches[i][0];
            Integer loser = matches[i][1];

            winners.add(winner);
            losers.put(loser, losers.getOrDefault(loser, 0) + 1);
        }
        List<Integer> winnersList = new ArrayList<>();
        for (Integer winner : winners){
            if (!losers.containsKey(winner)) {
                winnersList.add(winner);
            }
        }
        List<Integer> losersList = new ArrayList<>();
        for (Integer loser : losers.keySet()){
            if (losers.get(loser) == 1) {
                losersList.add(loser);
            }
        }

        Collections.sort(winnersList);
        Collections.sort(losersList);
        return List.of(winnersList, losersList);

    }
    public static void main(String[] args) {
        int[][] matches = {{2,3},{1,3},{5,4},{6,4}};
        System.out.println(findWinners(matches));
        // [[1,2,5,6], []]
    }

}