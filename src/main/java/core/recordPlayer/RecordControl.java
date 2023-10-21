package core.recordPlayer;



public class RecordControl  {

    public void startRecord() throws Exception {
        ScreenRecorderUtil.startRecord("main");


    }

    public void stopRecord() throws Exception {
        ScreenRecorderUtil.stopRecord();


    }
}
