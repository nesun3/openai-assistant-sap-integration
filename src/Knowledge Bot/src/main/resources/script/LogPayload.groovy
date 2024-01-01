import com.sap.gateway.ip.core.customdev.util.Message

def Message LogUserMessage(Message message) {

    def body = message.getBody(String)
    def messageLog = messageLogFactory.getMessageLog(message)
    if( messageLog != null)
        messageLog.addAttachmentAsString("User Message", body, "text/plain")

    return message
}

def Message LogCreateMessage(Message message) {

    def body = message.getBody(String)
    def messageLog = messageLogFactory.getMessageLog(message)
    if( messageLog != null)
        messageLog.addAttachmentAsString("CreateMessage", body, "text/plain")

    return message
}

def Message LogCreateRun(Message message) {

    def body = message.getBody(String)
    def messageLog = messageLogFactory.getMessageLog(message)
    if( messageLog != null)
        messageLog.addAttachmentAsString("CreateRun", body, "text/plain")

    return message
}

def Message LogRetrieveRun(Message message) {

    def body = message.getBody(String)
    def messageLog = messageLogFactory.getMessageLog(message)
    if( messageLog != null)
        messageLog.addAttachmentAsString("RetrieveRun", body, "text/plain")

    return message
}

def Message LogPollingUpdates(Message message) {

    def prop = message.getProperties()
    def iterations = prop.get("iterations").toString()
    def value = iterations.toInteger()
    value++
    message.setProperty("iterations", value)

    def body = message.getBody(String)
    def messageLog = messageLogFactory.getMessageLog(message)
    if( messageLog != null)
        messageLog.addAttachmentAsString("PollingUpdates-$iterations", body, "text/plain")

    return message
}


def Message LogListMessages(Message message) {

    def body = message.getBody(String)
    def messageLog = messageLogFactory.getMessageLog(message)
    if( messageLog != null)
        messageLog.addAttachmentAsString("ListMessages", body, "text/plain")

    return message
}


