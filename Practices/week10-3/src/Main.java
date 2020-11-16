public class Main {
    public static void main(String[] args) {
        BasicEmailContent basicEmailContent = new BasicEmailContent("Hello");
        ExternalEmailContent externalEmailContent = new ExternalEmailContent(basicEmailContent);
        SecureEmailContent content = new SecureEmailContent(externalEmailContent);  // 책임 규정 문구까지 암호화
        System.out.println(content.getContent());

        BasicEmailContent basicEmailContent1 = new BasicEmailContent("Hello");
        SecureEmailContent secureEmailContent1 = new SecureEmailContent(basicEmailContent1); // 이메일 내용만 암호화
        ExternalEmailContent externalEmailContent1 = new ExternalEmailContent(secureEmailContent1);
        System.out.println(externalEmailContent1.getContent());
    }
}
