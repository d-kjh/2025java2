package aaa.interfaces;

public class BravoCryptImpl implements CryptInterface {
    private BravoCrypt betaCrypt = new BravoCrypt();

    @Override
    public void encode(String str) {
        betaCrypt.mcc(str);
    }

    @Override
    public void decode(String str) {
        betaCrypt.mdd(str);
    }
}
