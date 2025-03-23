package pkgQuestion12;

public class EncryptionDemo {
	 public static void main(String[] args) {
	        String message = "Hello, Secure World!";

	        // AES Encryption and Decryption
	        Encryptable aes = new AES();
	        String aesEncrypted = aes.encrypt(message);
	        String aesDecrypted = aes.decrypt(aesEncrypted);

	        System.out.println("AES Encrypted: " + aesEncrypted);
	        System.out.println("AES Decrypted: " + aesDecrypted);

	        // RSA Encryption and Decryption
	        Encryptable rsa = new RSA();
	        String rsaEncrypted = rsa.encrypt(message);
	        String rsaDecrypted = rsa.decrypt(rsaEncrypted);

	        System.out.println("RSA Encrypted: " + rsaEncrypted);
	        System.out.println("RSA Decrypted: " + rsaDecrypted);
	    }
}
