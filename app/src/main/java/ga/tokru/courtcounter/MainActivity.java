package ga.tokru.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Team teamA = new Team();
    Team teamB = new Team();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Football Match Logger");
    }

    /**
     * Adds and displays Goals.
     */
    public void addGoal(View view) {
        int intParentId = ((View) view.getParent()).getId();
        String parentId = (getResources().getResourceEntryName(intParentId));
        if (parentId.equals("buttonsTeamA")){
            TextView goalsView = (TextView) findViewById(R.id.goalsTeamA);
            int goals = teamA.addGoal();
            goalsView.setText(String.valueOf(goals));
            addOnTarget(view);
        }
        else{
            TextView goalsView = (TextView) findViewById(R.id.goalsTeamB);
            int goals = teamB.addGoal();
            goalsView.setText(String.valueOf(goals));
            addOnTarget(view);
        }

    }

    /**
     * Adds and displays Attempts.
     */
    public void addAttempt(View view) {
        int intParentId = ((View) view.getParent()).getId();
        String parentId = (getResources().getResourceEntryName(intParentId));
        if (parentId.equals("buttonsTeamA")){
            TextView attemptsView = (TextView) findViewById(R.id.attemptsTeamA);
            int attempts = teamA.addAttempt();
            attemptsView.setText(String.valueOf(attempts));
        }
        else{
            TextView attemptsView = (TextView) findViewById(R.id.attemptsTeamB);
            int attempts = teamB.addAttempt();
            attemptsView.setText(String.valueOf(attempts));
        }

    }

    /**
     * Adds and displays Attempts On Target.
     */
    public void addOnTarget(View view) {
        int intParentId = ((View) view.getParent()).getId();
        String parentId = (getResources().getResourceEntryName(intParentId));
        if (parentId.equals("buttonsTeamA")){
            TextView onTargetView = (TextView) findViewById(R.id.onTargetTeamA);
            int onTarget = teamA.addOnTarget();
            onTargetView.setText(String.valueOf(onTarget));
            addAttempt(view);
        }
        else{
            TextView onTargetView = (TextView) findViewById(R.id.onTargetTeamB);
            int onTarget = teamB.addOnTarget();
            onTargetView.setText(String.valueOf(onTarget));
            addAttempt(view);
        }

    }

    /**
     * Adds and displays Offsides.
     */
    public void addOffside(View view) {
        int intParentId = ((View) view.getParent()).getId();
        String parentId = (getResources().getResourceEntryName(intParentId));
        if (parentId.equals("buttonsTeamA")) {
            TextView offsidesView = (TextView) findViewById(R.id.offsidesTeamA);
            int offside = teamA.addOffside();
            offsidesView.setText(String.valueOf(offside));
        } else {
            TextView offsidesView = (TextView) findViewById(R.id.offsidesTeamB);
            int offside = teamB.addOffside();
            offsidesView.setText(String.valueOf(offside));
        }
    }

    /**
     * Adds and displays Corners.
     */
    public void addCorner(View view) {
        int intParentId = ((View) view.getParent()).getId();
        String parentId = (getResources().getResourceEntryName(intParentId));
        if (parentId.equals("buttonsTeamA")) {
            TextView cornersView = (TextView) findViewById(R.id.cornersTeamA);
            int offside = teamA.addCorner();
            cornersView.setText(String.valueOf(offside));
        } else {
            TextView cornersView = (TextView) findViewById(R.id.cornersTeamB);
            int offside = teamB.addCorner();
            cornersView.setText(String.valueOf(offside));
        }
    }

    /**
     * Adds and displays Yellow Cards.
     */
    public void addYellowCard(View view) {
        int intParentId = ((View) view.getParent()).getId();
        String parentId = (getResources().getResourceEntryName(intParentId));
        if (parentId.equals("buttonsTeamA")) {
            TextView yellowCardView = (TextView) findViewById(R.id.yellowCardsTeamA);
            int yellowCard = teamA.addYellowCard();
            yellowCardView.setText(String.valueOf(yellowCard));
        } else {
            TextView yellowCardView = (TextView) findViewById(R.id.yellowCardsTeamB);
            int yellowCard = teamB.addYellowCard();
            yellowCardView.setText(String.valueOf(yellowCard));
        }
    }

    /**
     * Adds and displays Red Cards.
     */
    public void addRedCard(View view) {
        int intParentId = ((View) view.getParent()).getId();
        String parentId = (getResources().getResourceEntryName(intParentId));
        if (parentId.equals("buttonsTeamA")) {
            TextView redCardView = (TextView) findViewById(R.id.redCardsTeamA);
            int redCard = teamA.addRedCard();
            redCardView.setText(String.valueOf(redCard));
        } else {
            TextView redCardView = (TextView) findViewById(R.id.redCardsTeamB);
            int redCard = teamB.addRedCard();
            redCardView.setText(String.valueOf(redCard));
        }
    }

    /**
     * Resets the scores for both teams.
     */
    public void reset(View view){
        teamA.reset();
        teamB.reset();
        TextView goalsTeamA = (TextView) findViewById(R.id.goalsTeamA);
        goalsTeamA.setText(String.valueOf(0));
        TextView goalsTeamB = (TextView) findViewById(R.id.goalsTeamB);
        goalsTeamB.setText(String.valueOf(0));
        TextView attemptsTeamA = (TextView) findViewById(R.id.attemptsTeamA);
        attemptsTeamA.setText(String.valueOf(0));
        TextView attemptsTeamB = (TextView) findViewById(R.id.attemptsTeamB);
        attemptsTeamB.setText(String.valueOf(0));
        TextView onTargetTeamA = (TextView) findViewById(R.id.onTargetTeamA);
        onTargetTeamA.setText(String.valueOf(0));
        TextView onTargetTeamB = (TextView) findViewById(R.id.onTargetTeamB);
        onTargetTeamB.setText(String.valueOf(0));
        TextView offsidesTeamA = (TextView) findViewById(R.id.offsidesTeamA);
        offsidesTeamA.setText(String.valueOf(0));
        TextView offsidesTeamB = (TextView) findViewById(R.id.offsidesTeamB);
        offsidesTeamB.setText(String.valueOf(0));
        TextView cornersTeamA = (TextView) findViewById(R.id.cornersTeamA);
        cornersTeamA.setText(String.valueOf(0));
        TextView cornersTeamB = (TextView) findViewById(R.id.cornersTeamB);
        cornersTeamB.setText(String.valueOf(0));
        TextView yellowCardsTeamA = (TextView) findViewById(R.id.yellowCardsTeamA);
        yellowCardsTeamA.setText(String.valueOf(0));
        TextView yellowCardsTeamB = (TextView) findViewById(R.id.yellowCardsTeamB);
        yellowCardsTeamB.setText(String.valueOf(0));
        TextView redCardsTeamA = (TextView) findViewById(R.id.redCardsTeamA);
        redCardsTeamA.setText(String.valueOf(0));
        TextView redCardsTeamB = (TextView) findViewById(R.id.redCardsTeamB);
        redCardsTeamB.setText(String.valueOf(0));
    }

}

class Team{
    private int goals = 0;
    private int attempts = 0;
    private int onTarget = 0;
    private int offsides = 0;
    private int corners = 0;
    private int yellowCards = 0;
    private int redCards = 0;

    public void reset(){
        this.goals = 0;
        this.attempts = 0;
        this.onTarget = 0;
        this.offsides = 0;
        this.corners = 0;
        this.yellowCards = 0;
        this.redCards = 0;
    }

    public int addGoal(){
        this.goals += 1;
        return this.goals;
    }

    public int addAttempt(){
        this.attempts += 1;
        return this.attempts;
    }

    public int addOnTarget(){
        this.onTarget += 1;
        return this.onTarget;
    }

    public int addOffside(){
        this.offsides += 1;
        return this.offsides;
    }

    public int addCorner(){
        this.corners += 1;
        return this.corners;
    }

    public int addYellowCard(){
        this.yellowCards += 1;
        return this.yellowCards;
    }

    public int addRedCard(){
        this.redCards += 1;
        return this.redCards;
    }
}