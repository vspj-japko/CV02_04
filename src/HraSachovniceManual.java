

public class HraSachovniceManual extends HraSachovnice {

    public HraSachovniceManual(int nx, int ny) {
        super(nx, ny);
    }

    public HraSachovniceManual() {
        super();
    }


    @Override
    public void execute() {
        Character input;
        while (true) {
            System.out.print("Zadej vstup (L, R, U, D, K): ");
            input = InputReader.readChar();

            if(input != null && getMove(input) != Direction.NULL) game.move(getMove(input));
            else if (input != null && (input == 'k' || input == 'K')) break;
            else System.out.println("Musis zadat jeden ze znaku: L, R, U, D, K");
        }
        System.out.println(game.getHistoryAsString());
    }
}
