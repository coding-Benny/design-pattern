public class ExternalEmailContent extends EmailDecorator {
    public ExternalEmailContent(EmailContent emailContent) {
        super(emailContent);
    }

    public String getContent() {
        String content = super.getContent();
        String externalContent = addDisclaimer(content);
        return externalContent;
    }

    private String addDisclaimer(String content) {
        return content + "Company Disclaimer";
    }
}
