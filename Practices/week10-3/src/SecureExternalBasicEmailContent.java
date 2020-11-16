public class SecureExternalBasicEmailContent extends BasicEmailContent {
    public SecureExternalBasicEmailContent(String content) {
        super(content);
    }

    public String getContent() {
        String content = super.getContent();
        String externalContent = addDisclaimer(content);
        String encryptedContent = encrypt(externalContent);
        return encryptedContent;
    }

    private String addDisclaimer(String content) {
        return content + "Company Disclaimer";
    }

    private String encrypt(String content) {
        return content + "Encrypted";
    }
}
