public abstract class HraSachovnice {

    protected final HraPosunPoSachovnici game;


    public HraSachovnice() {
        this(8,8);
    }

    public HraSachovnice(int nx, int ny) {
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
}
