package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.Index;
import views.html.sp;
import views.html.fs;
import views.html.af;
import views.html.contact;

/**
 * Provides controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page.
   * @return The resulting home page.
   */
  public static Result index() {
    return ok(Index.render("Welcome to the home page."));
  }

  /**
   * Returns the sp page.
   * @return The resulting sp page.
   */
  public static Result sp() {
    return ok(sp.render("Welcome to the home page."));
  }

  /**
   * Returns the fs page.
   * @return The resulting fs page.
   */
  public static Result fs() {
    return ok(fs.render("Welcome to the home page."));
  }

  /**
   * Returns the af page.
   * @return The resulting af page.
   */
  public static Result af() {
    return ok(af.render("Welcome to the home page."));
  }

  /**
   * Returns the contact page.
   * @return The resulting contact page.
   */
  public static Result contact() {
    return ok(contact.render("Welcome to the home page."));
  }

}
