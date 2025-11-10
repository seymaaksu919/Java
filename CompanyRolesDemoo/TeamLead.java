package main1;

import main1.Manager;

class TeamLead extends Manager {

    private int teamSize;
    private String[] teamMembers;

    TeamLead(String name, String[] teamMembers) {
        super(name);
        this.teamMembers = teamMembers;
        this.teamSize = teamMembers.length;
        System.out.println("TeamLead created..");
    }

    void work() {
        super.work();
        System.out.println("TeamLead is leading a team of " + teamSize + " developers..");
    }

    public void setTeamMembers(String[] teamMembers) {
        this.teamMembers = teamMembers;
        this.teamSize = teamMembers.length;
        System.out.println("Updated team size: " + teamSize);
    }
}

	

