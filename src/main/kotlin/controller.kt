

fun doStop()
{
    console.log("interrupt")
    interrupt = true;
}

fun doPause()
{
    console.log("pause")
    pause = true;
}

fun doResume()
{
    console.log("resume")
    pause = false;
}

