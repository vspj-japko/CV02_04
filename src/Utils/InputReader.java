package Utils;

import java.util.Scanner;

public class InputReader {

    private final static Scanner scan = new Scanner(System.in);

    public static Short readShort() throws NumberFormatException {
        try {
            return Short.parseShort(scan.nextLine());
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static Integer readInt() throws NumberFormatException {
        try {
            return Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static Float readFloat() throws NumberFormatException {
        try {
            return Float.parseFloat(scan.nextLine());
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static Double readDouble() throws NumberFormatException {
        try {
            return Double.parseDouble(scan.nextLine());
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static String readString() {
        return scan.nextLine();
    }

    public static Character readChar() {
        String temp = scan.nextLine();
        return temp.length() == 1 ? temp.charAt(0) : null;
    }
}