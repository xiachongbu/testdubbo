package testdubbo.service;


import testdubbo.vo.Message;

public class IMessageServiceMock implements IMessageService {

    @Override
    public Message echo(Message msg) {
        Message echoMsg = new Message();
        echoMsg.setTitle("【MOCK】" + msg.getTitle());
        return echoMsg;
    }

}
