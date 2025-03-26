package Primitives.Numerical.Practices;

public class Ex2_Remainder {

// There is 20 test automation engineers in the company that should be
// equally assigned to each of the 8 scrum teams.
// Find out how many test automation engineers will not be assigned
// with a team.
// Also find out how many test automation engineers will be in
// each scrum team.
    public static void main(String[] args){
        //  totalTesters, totalTeams, testerInEachTeam, unassignedTesters
        int totalTesters = 20;
        int totalTeams = 8;

        int testerInEachTeam = totalTesters / totalTeams;

        // To find unassigned number of testers I need to find out what is the left over number
        // after the equal distribution of testers across teams
        int unassignedTesters = totalTesters % totalTeams;

        System.out.println("Each team will have " + testerInEachTeam +" testers.");
        System.out.println("There will be " + unassignedTesters + " unassigned testers.");







    }

}
