
import kotlinx.browser.document
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.w3c.dom.HTMLTextAreaElement
import kotlin.js.Date


var interrupt = false;
var pause = false;

fun main(){
    initPresenter();
    CoroutineScope(Dispatchers.Default).launch{ processing(10000) };
}

private suspend fun processing(timeInterval: Long)
{
    var container = document.getElementById("content") as HTMLTextAreaElement;

    while (!interrupt)
    {
        if(interrupt)
        {
           break;
        }

        if(!pause)
        {
            //get data for events here
            container.value = container.value + "\r" + Date.now().toString();
            container.scrollTop = container.scrollHeight.toDouble()


        }
        delay(timeInterval)
    }
    container.value ="---BREAK---"
}












