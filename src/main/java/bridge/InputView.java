package bridge;

import camp.nextstep.edu.missionutils.Console;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {

    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() {
        String lengthInput = Console.readLine();
        validateLength(lengthInput);
        return Integer.parseInt(lengthInput);
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        String moveInput = Console.readLine();
        validateLength(moveInput);
        return moveInput;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        String commandInput = Console.readLine();
        validateLength(commandInput);
        return commandInput;
    }
    public void validateLength(String input){
        Pattern pass = Pattern.compile("^[1-2][0-9]|[3-9]$");
        Matcher matcher = pass.matcher(input);
        if(!matcher.find()){
            throw new IllegalArgumentException("[ERROR] 다리 길이");
        }
    }
    public void validateMove(String input){
        Pattern pass = Pattern.compile("^'U'|'D'$");
        Matcher matcher = pass.matcher(input);
        if(!matcher.find()){
            throw new IllegalArgumentException("[ERROR] 이동에 대해 U,D만 입력 가능합니다.");
        }
    }
    public void validateCommand(String input){
        Pattern pass = Pattern.compile("^'R'|'Q'$");
        Matcher matcher = pass.matcher(input);
        if(!matcher.find()){
            throw new IllegalArgumentException("[ERROR] 재시작에 대해 R,Q만 입력 가능하비낟.");
        }
    }
}
