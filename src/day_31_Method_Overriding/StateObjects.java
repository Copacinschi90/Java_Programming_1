package day_31_Method_Overriding;

public class StateObjects {
    public static void main(String[] args) {
        Florida fl = new Florida("Florida", "FL", "Republican", "Ron DeSantis", "Marco Rubio and Rick Scott", 22244823, 0.07, "Disney World");
        California ca = new California("California", "CA", "Democratic", "Gavin Newsom", "Alex Padilla and Dianne Feinstein", 39029342, 0.0725);
        Texas tx = new Texas("Texas", "TX", "Republican", "Greg Abbott", "John Cornyn and Ted Cruz", 30029572, 0.0625);
        Virginia va = new Virginia("Virginia", "VA", "Republican", "Ralph Northam", "Mark Warner and Tim Kaine", 8683619, 0.0575);



        System.out.println(fl);
        System.out.println(ca);
        System.out.println(tx);
        System.out.println(va);

    }
}
