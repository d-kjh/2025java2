package aaa.interfaces;

public class CharlieCryptImpl implements CryptInterface{
    private CharlieCrypt charlieCrypt = new CharlieCrypt();

    @Override
    public void encode(String str) {
        charlieCrypt.ggg(str);
    }

    @Override
    public void decode(String str) {
        charlieCrypt.uuu(str);
    }
}
