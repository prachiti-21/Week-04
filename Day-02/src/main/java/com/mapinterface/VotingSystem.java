package com.mapinterface;

import java.util.*;

public class VotingSystem {
    // HashMap to store candidate -> votes
    private HashMap<String, Integer> votes;
    // LinkedHashMap to store votes in the order they were cast
    private LinkedHashMap<String, Integer> orderedVotes;

    public VotingSystem() {
        votes = new HashMap<>();
        orderedVotes = new LinkedHashMap<>();
    }

    // Method to cast a vote
    public void castVote(String candidate) {
        // If the candidate has already voted before, increment their vote count
        if (votes.containsKey(candidate)) {
            votes.put(candidate, votes.get(candidate) + 1);
        } else {
            // Otherwise, start counting the votes for the new candidate
            votes.put(candidate, 1);
        }
        // Update LinkedHashMap to maintain the order of votes
        orderedVotes.put(candidate, votes.get(candidate));
    }

    // Method to get the result sorted by votes
    public void getSortedResults() {
        // Sorting candidates based on the number of votes using TreeMap
        TreeMap<Integer, List<String>> sortedResults = new TreeMap<>(Collections.reverseOrder());

        for (Map.Entry<String, Integer> entry : votes.entrySet()) {
            sortedResults.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
        }

        // Displaying sorted results
        System.out.println("Election Results (Sorted by Votes):");
        for (Map.Entry<Integer, List<String>> entry : sortedResults.entrySet()) {
            System.out.println("Votes: " + entry.getKey());
            for (String candidate : entry.getValue()) {
                System.out.println("Candidate: " + candidate);
            }
        }
    }

    // Method to display votes in the order they were cast
    public void getOrderedResults() {
        System.out.println("Votes Cast (In Insertion Order):");
        for (Map.Entry<String, Integer> entry : orderedVotes.entrySet()) {
            System.out.println("Candidate: " + entry.getKey() + ", Votes: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        // Simulate voting process
        votingSystem.castVote("Alice");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");
        votingSystem.castVote("Charlie");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");

        // Display results
        votingSystem.getSortedResults();
        votingSystem.getOrderedResults();
    }
}

