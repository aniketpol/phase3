# phase3

<b>Description:</b>

Phase III impelments the phonebuzz implementation using twilio twiml  as per instruction <br>
This phase is dependent on the phase I and II.Twiml generator implemented in the phase I will be used in this phase.
In adddition to phase I and II this phase consist of a web application which will have an interface to input the twilio resgistered phone number and amount of delay in seconds after which you want to call the provided number to play phoneuzz.Using twilio apis it will  will make outbound call to the number specified after specified delay.
Further user will be prompted to play phonebuzz similar to phase I


<b>Steps to Deploy</b><br>
[1] Clone or Download the project from the repository<br>
[2] Make sure you have followed steps specified in the phase I<br>
[3] Edit the serviceURL variable specified in the VoiceServlet.java to the newly generated URL in the phase I i.e "http://xxxxx/phase1/twiml"<br>
[4] Run a maven "Clean install" command on the above project which will generate "phase3.war" in target folder<br>
[5] Deploy phase3.war on tomcat<br> 
[6] Assuming phase3.war is running on localhost on port 8080 open "https://localhost:8080/phase3/"  which will present to you the following attached web interface<br>
[7] You are all set to test phonebuzz and make a call to your twilio account phone number<br><br>
<b>Technology Used:</b> Java Servlet,Maven,ngrok server,apcahe tomcat 7 server

![alt tag](https://cloud.githubusercontent.com/assets/1969061/21173586/a8f15620-c195-11e6-970a-e53e8eb0efc7.png)



