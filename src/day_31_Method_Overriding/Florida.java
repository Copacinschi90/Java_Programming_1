package day_31_Method_Overriding;

public class Florida extends States {

    private String stateDisneyWorld;

    public Florida(String name, String politicalParty, String governor, String senator, String abbreviation, double population, double stateTax, String stateDisneyWorld) {
        super(name, politicalParty, governor, senator, abbreviation, population, stateTax);
        setStateDisneyWorld(stateDisneyWorld);
    }

    public String getStateDisneyWorld() {
        return stateDisneyWorld;
    }

    public void setStateDisneyWorld(String stateDisneyWorld) {
        this.stateDisneyWorld = stateDisneyWorld;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDisney World: " + stateDisneyWorld;
    }
}



