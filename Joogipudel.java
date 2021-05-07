public class Joogipudel {
    
    Jook jook;
    double maht; 
    int pudelityyp; 
    double kogus; 
    double taarahind;


    public Joogipudel(Jook jook, double maht, int pudelityyp, double kogus, double taarahind){
        this.jook = jook;
        this.maht = maht;
        this.pudelityyp = pudelityyp;
        this.kogus = kogus;
        this.taarahind = taarahind;
    }

    public String tagastameKoguString(){
    return "Jook: " + jook + " taara: " + ((pudelityyp == 0?" klaas ":" plastik ") + kogus + ":kg, " + taarahind + " :eur.");
    }

    public double joogiMass(){
        if(jook == null)
    return kogus;
    return kogus + maht*jook.joogiErikaal();
    }

    public double joogiOmahind(){
        if(jook == null)
    return taarahind;
    return taarahind + maht*jook.joogiOmahind();
    }

    public double kusiMaht() {
    return maht;
    }

    public Jook kusiSisu(){
    return jook;
}
    public void uusSisu(Jook j){
    jook = j;
}
}
