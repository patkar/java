
public class TwitterFeedReader implements SocialFeedReader {

	@Override
	public Message pollForNewMessage() {
		Message m1=new Message();
		m1.setMessageId(1);
		m1.setMessageSource("twitter");
		m1.setMessgeType("String");
		m1.setMessage("hello");
		m1.setSender("Twitter Admin");
		return m1;
	}

	

}
