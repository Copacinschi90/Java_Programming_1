package day_31_Method_Overriding;

public class States {
    private String name, abbreviation,politicalParty,Governor,senator;
    private double population,stateTax;

    public States(String name, String abbreviation, String politicalParty, String governor, String senator, double population, double stateTax) {
        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
       setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
        setStateTax(stateTax);
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        if(name== null || name.isEmpty() || name.isBlank()){
            System.err.println("Invalid name " + name);
            System.exit(1);
        }
        this.name = name;
    }

    public String getAbbreviation() {

        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if(abbreviation== null || abbreviation.isEmpty() || abbreviation.isBlank()) {
            System.err.println("Invalid abbreviation " + abbreviation);
            System.exit(1);
        }
        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if(politicalParty== null || politicalParty.isEmpty() || politicalParty.isBlank()) {
            System.err.println("Invalid politicalParty " + politicalParty);
            System.exit(1);
        }
        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        return Governor;
    }

    public void setGovernor(String governor) {
        if(governor== null || governor.isEmpty() || governor.isBlank()) {
            System.err.println("Invalid governor " + governor);
            System.exit(1);
        }
        Governor = governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if(senator== null || senator.isEmpty() || senator.isBlank()) {
            System.err.println("Invalid senator" + senator);
            System.exit(1);
        }
        this.senator = senator;
    }

    public double getPopulation() {

        return population;
    }

    public void setPopulation(double population) {
        if( population<=0){
            System.err.println("Invalid population count" +population);
            System.exit(1);
        }
        this.population = population;
    }

    public double getStateTax() {
        return stateTax;
    }

    public void setStateTax(double stateTax) {
        if(stateTax<0){
            System.err.println("Invalid state Tax rate");
            System.exit(1);
        }
        this.stateTax = stateTax;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", Governor='" + Governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                ", stateTax=" + stateTax +
                '}';
    }
}
