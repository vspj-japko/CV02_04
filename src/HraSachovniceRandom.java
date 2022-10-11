import java.util.Random;

public class HraSachovniceRandom extends HraSachovnice {

    public HraSachovniceRandom(int nx, int ny) {
        super(nx, ny);
    }

    public HraSachovniceRandom() {
        super();
    }

    @Override
    public void execute() {
        int moveCount = getMoveCount();
        while(moveCount != 0) {
            game.move(getMove(generateMove()));
            moveCount--;
        }

        System.out.println(game.getHistoryAsString());
    }

    private int getMoveCount() {
        Integer moveCount = null;
        while(moveCount == null) {
            System.out.println("Zadej pocet pohybu:");
            moveCount = InputReader.readInt();
        }
        return moveCount;
    }

    private char generateMove() {
        char[] moves = {'U', 'D', 'L', 'R'};
        Random random = new Random();
        return moves[random.nextInt(moves.length)];
    }
}
