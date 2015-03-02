package controllers

import play.api._
import play.api.mvc._

object Application extends Controller with ChangeLanguage {

  def hello(name: String) = Action {
    Ok("Hello " + name)
  }
  def index = Action { implicit request =>
    Ok(views.html.index())
  }

}