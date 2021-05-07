public class Jook {
    
    String nimetus;
    double omahind;
    double erikaal;

    public Jook(String nimetus, double omahind, double erikaal) {
        this.nimetus = nimetus;
        this.omahind = omahind;
        this.erikaal = erikaal;
    }

    public String joogiNimetus(){
    return nimetus;
    }

    public double joogiErikaal(){
    return erikaal;
    }

    public double joogiOmahind(){
    return omahind;
    }

    public String tagastameKoguString(){
    return nimetus + " " + omahind + " eur/liiter " + erikaal + " kg/liiter";
    }

}
