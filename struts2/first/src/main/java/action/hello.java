package action;

import com.opensymphony.xwork2.ActionSupport;

import model.MessageStore;

public class hello extends ActionSupport {
    private MessageStore messageStore;

    public String execute() {
        messageStore = new MessageStore() ;
        
        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }
}