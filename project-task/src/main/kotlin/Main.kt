import org.apache.commons.httpclient.HttpClient
import org.apache.commons.httpclient.methods.GetMethod
import java.io.File

fun main() {
    var client = HttpClient()
    var range=211279949460..211279949475
    for (i in range){
        var menthod = GetMethod("https://tenfei01.cfp.cn/creative/vcg/800/new/VCG${i}-PVK.jpg" )
        client.executeMethod(menthod)
        var responseBody = menthod getResponseBody()
        var file = File("${i}.jpg")

    }
}

