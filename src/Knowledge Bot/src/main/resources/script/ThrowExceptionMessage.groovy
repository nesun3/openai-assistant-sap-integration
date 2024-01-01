import com.sap.gateway.ip.core.customdev.util.Message
import com.sap.it.api.ITApiFactory
import com.sap.it.api.securestore.SecureStoreService

def Message processData(Message message) {

    def prop = message.getProperties()
    
    def assistant_id = prop.get("assistant_id")
    if(assistant_id == null || assistant_id.trim().length() == 0 || assistant_id.trim() == '""')
        throw new NullPointerException("\'Error: assistant_id is missing or null.\'")

    def thread_id = prop.get("thread_id")
    if(thread_id == null || thread_id.trim().length() == 0 || thread_id.trim() == '""')
        throw new NullPointerException("\'Error: thread_id is missing or null.\'")

    def openApiKeyAlias = prop.get("OPENAI_API_KEY")
    if(openApiKeyAlias == null || openApiKeyAlias.trim().length() == 0 || openApiKeyAlias.trim() == '""')
        throw new NullPointerException("\'Error: Name of the credential created in Security Material to store OPENAI_API_KEY is missing or null.\'")

    def openApiKey = getOpenApiKey(openApiKeyAlias)
    message.setProperty("OPENAI_API_KEY", openApiKey)

    return message
}

String getOpenApiKey(String keyAlias)
{
    def secureStorageService =  ITApiFactory.getService(SecureStoreService.class, null)
    try
    {
        def secureParameter = secureStorageService.getUserCredential(keyAlias)
        return secureParameter.getPassword().toString()
    }
    catch(Exception e){
        throw new NullPointerException("\'Error: Secure Parameter for OPENAI_API_KEY is not available or null.\'")
    }
}









