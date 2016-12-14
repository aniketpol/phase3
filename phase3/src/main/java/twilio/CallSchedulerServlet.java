package twilio;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.rest.api.v2010.account.CallCreator;
import com.twilio.type.PhoneNumber;

/**
 * 
 * @author Aniket
 * Class is responsible for making a call to a twilio registered number after a given delay
 *  it uses scheduler class under java.util to add deplay 
 */
public class CallSchedulerServlet extends HttpServlet {

	
	public static String phoneNumber;
	public static String delay;
	public static final String ACCOUNT_SID = "AC59f43ff40e03a08ab99d60b55418cf87";
	public static final String AUTH_TOKEN = "5ea119a9d762b9e9a8967fd8e3963fa6";
	
	@Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String phone_Number=request.getParameter("phone_number");
		String delayInSeconds=request.getParameter("delay");
		if(phone_Number!=null && delayInSeconds!=null){
			CallSchedulerServlet.delay=delayInSeconds;
			CallSchedulerServlet.phoneNumber=phone_Number;
			new java.util.Timer().schedule( 
			        new java.util.TimerTask() {
			            @Override
			            public void run() {
			            	Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
			     		    PhoneNumber to=new PhoneNumber(CallSchedulerServlet.phoneNumber);
			     		    PhoneNumber from=new PhoneNumber("+12562026173");
			     		    URI obj=URI.create("https://97fa872b.ngrok.io/phase1/twiml");
			     		    Call call=new CallCreator(to, from, obj).create();
			     		    System.out.println(call.getSid());
			            }
			        }, 
			        Long.parseLong(CallSchedulerServlet.delay)*1000
			);
			response.sendRedirect("/phase3/success.jsp");
		}
    }
    
   
}