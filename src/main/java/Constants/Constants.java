package Constants;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Constants {

	public static String REMOTE_URL = System.getProperty("remoteurl");

	public static String URL = "https://d23n8hprwcya6o.cloudfront.net";
	public static String ATLAS_URL = "https://qa-atlas.lha.pharma.solutions/";
	public static String ADMIN_URL = "https://d1q473yljb185n.cloudfront.net/";
	public static String Username = "nikita.danilevskiy@pharma.solutions";
	public static String Password = "Testing2022!!";
	public static String outlookUrl = "https://outlook.live.com/owa/";
	public static String outlookUsername = "nikita.danilevskiy@pharma.solutions";
	public static String outlookPassword = "Shlyapa2";


	public static int PROJECT_ID = 3;
	public static int SUITE_ID = 3;
	public static String TEST_RAIL_USER = "nikita.danilevskiy@pharma.solutions";
	public static String TEST_RAIL_PASSWORD = "Testing2022!!";
	public static String TEST_RAIL_URL = "https://pharmasolutions.testrail.com";

	public final static String DOMAIN_NAME ="QA";
	public final static String SUITE_NAME = System.getProperty("suiteXmlFile", "All Tests");
	public static long TEST_RAIL_RUN_ID = Integer.parseInt(System.getProperty("testRunId", "0"));
	public final static String TEST_RAIL_RUN_NAME = System.getProperty("testRunName");

	public static String CURRENT_TIME;

	static {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDateTime now = LocalDateTime.now();

		CURRENT_TIME = dtf.format(now);
	}
	public final static boolean SEND_RESULT_TO_TESTRAIL = Boolean.parseBoolean(System.getProperty("sendResultToRestRail", "false"));
	public final static boolean SEND_RESULT_TO_TESTRAIL_CUCUMBER = Boolean.parseBoolean(System.getProperty("sendResultToRestRail", "false"));


}
