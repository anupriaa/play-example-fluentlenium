package tests.pages;

import org.fluentlenium.core.FluentPage;
import org.openqa.selenium.WebDriver;
import static org.fluentlenium.core.filter.FilterConstructor.withText; 
import static org.fluentlenium.core.filter.FilterConstructor.withId;  
import static org.fest.assertions.Assertions.assertThat;

/**
 * Provides testing support for the Index page.
 * @author Philip Johnson
 */
public class IndexPage extends FluentPage {
  private String url;
  
  /**
   * Create the IndexPage.
   * @param webDriver The driver.
   * @param port The port.
   */
  public IndexPage(WebDriver webDriver, int port) {
    super(webDriver);
    this.url = "http://localhost:" + port;
  }
  
  @Override
  public String getUrl() {
    return this.url;
  }
  
  @Override
  public void isAt() {
    assertThat(title()).isEqualTo("Index");
  }
  
  /**
   * Set the form to the passed values, then submit it.
   * @param name The form name data.
   * @param gender The form gender value. 
   */
  public void submitForm(String name, String gender) {
    // Fill the input field with id "name" with the passed name string.
    fill("#name").with(name);
    // Find the menu with id "gender", and click the menu item equal to the passed gender string.
    find("select", withId().equalTo("gender")).find("option", withText().equalTo(gender)).click();
    //Submit the form whose id is "submit"
    submit("#submit");
  }
  
  
}
