package htmlunit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlSubmitInput;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;

public class HtmlUnitAndJUnitLiveTest {
	private WebClient webClient;

	@Before
	public void init() throws Exception {
		webClient = new WebClient();
	}

	@After
	public void close() throws Exception {
		webClient.close();
	}

	@Test
	public void givenAClient_whenEnteringBaeldung_thenPageTitleIsOk() throws Exception {
		webClient.getOptions().setThrowExceptionOnScriptError(false);
		HtmlPage page = webClient.getPage("http://localhost:8080/list");
		Assert.assertEquals("University Enrollments", page.getTitleText());
	}
	@Test
	public void givenAMessage_whenSent_thenItShows() throws Exception {
		String text = "Hello world!";
		HtmlPage page;

		String url = "http://localhost/message/showForm";
		page = webClient.getPage(url);

		HtmlTextInput messageText = page.getHtmlElementById("message");
		messageText.setValueAttribute(text);

		HtmlForm form = page.getForms().get(0);
		HtmlSubmitInput submit = form.getOneHtmlElementByAttribute("input", "type", "submit");
		HtmlPage newPage = submit.click();

		String receivedText = newPage.getHtmlElementById("received").getTextContent();

		Assert.assertEquals(receivedText, text);
	}
}
