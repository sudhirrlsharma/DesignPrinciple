package dip.good;

public class Notification {
	 private IMessageService messageService;

	    public Notification()
	    {
	        messageService = new Email();
	    }
	    public void PromotionalNotification()
	    {
	        messageService.sendMessage();
	    }
}
