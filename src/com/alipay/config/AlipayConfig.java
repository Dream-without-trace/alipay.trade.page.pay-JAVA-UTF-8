package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2018031602389501";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDC/Ivv/YxgdttUZYo61aOaN15Wx6pqrNx+CP+ukEHG3NWDM4QcQils3yyDI+9ZUaBnR7EBAkhDaonPS4zH7dbBdF5Fa8j3TaDHjxACLLt6TvC54S01Z39TzNx7TBD+7sjSydgW79lTCC2DKmK0Eb007PAdld4na9okMCgQMLQ5brDzryb8uZCo1Rgd95yFl6AWPQkVrMHk+ItbK8mxap+Ur/yh4Ovc+AZTsJRGSfeXuuSswXA0ow1EjDW+SwxPKw0VpljKSI7atmPKZ2kLwY5SdeHDqfyaCzpDZWIlie81xvlzA9DidCbD0t8oQMMOfSOqcok3ztFkRsIYQrqSQ2O7AgMBAAECggEAHaFRBpQqC9Kj+8w+WDh01w+I53kJ/ZHtI73sVLOZO0X9sCVY8w5eyyuS0Q7Z5WHRFUDAth2Jq6z56iVZ7FvJIba0SKpbbLFAOHMWBK6Vgr2SOTztqMrkf3CHJLlnb8YLgHSpwLqL9OEuQVtkimaTsQI8btKCYs0x5gPnYqZ0DLHwI10dUxFa2+SznxZtOyaVZ4SPOAP8D+mqWicvUYfPhTkmHt8tDnmPfy02h2FE0aYbJm1mmVK1PcM1C8d11jUfM2WjLzUghPDUN/bItJvdnRySMm0smzMFQukC66ameKTJ+S9tnMoQSSCsdRmsH22dXOlo5eZXyAk7kO0061bQgQKBgQD5aqZcdOumXSo4cK49jidG8rCi2bbYff+TI2Fc2H/XmwbTD7NiydlMcT4YdNYa8TOhGqAqw332ui5uRXbs2uZNy+Y+y2zJXq1b6FCXu2+MymDdB/yc/ASAs651gqVeWjc1aTzK0KpvI/n1G/H6wI4EGsOQk/1adFETzjdOFEVAwQKBgQDIIhp8BYMQIKXfqBfG7hY8jUaQh8/dob34CuvHVm7n0sbrntfPT5AwwMfVSI0FutZqgDL7SfzYN/F8vyvW7A6GKElAJXXA9Wg9TeXBKSFxWcGYuBg63+s1TxWM3d8934N2dcFmQON432RgbV4zL1NhMwV5i2RT5CKFcHRORjgHewKBgGgGqVhKk7aRiPh9Vs7pqUwYEL/7Wh21f5EY4pTc34VHbXM+Sy1azrzpRmLg6CPYkhYRitgLLVBomtD3PADR09iCwIdURQ0/5cI9hM+kJ4RrLDdEC4JWQnKDfrIYSWyu5/Po7qgQm+U69hfbDfPtt83Sc9qrPrIpbV97VOnF3pSBAoGAPXNTRH+AxcPwiqMXYeqbA06xuxEofzn5lZ7s1JEyjpYGpDRquWoJsR6QfWnAe2DqE1t3y/bk3xMWYCJm+KAUuZbHHx4hcPUpY6F2iX/yl9Zifl0Qe4tjskOtL0q1EE+AEzCHCLml3uhg7sbGJNtEM9UxuidVz/h9rRFhdONUst8CgYEAjf62l8jGShX5j7Ey+EdWCdpYsNffDj6ageUR4qIN8fZI7J+Na5s8pzOqebKU8Xe7ck8en0CQ7mIE4Jz26J+kSMtUD3RZpnJEZFaG58V5QKJLtFf8Q7ct56SqFkUTCz+jkpaZYDU710B/MgVdrusLlkBJLQeCyLHENsEBrDxiNfk=";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAkxGtE8ZRCTtKJrPo0f8zIny6uW8lfslbQzb9tm8khJn7qp9rsW9OTnqcE0LqnPaCBatKnhqfwtCbLMn0Gu6OeAUQMDymag9TmL4goRtuYzxc4FrZALrHI2Uso1k7DN++jO82TtTyoW1qqimBx46E30MtM1Mylg95AsHU01dGmqBbAjFmPpSCj4esO6MlYCQjpPJWyFWeT0AiAD8UXUeZ43ziUBZOymd+CKhxDLwksDIHpDeEDtdP5xFL39UiOv14IRvDCZxkbBcR4Ry9O5yTKp3doZ2XzKdiJrpwos2lfOXvtTFK0Th7HUlLZuAMB0OOImPK/YJ/yhUYe4NUYxIcHQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://211.149.207.217:8086/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://211.149.207.217:8086/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipay.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
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

