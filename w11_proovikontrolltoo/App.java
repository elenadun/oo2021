public class App {
    public static void main(String[] arg){
        Jook jook = new Jook("limonaad Limpa", 1.0, 1.15); //Koosta klass Jook, millel on nimetus, liitri omahind ning erikaal
        Joogipudel pudel = new Joogipudel(jook, 0.5, 0, 0.2, 0.1); //Koosta klass Joogipudel, millel on maht, pudelityyp, mass ning taara maksumus

        
        System.out.println(jook.joogiNimetus());
        System.out.println(pudel);
        System.out.println(pudel.joogiMass());
        System.out.println(pudel.joogiOmahind());
    }
}
