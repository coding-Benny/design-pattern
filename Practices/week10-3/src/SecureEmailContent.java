public class SecureEmailContent extends EmailDecorator {
    public SecureEmailContent(EmailContent emailContent) {
        super(emailContent);
    }

    public String getContent() {
        String content = super.getContent();
        String encryptedContent = encrypt(content);
        return encryptedContent;
    }

    private String encrypt(String content) {
        return content + "Encrypted";
    }
}
