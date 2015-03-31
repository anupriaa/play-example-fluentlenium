package tests;

import org.junit.Test;
import play.test.TestBrowser;
import play.libs.F.Callback;
import static play.test.Helpers.HTMLUNIT;
import static play.test.Helpers.inMemoryDatabase;
import static play.test.Helpers.fakeApplication;
import static play.test.Helpers.testServer;
import static play.test.Helpers.running;
import static org.fest.assertions.Assertions.assertThat;
import tests.pages.IndexPage;

/**
 * Sample "integration" test, using the functioning webapp. 
 * @author Philip Johnson
 */
public class IntegrationTest {
  /** The port to be used for testing. */
  private final int port = 3333;

  /**
   * Sample test that submits a form and then checks that form data was echoed to page. 
   */
  @Test
  public void test() {
    running(testServer(port, fakeApplication(inMemoryDatabase())), HTMLUNIT,
        new Callback<TestBrowser>() {
          public void invoke(TestBrowser browser) {
            browser.maximizeWindow();
            IndexPage indexPage = new IndexPage(browser.getDriver(), port);
            browser.goTo(indexPage);
            indexPage.isAt();
            String name = "Test Name";
            String gender = "Female";
            indexPage.submitForm(name, gender);
            assertThat(browser.pageSource()).contains("Last Gender: " + gender);
            assertThat(browser.pageSource()).contains("Last Name: " + name);
          }
        });
  }
}
