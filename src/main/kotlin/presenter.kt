import kotlinx.browser.document
import org.w3c.dom.HTMLButtonElement

fun initPresenter()
{
    val stopBtn = document.getElementById("stop") as HTMLButtonElement
    val pauseBtn = document.getElementById("pause") as HTMLButtonElement
    val runBtn = document.getElementById("run") as HTMLButtonElement

    stopBtn.addEventListener("click", {
        doStop()});
    runBtn.addEventListener("click", {
        doResume()});
    pauseBtn.addEventListener("click", {
        doPause()});
}

fun startPresenting()
{

}