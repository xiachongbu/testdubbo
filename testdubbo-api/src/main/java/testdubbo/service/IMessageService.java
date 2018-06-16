package testdubbo.service;


import testdubbo.vo.Message;

public interface IMessageService {
    public Message echo(Message msg);
}
