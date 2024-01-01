/*
Refer the link below to learn more about Assistants API.
https://platform.openai.com/docs/api-reference/assistants
*/
import com.sap.gateway.ip.core.customdev.util.Message
import groovy.json.JsonOutput

def Message CreateMessage(Message message) {

    //Body parameters
    def body = message.getBody(String)
    def jsonOutput = JsonOutput.toJson([
            role: "user",
            content: body
    ])

    //println JsonOutput.prettyPrint(jsonOutput)
    message.setBody(JsonOutput.prettyPrint(jsonOutput))
    return message
}

def Message CreateRun(Message message) {

    def prop = message.getProperties()
    def assistantId = prop.get("assistant_id").toString()
    def run_instructions = prop.get("run_instructions").toString()?:""

    def jsonOutput = JsonOutput.toJson([
            assistant_id: assistantId,
            instructions: run_instructions
    ])

    //println JsonOutput.prettyPrint(jsonOutput)
    message.setBody(JsonOutput.prettyPrint(jsonOutput))
    return message
}


