package aaa.interfaces;

public class CryptFactory {
    public static CryptInterface createCrypt(String name) {
        return switch (name){
            case "alpha" -> new AlphaCryptImpl();
            case "bravo" -> new BravoCryptImpl();
            case "charlie" -> new CharlieCryptImpl();
            default -> null;
        };
    }
}
