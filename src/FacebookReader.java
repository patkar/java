
public class FacebookReader implements SocialFeedReader {
@Override
public Message pollForNewMessage() {
	// TODO Auto-generated method stub
	Message m2=new Message();
	m2.setMessageId(2);
	m2.setMessageSource("Facebook");
	m2.setMessgeType("string");
	m2.setMessage("hello from facebook");
	m2.setSender("Facebook Admin");
	return m2;
}
}
