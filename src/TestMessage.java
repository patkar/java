
public class TestMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TwitterFeedReader tfr=new TwitterFeedReader();
Message m=tfr.pollForNewMessage();
System.out.println(m.getMessageId());
System.out.println(m.getMessageSource());
System.out.println(m.getMessgeType());
System.out.println(m.getMessage());
System.out.println(m.getSender());

FacebookReader fr=new FacebookReader();
Message fm=fr.pollForNewMessage();
System.out.println(fm.getMessageId());
System.out.println(fm.getMessageSource());
System.out.println(fm.getMessgeType());
System.out.println(fm.getMessage());
System.out.println(fm.getSender());
	}

}
