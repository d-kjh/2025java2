package aaa.interfaces;

public class AlphaCryptImpl implements CryptInterface {
    private AlphaCrypt alphaCrypt = new AlphaCrypt();

    @Override
    public void encode(String str) {
        alphaCrypt.maa(str);
    }

    @Override
    public void decode(String str) {
        alphaCrypt.mbb(str);
    }
}
