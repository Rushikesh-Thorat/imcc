package pkgQuestion12;

import java.util.Base64;

public class AES implements Encryptable {

	@Override
	public String encrypt(String data) {
		return Base64.getEncoder().encodeToString(data.getBytes());
		
	}

	@Override
	public String decrypt(String encryptedData) {
		return new String(Base64.getDecoder().decode(encryptedData));
	}

}
