import com.sap.gateway.ip.core.customdev.util.Message

def Message processData(Message message) {

    def body = message.getBody(String)
    sleep(1500)
    message.setBody(body)
    return message
}
