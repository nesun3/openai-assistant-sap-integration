import com.sap.gateway.ip.core.customdev.util.Message
import java.nio.charset.Charset

def Message processData(Message message) {

    StringBuilder builder = new StringBuilder()
    def headers = message.getHeaders()

    headers.each {
        key, value -> builder << "${key}=${value}\n"
    }

    def messageLog = messageLogFactory.getMessageLog(message)
    if( messageLog != null)
        messageLog.addAttachmentAsString("Incoming HTTP Headers", builder.toString(), "text/plain")

    String httpQuery = headers.get('CamelHttpQuery')

    if (httpQuery) {
        Map<String, String> queryParameters = URLDecoder.decode(httpQuery, Charset.defaultCharset().name())
                .replace("\$","")
                .tokenize('&')
                .collectEntries { it.tokenize('=') }

        message.setProperties(queryParameters)
    }

    def body = message.getBody(String)
    message.setProperty('EmptyPayload', body == null || body.isEmpty())

    return message
}
