package com.atguigu.scw.webui.config;
import java.io.FileWriter;
import java.io.IOException;
public class AlipayConfig {
	public static String app_id = "2016092900621804";
    public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCD2IiZJOHo8hJuJ0ge8eecTQGFb8Wm4AvLZFJj4/4Wc9Y2Dyfjzuf8qdZkVj6KeRDEwcGa26G2FRtGYnGUowsqLmhs+jd7iLK74x55JL6Hbh+wveCnSlU7rY/CvAtA1/oUK/LUbmExHIbBNA4RWbBTu4miTgl9PbW8RwT/7YYTw9o1DTj44TilzUK2sJ0gBw3TQeOm/xISOnijk/jUb67zeBco7On4B4rtuPTAltUkcdA91t1Ibc9jocRMzI5rn9QzceQWUt3ohIfsYGmN9+f07QfZe51jCqP4aG0fnv3ByuU+f/ayRlxn5cTtLlBJ/8ckOLm3o3ZZCvla1CCA261VAgMBAAECggEAdjvxS3yixnaHBpdderquXCFGcvYoBp02ln/xzrh/fH0GpVX0DLvYmGFp7HLXBPDKk9e5mfjJzPKikfzoJEYOVhZl+QxuQu70cb+b7UGBRwv/iUzNsNfdFXZwzE47vTuxfPNogQ43RIZzZcEbuH14va4ZIB7hLZnwZtY9apEDwqZ93eSJMiANE9bKKxPABo0XyXil5VTWeLVQowGn1GCs6xoZhakuYyhL/2lGP9YLeoHT1tFK40K2sjTenxcIcJ1LTmFy/2gAe7NZKwo3NbSuCdngkzhRv3wn0TaV/rkWRe3DM3MPecYueAzRvKN2qzgBEPulNw0lpEYhtfjE4tmugQKBgQDK7FD1KWJ9JxCmEE5svMWmoTWum1MyeGPIs6ykacBR5s7DhmlpKCYaatRWpe4Qk6MkipBdL/JL5pQ0WFm51GXrTTMdesCaJpz3mhE4QWIj5o00kOcWB1xDH2utf0aE52oX67zJCqCRXC+PP3bn3X86au5Ip+lDl4YT55tqHE37YQKBgQCmVOZP2OpvbJ3pXLIAZKlzZfNYt0/gvoDJoHNwCqldN0ii5Cq9F3rRg43Pf9u9NMZU/3NbzecVH6fnwtYjV6c1RcrwH9Mq/J5KH+oVI4AxNmIvMlx7TUfwhUqeLRag41D2pY29mJGsF39etYV1I9sliGbLE8SdUilrFpz8VSYKdQKBgHjm2cloEeUtTE8U8hT5V+3SqRBSPPyaHCGtY5RF6a8ijFiUkeN0Z1dgBQlnLXM084PHBwJumbc9N1oEtdjxQpQyV90dkPmHPgiMA+x3kEiBieoi13wZgJABfX9OkK6Izn5YFw/VRBu3SCLaFjdJkg81PKmPWXzLH7hmSwOqv4+hAoGAG715E8QHhUHGLE9LWIlxQU+1gAxChCcBb58U4ZDFokhAEvqerh6mWx7nnb2jNjEBCtf3s03pxjobVKnH8OkDd/0F1XpZS4gKFi6waYocLRj20wxBJEdFQjXYtfyrE3YV4KzHsOErGlpo4bDAa0Lpn57aFfBcECjNw5Bn6iWBTKkCgYBlbokvI6E47pccd3dEo8/uS2v5Rm+2thPwvP//xRwHRCp0br942jPppYs8QdRJzzmoUgjMciOQ7pKMAveSbV7MZHozUO/z8CPHJdaL1LwbeYu/98R2EgTawSNymF9t30pz78RCCMpjv9wF58rOTZ+A9vw314diHsbb4x5fofKg6w==";
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAibeLGhTLL3yfHCCtlVz9H538HI3xkL9UEriXsiX6rTaE+Tvx1uALV1IAkIDYTiLQEz1YhCfdsNL4VypcxaHCjF6Z7kRVIM/bYhdBJXESKpGUKP1ASFOiytdhdeYGxXEQk5NYfLAdRN/COFOAcWianJC2vao2woNbLyIK4wX8G+x4OostJi3kA00pUh/rYdiJbLdcpF7KMKhtTbEUHKKHeXRlZ7ItFko7VSwVOAkKe3a/70uoTKVwn7MAvYa7gP8/NLPboKEaQC+Zu02QZtq7r2w8+Jha+tn4vHPHlSYTLVl+bmZupiDzx02/qIgioatqj7st8rjVmDvwYj3Ph8OLBwIDAQAB";
	public static String notify_url = "http://139.224.55.152:10000/order/notifyurl";
	public static String return_url = "http://139.224.55.152:10000/order/returnurl";
	public static String sign_type = "RSA2";
	public static String charset = "utf-8";
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	public static String log_path = "F:\\";
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}