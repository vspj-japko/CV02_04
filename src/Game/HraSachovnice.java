package Game;

import Utils.Direction;

public abstract class HraSachovnice {

    private final HraPosunPoSachovnici game;

    public HraSachovnice() {
        this((byte)8,(byte)8);
    }

    public HraSachovnice(byte nx, byte ny) {
        this.game = new HraPosunPoSachovnici(nx, ny);
    }

    public abstract void execute();

    protected Direction getMove(Character input) {
        switch (input) {
            case 'L', 'l' -> {
                return Direction.LEFT;
            }
            case 'R', 'r' -> {
                return Direction.RIGHT;
            }
            case 'U', 'u' -> {
                return Direction.UP;
            }
            case 'D', 'd' -> {
                return Direction.DOWN;
            }
            default -> { return Direction.NULL; }
        }
    }

    protected HraPosunPoSachovnici getGame() {
        return this.game;
    }
}
