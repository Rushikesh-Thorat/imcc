package pkgQuestion12;

public class RSA implements Encryptable {

	@Override
	public String encrypt(String data) {
		return new StringBuilder(data).reverse().toString();
	}

	@Override
	public String decrypt(String encryptedData) {
        return new StringBuilder(encryptedData).reverse().toString();


	}

}
