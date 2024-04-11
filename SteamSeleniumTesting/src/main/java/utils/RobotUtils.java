package utils;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class RobotUtils {

    private Robot robot;

    public RobotUtils(){
        try{
            robot = new Robot();
        } catch (AWTException e){
            e.printStackTrace();
        }
    }
    public void robotUploadImg(String filePath){

        //Store the path of the file to be uploaded
        StringSelection filepath = new StringSelection(filePath);

        //Copy above the path to clipboard
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath,null);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
    }
}