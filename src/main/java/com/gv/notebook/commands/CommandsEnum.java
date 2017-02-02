package com.gv.notebook.commands;

public enum CommandsEnum {
    LOGIN{
        {
            this.command = new LoginCommand();
        }
    },
    LOGOUT{
        {
            //this.command = new LogoutCommand();
        }
    },
    REGISTER{
        {
            //this.command = new RegisterCommand();
        }
    },
    SEND{
        {
            //this.command = new SendCommand();
        }
    };

    private Command command;

    public Command getCurrentCommand(){
        return this.command;
    }
}
