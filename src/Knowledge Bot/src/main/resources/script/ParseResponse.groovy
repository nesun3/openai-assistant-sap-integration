import com.sap.gateway.ip.core.customdev.util.Message
import groovy.json.JsonSlurper

def Message CreateRun(Message message) {

    def body = message.getBody(java.io.Reader)
    def jsonData = new JsonSlurper().parse(body)
    message.setProperty("run_id", jsonData.id)

    return message
}

def Message RetrieveRun(Message message) {

    def body = message.getBody(java.io.Reader)
    def jsonData = new JsonSlurper().parse(body)
    message.setProperty("status", jsonData.status)
    if(jsonData.status == "failed")
        message.setProperty("last_error", jsonData.last_error.message)

    return message
}

def Message ListMessages(Message message) {

    def body = message.getBody(java.io.Reader)
    def jsonData = new JsonSlurper().parse(body)
    message.setBody(jsonData.data[0].content[0].text.value)

    return message
}
