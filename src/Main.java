public class Main {
    public static void main(String[] args) {

        //RealizaceHryKonzola hra = new RealizaceHryKonzola();
        // hra.execute();
        HraSachovniceRandom hra = new HraSachovniceRandom(8, 8);
        hra.execute();

        /*HraSachovniceManual hra = new HraSachovniceManual();
        hra.execute(); */
    }
}