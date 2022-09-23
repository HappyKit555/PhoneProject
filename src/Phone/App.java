package Phone;

/**
 * @author HappyKit
 * @version 11.0
 * @date 2021/8/29 23:22
 */


/**
 * 电话本项目入口类
 */
public class App {
    /**
     * 启动电话本项目
     * @param args
     */
    public static void main(String[] args){
        App app = new App();
        app.start();
    }

    /**
     * 控制主菜单
     */
    public void start(){
        Menu menu = new Menu();
        TelNoteRegex regex = new TelNoteRegex();
        Operator operator = new Operator();
        while(true){
            menu.mainMenu();
            int item = regex.menuItemValidate(1,6);
            switch(item){
                case 1:
                    operator.addLogic();
                    break;
                case 2:
                    operator.searchLogic();
                    break;
                case 3:
                    operator.modifyLogic();
                    break;
                case 4:
                    operator.deleteLogic();
                    break;
                case 5:
                    operator.orderLogic();
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }
}
