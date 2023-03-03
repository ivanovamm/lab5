package commands;

public class ExecuteScript extends Command{
    public ExecuteScript(){
        super("execute_script", "считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводить пользователь в интерактивном режиме.");
    }
}
