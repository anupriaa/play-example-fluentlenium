package controllers;

import models.Person;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import static play.data.Form.form;
import views.html.Index;

/**
 * The controller supporting two actions. Display shows the Index page without the results
 * of any prior form submission.  Submit processes the form submission from the Index page
 * and shows the results through a redisplay of the Index page.
 * 
 * @author Philip Johnson
 */
public class Application extends Controller {
  /** The person form. */
  public static Form<Person> personForm = form(Person.class);

  /**
   * @return The Index page upon initial display. No prior data.
   */
  public static Result display() {
    return ok(Index.render(personForm, "(None)", "(None)"));
  }

  /**
   * @return The Index page after processing a submission.
   */
  public static Result submit() {
    Person person = form(Person.class).bindFromRequest().get();
    return ok(Index.render(personForm, person.name, person.gender));
  }

}
