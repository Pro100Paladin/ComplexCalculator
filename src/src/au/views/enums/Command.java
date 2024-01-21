package au.views.enums;

public enum Command {

    PLUS("+"),
    MINUS("-"),
    DEV("/"),
    MUL("*"),
    EQUALS("="),
    STOP(".");

    private String command;

    public String getCommand() {
        return command;
    }

    Command(String command) {
        this.command = command;
    }
}
