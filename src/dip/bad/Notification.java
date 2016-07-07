package dip.bad;

public class Notification {
	 private Email _email;
	    public Notification()
	    {
	        _email = new Email();
	    }

	    public void promotionalNotification()
	    {
	        _email.SendEmail();
	    }
}
