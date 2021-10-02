package hw1;

public class Course {
    private int complexity;

    public Course(int complexity) {
        this.complexity = complexity;
    }

    public void doIt(Team team) {
        TeamMember[] members = team.getTeamMembers();
        for(int i = 0; i < Team.MAX_TEAM_SIZE; i++) {
            TeamMember member = members[i];
            member.setHasPassed(member.getMaxCourseComplexity() >= this.complexity);
        }
    }
}
